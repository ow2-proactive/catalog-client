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

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import io.swagger.client.api.CatalogObjectControllerApi;


@RunWith(MockitoJUnitRunner.class)
public class CatalogObjectServiceTest {

    @Mock
    private RemoteObjectService remoteObjectService;

    @Mock
    private CatalogObjectControllerApi catalogObjectControllerApi;

    @InjectMocks
    private CatalogResolveObjectControllerApi catalogResolveObjectControllerApi;

    private static final String CATALOG_URL = "http://localhost:8080/catalog";

    private static final String REMOTE_URL = "localhost:8080/test/example.txt";

    private static final String REMOTE_URL2 = "localhost:8080/test/example2.txt";

    private static final String REMOTE_VALUE = "remoteValue";

    private static final String REMOTE_VALUE2 = "remoteValue2";

    private static final String BUCKET_NAME = "testBucket";

    private static final String OBJECT_NAME = "object";

    private static final String CATALOG_RESOURCE_URL = CATALOG_URL + "/buckets/"+BUCKET_NAME+"/resources/"+OBJECT_NAME;

    private static final String CATALOG_RESOURCE_URL_RAW = CATALOG_RESOURCE_URL + "/raw";

    private static final String SESSION_ID = "sessionIdMock";

    @Test
    public void testGetRequestWithMetadataURLWithEndingSlash() {
        assertThat(catalogResolveObjectControllerApi.getURL(CATALOG_URL + "/", BUCKET_NAME, OBJECT_NAME, false)).isEqualTo(CATALOG_RESOURCE_URL);
    }

    @Test
    public void testGetRequestWithMetadataURLWithoutEndingSlash() {
        assertThat(catalogResolveObjectControllerApi.getURL(CATALOG_URL, BUCKET_NAME, OBJECT_NAME, false)).isEqualTo(CATALOG_RESOURCE_URL);
    }

    @Test
    public void testGetRequestWithRawURLWithEndingSlash() {
        assertThat(catalogResolveObjectControllerApi.getURL(CATALOG_URL + "/",
                                               BUCKET_NAME,
                                               OBJECT_NAME,
                                               true)).isEqualTo(CATALOG_RESOURCE_URL_RAW);

    }

    @Test
    public void testGetRequestWithRawURLWithoutEndingSlash() {
        assertThat(catalogResolveObjectControllerApi.getURL(CATALOG_URL, BUCKET_NAME, OBJECT_NAME, true)).isEqualTo(CATALOG_RESOURCE_URL_RAW);
    }

    @Test
    public void testGetRequestWithAResourceWithOneReplacement() throws IOException {

        when(remoteObjectService.getStringOnUrl(REMOTE_URL, SESSION_ID)).thenReturn(REMOTE_VALUE);
        when(catalogObjectControllerApi.getRawUsingGET(BUCKET_NAME,OBJECT_NAME,SESSION_ID))
                .thenReturn(getFileFromRelativeUrl("workflows/workflowWithPAGetFromURL.xml"));

        String replacedWorkflow = catalogResolveObjectControllerApi.getResolvedCatalogObject(BUCKET_NAME,
                                                                                OBJECT_NAME,
                                                                                true,
                                                                                SESSION_ID);
        assertThat(replacedWorkflow).isEqualTo(getWorkflowString("workflows/workflowWithPAGetFromURLReplaced.xml"));

        verify(remoteObjectService, times(1)).getStringOnUrl(REMOTE_URL, SESSION_ID);
        verify(catalogObjectControllerApi,times(1)).getRawUsingGET(BUCKET_NAME,OBJECT_NAME,SESSION_ID);
    }

    @Test
    public void testGetRequestWithAResourceWithSeveralReplacements() throws IOException {

        when(remoteObjectService.getStringOnUrl(REMOTE_URL, SESSION_ID)).thenReturn(REMOTE_VALUE);
        when(remoteObjectService.getStringOnUrl(REMOTE_URL2, SESSION_ID)).thenReturn(REMOTE_VALUE2);
        when(catalogObjectControllerApi.getRawUsingGET(BUCKET_NAME,OBJECT_NAME,SESSION_ID))
                .thenReturn(getFileFromRelativeUrl("workflows/workflowWithSeveralPAGetFromURL.xml"));

        String replacedWorkflow = catalogResolveObjectControllerApi.getResolvedCatalogObject(BUCKET_NAME,
                                                                                OBJECT_NAME,
                                                                                true,
                                                                                SESSION_ID);
        assertThat(replacedWorkflow).isEqualTo(getWorkflowString("workflows/workflowWithSeveralPAGetFromURLReplaced.xml"));

        verify(remoteObjectService, times(2)).getStringOnUrl(REMOTE_URL, SESSION_ID);
        verify(remoteObjectService, times(1)).getStringOnUrl(REMOTE_URL2, SESSION_ID);
        verify(catalogObjectControllerApi, times(1)).getRawUsingGET(BUCKET_NAME,OBJECT_NAME,SESSION_ID);
    }

    private String getWorkflowString(String path) throws IOException {
        return Files.toString(getFileFromRelativeUrl(path), Charset.forName(Charsets.UTF_8.name()));
    }

    private File getFileFromRelativeUrl(String path){
        URL relativeUrl = CatalogResolveObjectControllerApi.class.getClassLoader().getResource(path);
        return new File(relativeUrl.getPath());
    }

}
