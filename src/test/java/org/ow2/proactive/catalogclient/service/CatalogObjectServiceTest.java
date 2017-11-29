/*
 * ProActive Parallel Suite(TM):
 * The Open Source library for parallel and distributed
 * Workflows & Scheduling, Orchestration, Cloud Automation
 * and Big Data Analysis on Enterprise Grids & Clouds.
 *
 * Copyright (c) 2007 - 2017 ActiveEon
 * Contact: contact@activeeon.com
 *
 * This library is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation: version 3 of
 * the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * If needed, contact us to obtain a release under GPL Version 2 or 3
 * or a different license than the AGPL.
 */
package org.ow2.proactive.catalogclient.service;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.ow2.proactive.catalogclient.model.CatalogObject;

import com.google.common.io.Files;


@RunWith(MockitoJUnitRunner.class)
public class CatalogObjectServiceTest {

    @Mock
    private RemoteObjectService remoteObjectService;

    @InjectMocks
    private CatalogObjectService catalogObjectService;

    private static final String CATALOG_URL = "http://localhost:8080/catalog";

    private static final String REMOTE_URL = "localhost:8080/test/example.txt";

    private static final String REMOTE_URL2 = "localhost:8080/test/example2.txt";

    private static final String REMOTE_VALUE = "remoteValue";

    private static final String REMOTE_VALUE2 = "remoteValue2";

    private static final String CATALOG_RESOURCE_URL = CATALOG_URL + "/buckets/test-bucket/resources/object";

    private static final String CATALOG_RESOURCE_URL_RAW = CATALOG_RESOURCE_URL + "/raw";

    private static final String SESSION_ID = "sessionIdMock";

    @Test
    public void testGetRequestWithMetadataURLWithEndingSlash() {
        assertThat(catalogObjectService.getURL(CATALOG_URL + "/",
                                               "test-bucket",
                                               "object",
                                               false)).isEqualTo(CATALOG_RESOURCE_URL);
    }

    @Test
    public void testGetRequestWithMetadataURLWithoutEndingSlash() {
        assertThat(catalogObjectService.getURL(CATALOG_URL,
                                               "test-bucket",
                                               "object",
                                               false)).isEqualTo(CATALOG_RESOURCE_URL);

    }

    @Test
    public void testGetRequestWithRawURLWithEndingSlash() {
        assertThat(catalogObjectService.getURL(CATALOG_URL + "/",
                                               "test-bucket",
                                               "object",
                                               true)).isEqualTo(CATALOG_RESOURCE_URL_RAW);

    }

    @Test
    public void testGetRequestWithRawURLWithoutEndingSlash() {
        assertThat(catalogObjectService.getURL(CATALOG_URL,
                                               "test-bucket",
                                               "object",
                                               true)).isEqualTo(CATALOG_RESOURCE_URL_RAW);
    }

    @Test
    public void testThatGetRawRequestReturnTheRawCatalogObject() {
        String returnedObject = "{ \"raw\":\"value\"}";
        String objectURL = CATALOG_RESOURCE_URL_RAW;
        when(remoteObjectService.getStringOnUrl(objectURL, SESSION_ID)).thenReturn(returnedObject);
        String result = catalogObjectService.getRawCatalogObject(CATALOG_URL, "test-bucket", "object", SESSION_ID);
        assertThat(result).isEqualTo(returnedObject);
        verify(remoteObjectService, times(1)).getStringOnUrl(objectURL, SESSION_ID);
    }

    @Test
    public void testThatGetRequestReturnTheCatalogObject() {

        CatalogObject expectedResult = new CatalogObject.Builder("test-bucket",
                                                                 "object",
                                                                 "workflow",
                                                                 "application/xml",
                                                                 "First commit").build();

        when(remoteObjectService.getObjectOnUrl(CATALOG_RESOURCE_URL,
                                                SESSION_ID,
                                                CatalogObject.class)).thenReturn(expectedResult);
        CatalogObject result = catalogObjectService.getCatalogObjectMetadata(CATALOG_URL,
                                                                             "test-bucket",
                                                                             "object",
                                                                             SESSION_ID);
        assertThat(result).isEqualTo(expectedResult);
        verify(remoteObjectService, times(1)).getObjectOnUrl(CATALOG_RESOURCE_URL, SESSION_ID, CatalogObject.class);
    }

    @Test
    public void testGetRequestWithAResourceWithOneReplacement() throws IOException {
        when(remoteObjectService.getStringOnUrl(CATALOG_RESOURCE_URL_RAW,
                                                SESSION_ID)).thenReturn(getWorkflowString("workflows/workflowWithPAGetFromURL.xml"));
        when(remoteObjectService.getStringOnUrl(REMOTE_URL, SESSION_ID)).thenReturn(REMOTE_VALUE);

        String replacedWorkflow = catalogObjectService.getResolvedCatalogObject(CATALOG_URL,
                                                                                "test-bucket",
                                                                                "object",
                                                                                true,
                                                                                SESSION_ID);
        assertThat(replacedWorkflow).isEqualTo(getWorkflowString("workflows/workflowWithPAGetFromURLReplaced.xml"));

        verify(remoteObjectService, times(1)).getStringOnUrl(CATALOG_RESOURCE_URL_RAW, SESSION_ID);
        verify(remoteObjectService, times(1)).getStringOnUrl(REMOTE_URL, SESSION_ID);
    }

    @Test
    public void testGetRequestWithAResourceWithSeveralReplacements() throws IOException {
        when(remoteObjectService.getStringOnUrl(CATALOG_RESOURCE_URL_RAW,
                                                SESSION_ID)).thenReturn(getWorkflowString("workflows/workflowWithSeveralPAGetFromURL.xml"));
        when(remoteObjectService.getStringOnUrl(REMOTE_URL, SESSION_ID)).thenReturn(REMOTE_VALUE);
        when(remoteObjectService.getStringOnUrl(REMOTE_URL2, SESSION_ID)).thenReturn(REMOTE_VALUE2);

        String replacedWorkflow = catalogObjectService.getResolvedCatalogObject(CATALOG_URL,
                                                                                "test-bucket",
                                                                                "object",
                                                                                true,
                                                                                SESSION_ID);
        assertThat(replacedWorkflow).isEqualTo(getWorkflowString("workflows/workflowWithSeveralPAGetFromURLReplaced.xml"));

        verify(remoteObjectService, times(1)).getStringOnUrl(CATALOG_RESOURCE_URL_RAW, SESSION_ID);
        verify(remoteObjectService, times(2)).getStringOnUrl(REMOTE_URL, SESSION_ID);
        verify(remoteObjectService, times(1)).getStringOnUrl(REMOTE_URL2, SESSION_ID);
    }

    private String getWorkflowString(String path) throws IOException {
        URL relativeUrl = CatalogObjectService.class.getClassLoader().getResource(path);
        File workflowFile = new File(relativeUrl.getPath());
        return Files.toString(workflowFile, Charset.forName("UTF-8"));
    }

}
