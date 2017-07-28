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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GetFromURLService {

    @Autowired
    private CatalogObjectService catalogObjectService;

    @Autowired
    private RemoteObjectService remoteObjectService;

    @Autowired
    private ServiceConfiguration serviceConfiguration;

    private static final String GET_FROM_URL = "PA:GET_FROM_URL";

    private static final String URL_REGEX = "(.*?)";

    private static final String CATCH_URL_REGEX_WITH_HTML_QUOTE = "&quot;" + URL_REGEX + "&quot;";

    private static final String CATCH_URL_REGEX = "\\\"" + URL_REGEX + "\\\"";

    private static final String GET_FROM_URL_PATTERN = GET_FROM_URL + "\\(((" + CATCH_URL_REGEX + ")|(" +
                                                       CATCH_URL_REGEX_WITH_HTML_QUOTE + "))\\)";

    /**
     * Get a resource from the catalog and resolve PA:GET_FROM_URL("url") if necessary
     * @param bucketId is the resource bucket id
     * @param myResourceID is the resource name
     * @param resolveLinks on true replace PA:GET_FROM_URL("url") by its value otherwise return the raw resource
     * @return a string which contains the
     */
    public String getResource(long bucketId, String myResourceID, boolean resolveLinks) {

        Pattern pattern = Pattern.compile(GET_FROM_URL_PATTERN);

        String resource = catalogObjectService.getRawCatalogObject(serviceConfiguration.getCatalogURL(),
                                                                   bucketId,
                                                                   myResourceID);
        if (!resolveLinks) {
            return resource;
        }
        Matcher tokenMatcher = pattern.matcher(resource);
        String resourceURL;
        while (tokenMatcher.find()) {
            resourceURL = extractURLFromToken(tokenMatcher.group());
            resource = tokenMatcher.replaceFirst((String) remoteObjectService.sendRequest(resourceURL, String.class));
            tokenMatcher.reset(resource);
        }
        return resource;
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
