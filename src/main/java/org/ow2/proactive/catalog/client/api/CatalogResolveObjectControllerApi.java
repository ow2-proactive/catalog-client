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
package org.ow2.proactive.catalog.client.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.ow2.proactive.catalog.client.service.RemoteObjectService;

import lombok.Getter;
import lombok.Setter;


/**
 *  This service enables to query the catalog service
 */
public class CatalogResolveObjectControllerApi {

    @Getter
    @Setter
    private CatalogObjectControllerApi catalogObjectControllerApi;

    @Getter
    @Setter
    private RemoteObjectService remoteObjectService;

    public static final String GET_FROM_URL = "PA:GET_FROM_URL";

    private static final String URL_REGEX = "(.*?)";

    private static final String CATCH_URL_REGEX_WITH_HTML_QUOTE = "&quot;" + URL_REGEX + "&quot;";

    private static final String CATCH_URL_REGEX = "\\\"" + URL_REGEX + "\\\"";

    private static final String GET_FROM_URL_PATTERN = GET_FROM_URL + "\\(((" + CATCH_URL_REGEX + ")|(" +
                                                       CATCH_URL_REGEX_WITH_HTML_QUOTE + "))\\)";

    public CatalogResolveObjectControllerApi() {
        this(new CatalogObjectControllerApi(), new RemoteObjectService());
    }

    public CatalogResolveObjectControllerApi(CatalogObjectControllerApi catalogObjectControllerApi,
            RemoteObjectService remoteObjectService) {
        this.catalogObjectControllerApi = catalogObjectControllerApi;
        this.remoteObjectService = remoteObjectService;
    }

    /**
     * Get a resource from the catalog and resolve PA:GET_FROM_URL("url") if necessary
     * @param bucketName is the resource bucket id
     * @param myResourceId is the resource name
     * @param resolveLinks on true replace PA:GET_FROM_URL("url") by its value otherwise return the raw resource
     * @return a string which contains the
     */
    public String getResolvedCatalogObject(String bucketName, String myResourceId, boolean resolveLinks,
            String sessionId) {

        Pattern pattern = Pattern.compile(GET_FROM_URL_PATTERN);

        String resource = getCatalogObjectAsString(bucketName, myResourceId, sessionId);

        if (!resolveLinks) {
            return resource;
        }
        Matcher tokenMatcher = pattern.matcher(resource);
        String resourceURL;
        while (tokenMatcher.find()) {
            resourceURL = extractURLFromToken(tokenMatcher.group());
            resource = tokenMatcher.replaceFirst(remoteObjectService.getStringOnUrl(resourceURL, sessionId));
            tokenMatcher.reset(resource);
        }
        return resource;
    }

    private String getCatalogObjectAsString(String bucketName, String objectName, String sessionId) {
        return catalogObjectControllerApi.getRaw1(bucketName, objectName, sessionId);
    }

    /**
     * Generate the catalog URL from the argument
     * @param catalogURL is the domain name
     * @param bucketName is the id of bucket containing the resource
     * @param name is the resource name
     * @param raw enables to choose for the resource metadata or the resource content
     * @return the resource content if raw is true otherwise return the resource metadata
     */
    String getURL(String catalogURL, String bucketName, String name, boolean raw) {

        final String bucketsPath = "buckets/";
        final String resourcesPath = "/resources/";
        final String rawPath = "/raw";

        return catalogURL + (catalogURL.endsWith("/") ? "" : "/") + bucketsPath + bucketName + resourcesPath + name +
               (raw ? rawPath : "");
    }

    private String extractURLFromToken(String token) {
        if (token.endsWith("\")")) {
            String result = token.replaceFirst(GET_FROM_URL + "\\(\"", "");
            return result.replaceFirst("\"\\)", "");
        } else {
            String result = token.replaceFirst(GET_FROM_URL + "\\(&quot;", "");
            return result.replaceFirst("&quot;\\)", "");
        }
    }
}
