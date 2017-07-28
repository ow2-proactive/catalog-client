package org.ow2.proactive.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.ow2.proactive.exception.EntityTooLargeException;
import org.ow2.proactive.exception.FailedRequestException;
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
    public Object sendRequest(String url, Class returnClass){
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
            throw new FailedRequestException(message);
        } catch (URISyntaxException e) {
            String message = "The url '" + url + "' is ill-formed.";
            log.info(message, e);
            throw new FailedRequestException(message);
        }
    }
}
