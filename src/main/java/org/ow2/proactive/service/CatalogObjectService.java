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

import java.net.URI;
import java.net.URISyntaxException;

import org.ow2.proactive.exception.EntityTooLargeException;
import org.ow2.proactive.exception.FailedRequestException;
import org.ow2.proactive.model.CatalogObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.google.common.annotations.VisibleForTesting;

import lombok.extern.log4j.Log4j2;


/**
 *  This service enables to query the catalog service
 */
@Service
@Log4j2
public class CatalogObjectService {

    private static final String BUCKETS_PATH = "buckets/";

    private static final String RESOURCES_PATH = "/resources/";

    private static final String RAW_PATH = "/raw";

    @Autowired
    private RemoteObjectService remoteObjectService;

    /**
     * Get the metadata of a catalog object
     * @param catalogURL is the catalog url
     * @param bucketId is the bucket containing the object id
     * @param name is the object name
     * @return a Catalog Object containing the object information
     */
    public CatalogObject getCatalogObjectMetadata(String catalogURL, long bucketId, String name) {

        final String url = getURL(catalogURL, bucketId, name, false);
        return (CatalogObject) remoteObjectService.sendRequest(url,CatalogObject.class);
    }

    /**
     * Get an object from the catalog
     * @param catalogURL is the catalog url
     * @param bucketId is the bucket containing the object id
     * @param name is the object name
     * @return a Catalog Object containing the object information
     */
    public String getRawCatalogObject(String catalogURL, long bucketId, String name) {

        final String url = getURL(catalogURL, bucketId, name, true);
        return (String) remoteObjectService.sendRequest(url,String.class);
    }



    @VisibleForTesting
    String getURL(String catalogURL, long bucketId, String name, boolean raw) {
        return catalogURL + (catalogURL.endsWith("/") ? "" : "/") + BUCKETS_PATH + bucketId + RESOURCES_PATH + name +
               (raw ? RAW_PATH : "");
    }
}
