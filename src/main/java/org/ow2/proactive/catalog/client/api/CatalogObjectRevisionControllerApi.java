package org.ow2.proactive.catalog.client.api;

import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiResponse;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.Pair;

import javax.ws.rs.core.GenericType;

import org.ow2.proactive.catalog.client.model.CatalogObjectMetadata;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-27T12:13:03.112691600+01:00[Europe/Berlin]")
public class CatalogObjectRevisionControllerApi {
  private ApiClient apiClient;

  public CatalogObjectRevisionControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CatalogObjectRevisionControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a new catalog object revision
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param commitMessage The commit message of the CatalogRawObject Revision (required)
   * @param _file  (required)
   * @param projectName Project of the object (optional, default to )
   * @param tags Tags of the object (optional, default to )
   * @return CatalogObjectMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Invalid catalog object JSON content supplied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectMetadata create2(String sessionID, String bucketName, String name, String commitMessage, File _file, String projectName, String tags) throws ApiException {
    return create2WithHttpInfo(sessionID, bucketName, name, commitMessage, _file, projectName, tags).getData();
  }

  /**
   * Creates a new catalog object revision
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param commitMessage The commit message of the CatalogRawObject Revision (required)
   * @param _file  (required)
   * @param projectName Project of the object (optional, default to )
   * @param tags Tags of the object (optional, default to )
   * @return ApiResponse&lt;CatalogObjectMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Invalid catalog object JSON content supplied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectMetadata> create2WithHttpInfo(String sessionID, String bucketName, String name, String commitMessage, File _file, String projectName, String tags) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling create2");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling create2");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling create2");
    }
    if (commitMessage == null) {
      throw new ApiException(400, "Missing the required parameter 'commitMessage' when calling create2");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling create2");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{name}/revisions"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{name}", apiClient.escapeString(name));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "commitMessage", commitMessage)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectName", projectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams.put("file", _file);

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    GenericType<CatalogObjectMetadata> localVarReturnType = new GenericType<CatalogObjectMetadata>() {};
    return apiClient.invokeAPI("CatalogObjectRevisionControllerApi.create2", localVarPath, "POST", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Gets a specific revision
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param commitTimeRaw  (required)
   * @param sessionID sessionID (optional)
   * @return CatalogObjectMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket, catalog object or catalog object revision not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectMetadata get1(String bucketName, String name, Long commitTimeRaw, String sessionID) throws ApiException {
    return get1WithHttpInfo(bucketName, name, commitTimeRaw, sessionID).getData();
  }

  /**
   * Gets a specific revision
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param commitTimeRaw  (required)
   * @param sessionID sessionID (optional)
   * @return ApiResponse&lt;CatalogObjectMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket, catalog object or catalog object revision not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectMetadata> get1WithHttpInfo(String bucketName, String name, Long commitTimeRaw, String sessionID) throws ApiException {
    // Check required parameters
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling get1");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling get1");
    }
    if (commitTimeRaw == null) {
      throw new ApiException(400, "Missing the required parameter 'commitTimeRaw' when calling get1");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw}"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{name}", apiClient.escapeString(name))
            .replaceAll("\\{commitTimeRaw}", apiClient.escapeString(commitTimeRaw.toString()));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CatalogObjectMetadata> localVarReturnType = new GenericType<CatalogObjectMetadata>() {};
    return apiClient.invokeAPI("CatalogObjectRevisionControllerApi.get1", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Gets the raw content of a specific revision
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param commitTimeRaw  (required)
   * @param sessionID sessionID (optional)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket, catalog object or catalog object revision not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
     </table>
   */
  public String getRaw(String bucketName, String name, Long commitTimeRaw, String sessionID) throws ApiException {
    return getRawWithHttpInfo(bucketName, name, commitTimeRaw, sessionID).getData();
  }

  /**
   * Gets the raw content of a specific revision
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param commitTimeRaw  (required)
   * @param sessionID sessionID (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket, catalog object or catalog object revision not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getRawWithHttpInfo(String bucketName, String name, Long commitTimeRaw, String sessionID) throws ApiException {
    // Check required parameters
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getRaw");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getRaw");
    }
    if (commitTimeRaw == null) {
      throw new ApiException(400, "Missing the required parameter 'commitTimeRaw' when calling getRaw");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw}/raw"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{name}", apiClient.escapeString(name))
            .replaceAll("\\{commitTimeRaw}", apiClient.escapeString(commitTimeRaw.toString()));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("CatalogObjectRevisionControllerApi.getRaw", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Lists a catalog object revisions
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param sessionID sessionID (optional)
   * @return List&lt;CatalogObjectMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket or catalog object not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<CatalogObjectMetadata> list2(String bucketName, String name, String sessionID) throws ApiException {
    return list2WithHttpInfo(bucketName, name, sessionID).getData();
  }

  /**
   * Lists a catalog object revisions
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param sessionID sessionID (optional)
   * @return ApiResponse&lt;List&lt;CatalogObjectMetadata&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket or catalog object not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CatalogObjectMetadata>> list2WithHttpInfo(String bucketName, String name, String sessionID) throws ApiException {
    // Check required parameters
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling list2");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling list2");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{name}/revisions"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{name}", apiClient.escapeString(name));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<CatalogObjectMetadata>> localVarReturnType = new GenericType<List<CatalogObjectMetadata>>() {};
    return apiClient.invokeAPI("CatalogObjectRevisionControllerApi.list2", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Restore a catalog object revision
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param commitTimeRaw  (required)
   * @return CatalogObjectMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket, object or revision not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Invalid catalog object JSON content supplied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectMetadata restore(String sessionID, String bucketName, String name, Long commitTimeRaw) throws ApiException {
    return restoreWithHttpInfo(sessionID, bucketName, name, commitTimeRaw).getData();
  }

  /**
   * Restore a catalog object revision
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param commitTimeRaw  (required)
   * @return ApiResponse&lt;CatalogObjectMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket, object or revision not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Invalid catalog object JSON content supplied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectMetadata> restoreWithHttpInfo(String sessionID, String bucketName, String name, Long commitTimeRaw) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling restore");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling restore");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling restore");
    }
    if (commitTimeRaw == null) {
      throw new ApiException(400, "Missing the required parameter 'commitTimeRaw' when calling restore");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw}"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{name}", apiClient.escapeString(name))
            .replaceAll("\\{commitTimeRaw}", apiClient.escapeString(commitTimeRaw.toString()));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CatalogObjectMetadata> localVarReturnType = new GenericType<CatalogObjectMetadata>() {};
    return apiClient.invokeAPI("CatalogObjectRevisionControllerApi.restore", localVarPath, "PUT", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
