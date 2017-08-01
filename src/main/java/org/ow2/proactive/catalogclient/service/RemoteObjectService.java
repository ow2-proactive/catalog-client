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

import java.net.URI;
import java.net.URISyntaxException;

import org.ow2.proactive.catalogclient.exception.EntityTooLargeException;
import org.ow2.proactive.catalogclient.exception.FailedRequestException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import lombok.extern.log4j.Log4j2;


/**
 * This class enables to send request to remote server
 */
@Service
@Log4j2
public class RemoteObjectService {

    //max length response equal 1 MB
    private static final long MAX_LENGTH = 1000000;

    /**
     * Send a POST request on url returning a returnClass object
     * @param url is the url where the post request will be sent
     * @param returnClass is the class type of the response
     * @return a returnClass object created from the server response
     */
    public Object sendRequest(String url, Class returnClass) {
        try {
            long resourceLength = new RestTemplate().headForHeaders(new URI(url)).getContentLength();
            if (resourceLength > MAX_LENGTH) {
                String message = "Get on url " + url + " failed because response size length " + resourceLength +
                                 " is higher than max size " + MAX_LENGTH;
                log.info(message);
                throw new EntityTooLargeException(message);
            }

            return new RestTemplate().getForObject(url, returnClass);

        } catch (RestClientException e) {
            String message = "Get request on the URL " + url + " failed. The server response was " +
                             e.getLocalizedMessage();
            log.info(message, e);
            throw new FailedRequestException(message, e);
        } catch (URISyntaxException e) {
            String message = "The url '" + url + "' is ill-formed.";
            log.info(message, e);
            throw new FailedRequestException(message, e);
        }
    }
}
