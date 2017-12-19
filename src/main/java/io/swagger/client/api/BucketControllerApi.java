package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.BucketMetadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-19T10:37:11.145+01:00")
@Component("io.swagger.client.api.BucketControllerApi")
public class BucketControllerApi {
    private ApiClient apiClient;

    public BucketControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public BucketControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete the empty buckets
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void cleanEmptyUsingDELETE() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/buckets").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a new bucket
     * 
     * <p><b>201</b> - Created
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Not Found
     * @param name name
     * @param sessionID sessionID
     * @param owner The name of the user that will own the Bucket
     * @return BucketMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BucketMetadata createUsingPOST(String name, String sessionID, String owner) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createUsingPOST");
        }
        
        String path = UriComponentsBuilder.fromPath("/buckets").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "owner", owner));
        
        if (sessionID != null)
        headerParams.add("sessionID", apiClient.parameterToString(sessionID));

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<BucketMetadata> returnType = new ParameterizedTypeReference<BucketMetadata>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete an empty bucket
     * It&#39;s forbidden to delete a non-empty bucket. You need to delete manually all workflows in the bucket before.
     * <p><b>204</b> - No Content
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Bucket not found
     * @param bucketId bucketId
     * @param sessionID sessionID
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteUsingDELETE(Long bucketId, String sessionID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'bucketId' is set
        if (bucketId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketId' when calling deleteUsingDELETE");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketId", bucketId);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (sessionID != null)
        headerParams.add("sessionID", apiClient.parameterToString(sessionID));

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets a bucket&#39;s metadata by ID
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Bucket not found
     * @param bucketId bucketId
     * @param sessionID sessionID
     * @return BucketMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BucketMetadata getMetadataUsingGET(Long bucketId, String sessionID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'bucketId' is set
        if (bucketId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketId' when calling getMetadataUsingGET");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketId", bucketId);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (sessionID != null)
        headerParams.add("sessionID", apiClient.parameterToString(sessionID));

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<BucketMetadata> returnType = new ParameterizedTypeReference<BucketMetadata>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Lists the buckets
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - Permission denied
     * <p><b>404</b> - Not Found
     * @param sessionID sessionID
     * @param owner The name of the user who owns the Bucket
     * @param kind The kind of objects that buckets must contain
     * @return List&lt;BucketMetadata&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BucketMetadata> listUsingGET(String sessionID, String owner, String kind) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/buckets").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "owner", owner));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kind", kind));
        
        if (sessionID != null)
        headerParams.add("sessionID", apiClient.parameterToString(sessionID));

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<BucketMetadata>> returnType = new ParameterizedTypeReference<List<BucketMetadata>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
