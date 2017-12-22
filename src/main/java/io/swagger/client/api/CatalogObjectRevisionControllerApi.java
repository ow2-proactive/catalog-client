package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.CatalogObjectMetadata;
import java.io.File;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-22T17:17:55.479+01:00")
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
    public CatalogObjectMetadata createUsingPOST2(String bucketName, String name, String commitMessage, File file, String sessionID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketName' when calling createUsingPOST2");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createUsingPOST2");
        }
        
        // verify the required parameter 'commitMessage' is set
        if (commitMessage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commitMessage' when calling createUsingPOST2");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'file' when calling createUsingPOST2");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}/revisions").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "commitMessage", commitMessage));
        
        if (sessionID != null)
        headerParams.add("sessionID", apiClient.parameterToString(sessionID));
        
        if (file != null)
            formParams.add("file", new FileSystemResource(file));

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CatalogObjectMetadata> returnType = new ParameterizedTypeReference<CatalogObjectMetadata>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
     * @param commitTime commitTime
     * @param sessionID sessionID
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File getRawUsingGET1(String bucketName, String name, Long commitTime, String sessionID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketName' when calling getRawUsingGET1");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getRawUsingGET1");
        }
        
        // verify the required parameter 'commitTime' is set
        if (commitTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commitTime' when calling getRawUsingGET1");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        uriVariables.put("commitTime", commitTime);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}/revisions/{commitTime}/raw").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
     * @param commitTime commitTime
     * @param sessionID sessionID
     * @return CatalogObjectMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CatalogObjectMetadata getUsingGET1(String bucketName, String name, Long commitTime, String sessionID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketName' when calling getUsingGET1");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getUsingGET1");
        }
        
        // verify the required parameter 'commitTime' is set
        if (commitTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commitTime' when calling getUsingGET1");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        uriVariables.put("commitTime", commitTime);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}/revisions/{commitTime}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CatalogObjectMetadata> returnType = new ParameterizedTypeReference<CatalogObjectMetadata>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
    public List<CatalogObjectMetadata> listUsingGET2(String bucketName, String name, String sessionID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucketName' when calling listUsingGET2");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling listUsingGET2");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucketName", bucketName);
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/buckets/{bucketName}/resources/{name}/revisions").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<CatalogObjectMetadata>> returnType = new ParameterizedTypeReference<List<CatalogObjectMetadata>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
