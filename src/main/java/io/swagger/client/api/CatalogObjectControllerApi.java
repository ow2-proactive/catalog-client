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
import io.swagger.client.model.CatalogObjectMetadataList;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-08T12:41:35.988+01:00")
@Component("io.swagger.client.api.CatalogObjectControllerApi")
public class CatalogObjectControllerApi {
    private ApiClient apiClient;

    public CatalogObjectControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public CatalogObjectControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a new catalog object
     * 
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Bucket not found
     * <p><b>422</b> - Invalid file content supplied
     * @param bucketName bucketName
     * @param kind Kind of the new object
     * @param commitMessage Commit message
     * @param objectContentType The content type of CatalogRawObject - MIME type
     * @param file The content of CatalogRawObject
     * @param sessionID sessionID
     * @param name Name of the object or empty when a ZIP archive is uploaded (All objects inside the archive are stored inside the catalog).
     * @return CatalogObjectMetadataList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CatalogObjectMetadataList createUsingPOST1(String bucketName, String kind, String commitMessage,
            String objectContentType, File file, String sessionID, String name) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'bucketName' when calling createUsingPOST1");
        }

        // verify the required parameter 'kind' is set
        if (kind == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'kind' when calling createUsingPOST1");
        }

        // verify the required parameter 'commitMessage' is set
        if (commitMessage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'commitMessage' when calling createUsingPOST1");
        }

        // verify the required parameter 'objectContentType' is set
        if (objectContentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'objectContentType' when calling createUsingPOST1");
        }

        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'file' when calling createUsingPOST1");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources")
                                          .buildAndExpand(uriVariables)
                                          .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kind", kind));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "commitMessage", commitMessage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "objectContentType", objectContentType));

        if (sessionID != null)
            headerParams.add("sessionID", apiClient.parameterToString(sessionID));

        if (file != null)
            formParams.add("file", new FileSystemResource(file));

        final String[] accepts = { "*/*" };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { "multipart/form-data" };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        ParameterizedTypeReference<CatalogObjectMetadataList> returnType = new ParameterizedTypeReference<CatalogObjectMetadataList>() {
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
     * Delete a catalog object
     * Delete the entire catalog object as well as its revisions. Returns the deleted CatalogRawObject&#39;s metadata
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Bucket or object not found
     * @param bucketName bucketName
     * @param name name
     * @param sessionID sessionID
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object deleteUsingDELETE1(String bucketName, String name, String sessionID) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'bucketName' when calling deleteUsingDELETE1");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'name' when calling deleteUsingDELETE1");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}")
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

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {
        };
        return apiClient.invokeAPI(path,
                                   HttpMethod.DELETE,
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
     * Gets the raw content of the last revision of a catalog object
     * 
     * <p><b>200</b> - Ok
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Bucket, catalog object or catalog object revision not found
     * @param bucketName bucketName
     * @param name name
     * @param sessionID sessionID
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String getRawUsingGET(String bucketName, String name, String sessionID) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'bucketName' when calling getRawUsingGET");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'name' when calling getRawUsingGET");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}/raw")
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
     * Gets a catalog object&#39;s metadata by IDs
     * Returns metadata associated to the latest revision of the catalog object.
     * <p><b>200</b> - OK
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Bucket or catalog object not found
     * @param bucketName bucketName
     * @param name name
     * @param sessionID sessionID
     * @return CatalogObjectMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CatalogObjectMetadata getUsingGET(String bucketName, String name, String sessionID)
            throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'bucketName' when calling getUsingGET");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'name' when calling getUsingGET");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}")
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
     * Lists catalog objects metadata
     * Returns catalog objects metadata associated to the latest revision.
     * <p><b>200</b> - OK
     * <p><b>206</b> - Missing object
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Bucket not found
     * @param bucketName bucketName
     * @param sessionID sessionID
     * @param kind Filter according to kind.
     * @param name Give a list of name separated by comma to get them in an archive
     * @return List&lt;CatalogObjectMetadata&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CatalogObjectMetadata> listUsingGET1(String bucketName, String sessionID, String kind, String name)
            throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'bucketName' when calling listUsingGET1");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources")
                                          .buildAndExpand(uriVariables)
                                          .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kind", kind));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

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

    /**
     * Restore a catalog object revision
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Bucket, object or revision not found
     * @param bucketName bucketName
     * @param name name
     * @param commitTimeRaw commitTimeRaw
     * @param sessionID sessionID
     * @return CatalogObjectMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CatalogObjectMetadata restoreUsingPUT(String bucketName, String name, Long commitTimeRaw, String sessionID)
            throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'bucketName' when calling restoreUsingPUT");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'name' when calling restoreUsingPUT");
        }

        // verify the required parameter 'commitTimeRaw' is set
        if (commitTimeRaw == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                                               "Missing the required parameter 'commitTimeRaw' when calling restoreUsingPUT");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}")
                                          .buildAndExpand(uriVariables)
                                          .toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "commitTimeRaw", commitTimeRaw));

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
                                   HttpMethod.PUT,
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
