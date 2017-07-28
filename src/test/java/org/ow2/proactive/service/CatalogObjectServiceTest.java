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
package org.ow2.proactive.service;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.ow2.proactive.model.CatalogObject;


@RunWith(MockitoJUnitRunner.class)
public class CatalogObjectServiceTest {

    @Mock
    private RemoteObjectService remoteObjectService;

    @InjectMocks
    private CatalogObjectService catalogObjectService;

    private static final String CATALOG_URL = "http://localhost:8080/catalog";

    @Test
    public void getMetadataURLWithEndingSlash() {
        assertThat(catalogObjectService.getURL(CATALOG_URL + "/",
                                               3,
                                               "bobot",
                                               false)).isEqualTo("http://localhost:8080/catalog/buckets/3/resources/bobot");
    }

    @Test
    public void getMetadataURLWithoutEndingSlash() {
        assertThat(catalogObjectService.getURL(CATALOG_URL,
                                               3,
                                               "bobot",
                                               false)).isEqualTo("http://localhost:8080/catalog/buckets/3/resources/bobot");

    }

    @Test
    public void getRawURLWithEndingSlash() {
        assertThat(catalogObjectService.getURL(CATALOG_URL + "/",
                                               3,
                                               "bobot",
                                               true)).isEqualTo("http://localhost:8080/catalog/buckets/3/resources/bobot/raw");

    }

    @Test
    public void getRawURLWithoutEndingSlash() {
        assertThat(catalogObjectService.getURL(CATALOG_URL,
                                               3,
                                               "bobot",
                                               true)).isEqualTo("http://localhost:8080/catalog/buckets/3/resources/bobot/raw");
    }

    @Test
    public void getRawCatalogObjectTest() {
        String returnedObject = "{ \"raw\":\"value\"}";
        String objectURL = CATALOG_URL + "/buckets/0/resources/bobot/raw";
        when(remoteObjectService.sendRequest(objectURL, String.class)).thenReturn(returnedObject);
        String result = catalogObjectService.getRawCatalogObject(CATALOG_URL, 0, "bobot");
        assertThat(result).isEqualTo(returnedObject);
        verify(remoteObjectService, times(1)).sendRequest(objectURL, String.class);
    }

    @Test
    public void getCatalogObject() {

        CatalogObject expectedResult = new CatalogObject.Builder(0,
                                                                 "bobot",
                                                                 "workflow",
                                                                 "application/xml",
                                                                 "First commit").build();

        String objectURL = CATALOG_URL + "/buckets/0/resources/bobot";
        when(remoteObjectService.sendRequest(objectURL, CatalogObject.class)).thenReturn(expectedResult);
        CatalogObject result = catalogObjectService.getCatalogObjectMetadata(CATALOG_URL, 0, "bobot");
        assertThat(result).isEqualTo(expectedResult);
        verify(remoteObjectService, times(1)).sendRequest(objectURL, CatalogObject.class);
    }

}
