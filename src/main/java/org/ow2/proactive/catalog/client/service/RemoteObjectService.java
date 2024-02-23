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
package org.ow2.proactive.catalog.client.service;


import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.Configuration;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * This class enables to send request to remote server
 */
public class RemoteObjectService {

    /**
     * Send a GET request on url with a sessionId returning a String object
     * @param url is the url where the get request will be sent
     * @param sessionId is the value to connect to the catalog
     * @return a returnClass object created from the server response
     */
    public String getStringOnUrl(String url, String sessionId) {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        WebTarget target = apiClient.getHttpClient().target(url);
        Invocation.Builder invocationBuilder = target.request();
        invocationBuilder.header("sessionID", sessionId);
        Invocation invocation = invocationBuilder.buildGet();
        Response response = invocation.invoke();
        checkResponse(response);
        return response.readEntity(String.class);
    }

    private void checkResponse(Response response) {
        if (!(200 <= response.getStatus() && response.getStatus() <= 300)) {
            throw new RequestException(response.getStatus() + " " + response.getStatusInfo().getReasonPhrase());
        }
    }

}
