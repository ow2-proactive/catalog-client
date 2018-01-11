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
package io.swagger.client.api;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import io.swagger.client.ApiClient;
import io.swagger.client.model.CatalogObjectMetadata;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-08T12:41:35.988+01:00")
@Component("io.swagger.client.api.CatalogObjectRevisionControllerApi")
public class CatalogObjectRevisionControllerApi {
    private ApiClient apiClient;

    public CatalogObjectRevisionControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public CatalogObjectRevisionControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a new catalog object revision
     * 
     * <p><b>201</b> - Created
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Bucket not found
     * <p><b>422</b> - Invalid catalog object JSON content supplied
     * @param bucketName bucketName
     * @param name name
     * @param commitMessage The commit message of the CatalogRawObject Revision
     * @param file file
     * @param sessionID sessionID
     * @return CatalogObjectMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CatalogObjectMetadata createUsingPOST2(String bucketName, String name, String commitMessage, File file,
            String sessionID) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'bucketName' when calling createUsingPOST2");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'name' when calling createUsingPOST2");
        }

        // verify the required parameter 'commitMessage' is set
        if (commitMessage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'commitMessage' when calling createUsingPOST2");
        }

        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'file' when calling createUsingPOST2");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}/revisions")
                                          .buildAndExpand(uriVariables)
                                          .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "commitMessage", commitMessage));

        if (sessionID != null)
            headerParams.add("sessionID", apiClient.parameterToString(sessionID));

        if (file != null)
            formParams.add("file", new FileSystemResource(file));

        final String[] accepts = { "*/*" };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { "multipart/form-data" };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        ParameterizedTypeReference<CatalogObjectMetadata> returnType = new ParameterizedTypeReference<CatalogObjectMetadata>() {
        };
        return apiClient.invokeAPI(path,
                                   HttpMethod.POST,
                                   queryParams,
                                   postBody,
                                   headerParams,
                                   formParams,
                                   accept,
                                   contentType,
                                   authNames,
                                   returnType);
    }

    /**
     * Gets the raw content of a specific revision
     * 
     * <p><b>200</b> - Ok
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Bucket, catalog object or catalog object revision not found
     * @param bucketName bucketName
     * @param name name
     * @param commitTimeRaw commitTimeRaw
     * @param sessionID sessionID
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String getRawUsingGET1(String bucketName, String name, Long commitTimeRaw, String sessionID)
            throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'bucketName' when calling getRawUsingGET1");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'name' when calling getRawUsingGET1");
        }

        // verify the required parameter 'commitTimeRaw' is set
        if (commitTimeRaw == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'commitTimeRaw' when calling getRawUsingGET1");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        uriVariables.put("commitTimeRaw", commitTimeRaw);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw}/raw")
                                          .buildAndExpand(uriVariables)
                                          .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (sessionID != null)
            headerParams.add("sessionID", apiClient.parameterToString(sessionID));

        final String[] accepts = { "*/*" };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { "application/json" };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
        };
        return apiClient.invokeAPI(path,
                                   HttpMethod.GET,
                                   queryParams,
                                   postBody,
                                   headerParams,
                                   formParams,
                                   accept,
                                   contentType,
                                   authNames,
                                   returnType);
    }

    /**
     * Gets a specific revision
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Bucket, catalog object or catalog object revision not found
     * @param bucketName bucketName
     * @param name name
     * @param commitTimeRaw commitTimeRaw
     * @param sessionID sessionID
     * @return CatalogObjectMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CatalogObjectMetadata getUsingGET1(String bucketName, String name, Long commitTimeRaw, String sessionID)
            throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'bucketName' when calling getUsingGET1");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'name' when calling getUsingGET1");
        }

        // verify the required parameter 'commitTimeRaw' is set
        if (commitTimeRaw == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'commitTimeRaw' when calling getUsingGET1");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        uriVariables.put("commitTimeRaw", commitTimeRaw);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw}")
                                          .buildAndExpand(uriVariables)
                                          .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (sessionID != null)
            headerParams.add("sessionID", apiClient.parameterToString(sessionID));

        final String[] accepts = { "*/*" };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { "application/json" };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        ParameterizedTypeReference<CatalogObjectMetadata> returnType = new ParameterizedTypeReference<CatalogObjectMetadata>() {
        };
        return apiClient.invokeAPI(path,
                                   HttpMethod.GET,
                                   queryParams,
                                   postBody,
                                   headerParams,
                                   formParams,
                                   accept,
                                   contentType,
                                   authNames,
                                   returnType);
    }

    /**
     * Lists a catalog object revisions
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Bucket or catalog object not found
     * @param bucketName bucketName
     * @param name name
     * @param sessionID sessionID
     * @return List&lt;CatalogObjectMetadata&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CatalogObjectMetadata> listUsingGET2(String bucketName, String name, String sessionID)
            throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'bucketName' when calling listUsingGET2");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'name' when calling listUsingGET2");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}/revisions")
                                          .buildAndExpand(uriVariables)
                                          .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (sessionID != null)
            headerParams.add("sessionID", apiClient.parameterToString(sessionID));

        final String[] accepts = { "*/*" };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { "application/json" };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        ParameterizedTypeReference<List<CatalogObjectMetadata>> returnType = new ParameterizedTypeReference<List<CatalogObjectMetadata>>() {
        };
        return apiClient.invokeAPI(path,
                                   HttpMethod.GET,
                                   queryParams,
                                   postBody,
                                   headerParams,
                                   formParams,
                                   accept,
                                   contentType,
                                   authNames,
                                   returnType);
    }
}
