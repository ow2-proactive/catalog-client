package org.ow2.proactive.catalog.client.api;

import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiResponse;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.Pair;

import javax.ws.rs.core.GenericType;

import org.ow2.proactive.catalog.client.model.AllBucketGrants;
import org.ow2.proactive.catalog.client.model.BucketGrantMetadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-12T10:49:33.729424-05:00[America/New_York]")
public class BucketGrantControllerApi {
  private ApiClient apiClient;

  public BucketGrantControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BucketGrantControllerApi(ApiClient apiClient) {
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
   * Create a new user group grant access for a bucket
   * 
   * @param sessionID The session id used to access ProActive REST server (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param accessType The type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. (required)
   * @param priority The new priority of the access grant.&lt;br /&gt;It can be a value from 1 (lowest) to 10 (highest), with 5 as default. Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. (required)
   * @param userGroup The name of the group of users that will benefit of the access grant. (required)
   * @return BucketGrantMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public BucketGrantMetadata createBucketGrantForAGroup(String sessionID, String bucketName, String accessType, Integer priority, String userGroup) throws ApiException {
    return createBucketGrantForAGroupWithHttpInfo(sessionID, bucketName, accessType, priority, userGroup).getData();
  }

  /**
   * Create a new user group grant access for a bucket
   * 
   * @param sessionID The session id used to access ProActive REST server (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param accessType The type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. (required)
   * @param priority The new priority of the access grant.&lt;br /&gt;It can be a value from 1 (lowest) to 10 (highest), with 5 as default. Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. (required)
   * @param userGroup The name of the group of users that will benefit of the access grant. (required)
   * @return ApiResponse&lt;BucketGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BucketGrantMetadata> createBucketGrantForAGroupWithHttpInfo(String sessionID, String bucketName, String accessType, Integer priority, String userGroup) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling createBucketGrantForAGroup");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling createBucketGrantForAGroup");
    }
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling createBucketGrantForAGroup");
    }
    if (priority == null) {
      throw new ApiException(400, "Missing the required parameter 'priority' when calling createBucketGrantForAGroup");
    }
    if (userGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroup' when calling createBucketGrantForAGroup");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/grant/group"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "accessType", accessType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priority", priority));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userGroup", userGroup));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BucketGrantMetadata> localVarReturnType = new GenericType<BucketGrantMetadata>() {};
    return apiClient.invokeAPI("BucketGrantControllerApi.createBucketGrantForAGroup", localVarPath, "POST", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Create a new user grant access for a bucket
   * 
   * @param sessionID The the session id used to access ProActive REST server (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param accessType The type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. (required)
   * @param username The name of the user that will benefit of the access grant. (required)
   * @return BucketGrantMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public BucketGrantMetadata createBucketGrantForAUser(String sessionID, String bucketName, String accessType, String username) throws ApiException {
    return createBucketGrantForAUserWithHttpInfo(sessionID, bucketName, accessType, username).getData();
  }

  /**
   * Create a new user grant access for a bucket
   * 
   * @param sessionID The the session id used to access ProActive REST server (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param accessType The type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. (required)
   * @param username The name of the user that will benefit of the access grant. (required)
   * @return ApiResponse&lt;BucketGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BucketGrantMetadata> createBucketGrantForAUserWithHttpInfo(String sessionID, String bucketName, String accessType, String username) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling createBucketGrantForAUser");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling createBucketGrantForAUser");
    }
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling createBucketGrantForAUser");
    }
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling createBucketGrantForAUser");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/grant/user"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "accessType", accessType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BucketGrantMetadata> localVarReturnType = new GenericType<BucketGrantMetadata>() {};
    return apiClient.invokeAPI("BucketGrantControllerApi.createBucketGrantForAUser", localVarPath, "POST", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete all grants assigned to a bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @return List&lt;BucketGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<BucketGrantMetadata> deleteAllBucketGrantsAssignedToABucket(String sessionID, String bucketName) throws ApiException {
    return deleteAllBucketGrantsAssignedToABucketWithHttpInfo(sessionID, bucketName).getData();
  }

  /**
   * Delete all grants assigned to a bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @return ApiResponse&lt;List&lt;BucketGrantMetadata&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<BucketGrantMetadata>> deleteAllBucketGrantsAssignedToABucketWithHttpInfo(String sessionID, String bucketName) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteAllBucketGrantsAssignedToABucket");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteAllBucketGrantsAssignedToABucket");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/grant"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<BucketGrantMetadata>> localVarReturnType = new GenericType<List<BucketGrantMetadata>>() {};
    return apiClient.invokeAPI("BucketGrantControllerApi.deleteAllBucketGrantsAssignedToABucket", localVarPath, "DELETE", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete all grants associated with a bucket and all objects contained in this bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @return AllBucketGrants
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public AllBucketGrants deleteAllGrantsForABucketAndItsObjects(String sessionID, String bucketName) throws ApiException {
    return deleteAllGrantsForABucketAndItsObjectsWithHttpInfo(sessionID, bucketName).getData();
  }

  /**
   * Delete all grants associated with a bucket and all objects contained in this bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @return ApiResponse&lt;AllBucketGrants&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AllBucketGrants> deleteAllGrantsForABucketAndItsObjectsWithHttpInfo(String sessionID, String bucketName) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteAllGrantsForABucketAndItsObjects");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteAllGrantsForABucketAndItsObjects");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/grant/all"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<AllBucketGrants> localVarReturnType = new GenericType<AllBucketGrants>() {};
    return apiClient.invokeAPI("BucketGrantControllerApi.deleteAllGrantsForABucketAndItsObjects", localVarPath, "DELETE", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete a group grant access for a bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param userGroup The name of the group of users that are benefiting from the access grant. (required)
   * @return BucketGrantMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public BucketGrantMetadata deleteBucketGrantForAGroup(String sessionID, String bucketName, String userGroup) throws ApiException {
    return deleteBucketGrantForAGroupWithHttpInfo(sessionID, bucketName, userGroup).getData();
  }

  /**
   * Delete a group grant access for a bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param userGroup The name of the group of users that are benefiting from the access grant. (required)
   * @return ApiResponse&lt;BucketGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BucketGrantMetadata> deleteBucketGrantForAGroupWithHttpInfo(String sessionID, String bucketName, String userGroup) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteBucketGrantForAGroup");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteBucketGrantForAGroup");
    }
    if (userGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroup' when calling deleteBucketGrantForAGroup");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/grant/group"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "userGroup", userGroup)
    );

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BucketGrantMetadata> localVarReturnType = new GenericType<BucketGrantMetadata>() {};
    return apiClient.invokeAPI("BucketGrantControllerApi.deleteBucketGrantForAGroup", localVarPath, "DELETE", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete a user grant access for a bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param username The name of the user that is benefiting from the access grant. (required)
   * @return BucketGrantMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public BucketGrantMetadata deleteBucketGrantForAUser(String sessionID, String bucketName, String username) throws ApiException {
    return deleteBucketGrantForAUserWithHttpInfo(sessionID, bucketName, username).getData();
  }

  /**
   * Delete a user grant access for a bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param username The name of the user that is benefiting from the access grant. (required)
   * @return ApiResponse&lt;BucketGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BucketGrantMetadata> deleteBucketGrantForAUserWithHttpInfo(String sessionID, String bucketName, String username) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteBucketGrantForAUser");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteBucketGrantForAUser");
    }
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling deleteBucketGrantForAUser");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/grant/user"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "username", username)
    );

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BucketGrantMetadata> localVarReturnType = new GenericType<BucketGrantMetadata>() {};
    return apiClient.invokeAPI("BucketGrantControllerApi.deleteBucketGrantForAUser", localVarPath, "DELETE", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get all grants associated with a bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @return List&lt;BucketGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<BucketGrantMetadata> getAllGrantsForABucket(String sessionID, String bucketName) throws ApiException {
    return getAllGrantsForABucketWithHttpInfo(sessionID, bucketName).getData();
  }

  /**
   * Get all grants associated with a bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @return ApiResponse&lt;List&lt;BucketGrantMetadata&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<BucketGrantMetadata>> getAllGrantsForABucketWithHttpInfo(String sessionID, String bucketName) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling getAllGrantsForABucket");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getAllGrantsForABucket");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/grant"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<BucketGrantMetadata>> localVarReturnType = new GenericType<List<BucketGrantMetadata>>() {};
    return apiClient.invokeAPI("BucketGrantControllerApi.getAllGrantsForABucket", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get all grants associated with a bucket and all objects contained in this bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @return AllBucketGrants
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public AllBucketGrants getAllGrantsForABucketAndItsObjects(String sessionID, String bucketName) throws ApiException {
    return getAllGrantsForABucketAndItsObjectsWithHttpInfo(sessionID, bucketName).getData();
  }

  /**
   * Get all grants associated with a bucket and all objects contained in this bucket
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @return ApiResponse&lt;AllBucketGrants&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AllBucketGrants> getAllGrantsForABucketAndItsObjectsWithHttpInfo(String sessionID, String bucketName) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling getAllGrantsForABucketAndItsObjects");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getAllGrantsForABucketAndItsObjects");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/grant/all"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<AllBucketGrants> localVarReturnType = new GenericType<AllBucketGrants>() {};
    return apiClient.invokeAPI("BucketGrantControllerApi.getAllGrantsForABucketAndItsObjects", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update the access type of an existing group bucket grant
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param userGroup The name of the group of users that are benefiting from the access grant. (required)
   * @param accessType The new type of the access grant. It can be either noAccess, read, write or admin. (required)
   * @param priority The new priority of the access grant.&lt;br /&gt;It can be a value from 1 (lowest) to 10 (highest), with 5 as default.Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. (required)
   * @return BucketGrantMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public BucketGrantMetadata updateBucketGrantForAGroup(String sessionID, String bucketName, String userGroup, String accessType, Integer priority) throws ApiException {
    return updateBucketGrantForAGroupWithHttpInfo(sessionID, bucketName, userGroup, accessType, priority).getData();
  }

  /**
   * Update the access type of an existing group bucket grant
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param userGroup The name of the group of users that are benefiting from the access grant. (required)
   * @param accessType The new type of the access grant. It can be either noAccess, read, write or admin. (required)
   * @param priority The new priority of the access grant.&lt;br /&gt;It can be a value from 1 (lowest) to 10 (highest), with 5 as default.Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. (required)
   * @return ApiResponse&lt;BucketGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BucketGrantMetadata> updateBucketGrantForAGroupWithHttpInfo(String sessionID, String bucketName, String userGroup, String accessType, Integer priority) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling updateBucketGrantForAGroup");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling updateBucketGrantForAGroup");
    }
    if (userGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroup' when calling updateBucketGrantForAGroup");
    }
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling updateBucketGrantForAGroup");
    }
    if (priority == null) {
      throw new ApiException(400, "Missing the required parameter 'priority' when calling updateBucketGrantForAGroup");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/grant/group"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "userGroup", userGroup)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessType", accessType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priority", priority));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BucketGrantMetadata> localVarReturnType = new GenericType<BucketGrantMetadata>() {};
    return apiClient.invokeAPI("BucketGrantControllerApi.updateBucketGrantForAGroup", localVarPath, "PUT", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update the access type of an existing user bucket grant
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param username The name of the user that is benefiting from the access grant. (required)
   * @param accessType The new type of the access grant. It can be either noAccess, read, write or admin. (required)
   * @return BucketGrantMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public BucketGrantMetadata updateBucketGrantForAUser(String sessionID, String bucketName, String username, String accessType) throws ApiException {
    return updateBucketGrantForAUserWithHttpInfo(sessionID, bucketName, username, accessType).getData();
  }

  /**
   * Update the access type of an existing user bucket grant
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param username The name of the user that is benefiting from the access grant. (required)
   * @param accessType The new type of the access grant. It can be either noAccess, read, write or admin. (required)
   * @return ApiResponse&lt;BucketGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BucketGrantMetadata> updateBucketGrantForAUserWithHttpInfo(String sessionID, String bucketName, String username, String accessType) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling updateBucketGrantForAUser");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling updateBucketGrantForAUser");
    }
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling updateBucketGrantForAUser");
    }
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling updateBucketGrantForAUser");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/grant/user"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "username", username)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessType", accessType));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BucketGrantMetadata> localVarReturnType = new GenericType<BucketGrantMetadata>() {};
    return apiClient.invokeAPI("BucketGrantControllerApi.updateBucketGrantForAUser", localVarPath, "PUT", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
