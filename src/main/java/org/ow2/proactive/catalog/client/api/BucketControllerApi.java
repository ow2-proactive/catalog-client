package org.ow2.proactive.catalog.client.api;

import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiResponse;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.Pair;

import javax.ws.rs.core.GenericType;

import org.ow2.proactive.catalog.client.model.BucketMetadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-26T11:53:55.670648-05:00[America/New_York]")
public class BucketControllerApi {
  private ApiClient apiClient;

  public BucketControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BucketControllerApi(ApiClient apiClient) {
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
   * Lists the buckets
   * 
   * @param sessionID sessionID (optional)
   * @param owner The name of the user who owns the Bucket (optional)
   * @param kind The kind(s) of objects that buckets must contain.&lt;br /&gt;Multiple kinds can be specified using comma separators (optional)
   * @param contentType The Content-Type of objects that buckets must contain (optional)
   * @param objectTag The tag of objects that buckets must contain (optional)
   * @param associationStatus The buckets must contain objects which have the given job-planner association status.&lt;br /&gt;Can be ALL, PLANNED, DEACTIVATED, FAILED or UNPLANNED.&lt;br /&gt;ALL will filter objects which have an association with any status.&lt;br /&gt;UNPLANNED will filter objects without any association. (optional)
   * @param objectName The name of objects that buckets must contain (optional)
   * @param bucketName The bucket name contains the value of this parameter (case insensitive) (optional)
   * @param projectName Include only objects whose project name contains the given string. (optional)
   * @param lastCommitBy Include only objects whose last commit belong to the given user. (optional)
   * @param lastCommitTimeGreater Include only objects whose last commit time is greater than the given EPOCH time. (optional, default to 0)
   * @param lastCommitTimeLessThan Include only objects whose last commit time is less than the given EPOCH time. (optional, default to 0)
   * @param allBuckets If true, buckets without objects matching the filters will be returned with objectCount&#x3D;0. Default is false (optional, default to false)
   * @return List&lt;BucketMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<BucketMetadata> callList(String sessionID, String owner, String kind, String contentType, String objectTag, String associationStatus, String objectName, String bucketName, String projectName, String lastCommitBy, Long lastCommitTimeGreater, Long lastCommitTimeLessThan, String allBuckets) throws ApiException {
    return callListWithHttpInfo(sessionID, owner, kind, contentType, objectTag, associationStatus, objectName, bucketName, projectName, lastCommitBy, lastCommitTimeGreater, lastCommitTimeLessThan, allBuckets).getData();
  }

  /**
   * Lists the buckets
   * 
   * @param sessionID sessionID (optional)
   * @param owner The name of the user who owns the Bucket (optional)
   * @param kind The kind(s) of objects that buckets must contain.&lt;br /&gt;Multiple kinds can be specified using comma separators (optional)
   * @param contentType The Content-Type of objects that buckets must contain (optional)
   * @param objectTag The tag of objects that buckets must contain (optional)
   * @param associationStatus The buckets must contain objects which have the given job-planner association status.&lt;br /&gt;Can be ALL, PLANNED, DEACTIVATED, FAILED or UNPLANNED.&lt;br /&gt;ALL will filter objects which have an association with any status.&lt;br /&gt;UNPLANNED will filter objects without any association. (optional)
   * @param objectName The name of objects that buckets must contain (optional)
   * @param bucketName The bucket name contains the value of this parameter (case insensitive) (optional)
   * @param projectName Include only objects whose project name contains the given string. (optional)
   * @param lastCommitBy Include only objects whose last commit belong to the given user. (optional)
   * @param lastCommitTimeGreater Include only objects whose last commit time is greater than the given EPOCH time. (optional, default to 0)
   * @param lastCommitTimeLessThan Include only objects whose last commit time is less than the given EPOCH time. (optional, default to 0)
   * @param allBuckets If true, buckets without objects matching the filters will be returned with objectCount&#x3D;0. Default is false (optional, default to false)
   * @return ApiResponse&lt;List&lt;BucketMetadata&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<BucketMetadata>> callListWithHttpInfo(String sessionID, String owner, String kind, String contentType, String objectTag, String associationStatus, String objectName, String bucketName, String projectName, String lastCommitBy, Long lastCommitTimeGreater, Long lastCommitTimeLessThan, String allBuckets) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "owner", owner)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "kind", kind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentType", contentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "objectTag", objectTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "associationStatus", associationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "objectName", objectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bucketName", bucketName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectName", projectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastCommitBy", lastCommitBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastCommitTimeGreater", lastCommitTimeGreater));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastCommitTimeLessThan", lastCommitTimeLessThan));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allBuckets", allBuckets));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<BucketMetadata>> localVarReturnType = new GenericType<List<BucketMetadata>>() {};
    return apiClient.invokeAPI("BucketControllerApi.callList", "/buckets", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete the empty buckets
   * 
   * @param sessionID sessionID (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public void cleanEmpty(String sessionID) throws ApiException {
    cleanEmptyWithHttpInfo(sessionID);
  }

  /**
   * Delete the empty buckets
   * 
   * @param sessionID sessionID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> cleanEmptyWithHttpInfo(String sessionID) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling cleanEmpty");
    }

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("BucketControllerApi.cleanEmpty", "/buckets", "DELETE", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Creates a new bucket
   * 
   * @param sessionID sessionID (required)
   * @param name The unique name of the Bucket.&lt;br /&gt;The name of bucket can be between 3 and 63 characters long, and can contain only lower-case characters, numbers, and dashes.&lt;br /&gt;A bucket&#39;s name must start with a lowercase letter and cannot terminate with a dash (required)
   * @param owner The name of the user that will own the Bucket. Defaults to GROUP:public-objects (optional, default to GROUP:public-objects)
   * @return BucketMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public BucketMetadata create(String sessionID, String name, String owner) throws ApiException {
    return createWithHttpInfo(sessionID, name, owner).getData();
  }

  /**
   * Creates a new bucket
   * 
   * @param sessionID sessionID (required)
   * @param name The unique name of the Bucket.&lt;br /&gt;The name of bucket can be between 3 and 63 characters long, and can contain only lower-case characters, numbers, and dashes.&lt;br /&gt;A bucket&#39;s name must start with a lowercase letter and cannot terminate with a dash (required)
   * @param owner The name of the user that will own the Bucket. Defaults to GROUP:public-objects (optional, default to GROUP:public-objects)
   * @return ApiResponse&lt;BucketMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BucketMetadata> createWithHttpInfo(String sessionID, String name, String owner) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling create");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling create");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "name", name)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "owner", owner));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BucketMetadata> localVarReturnType = new GenericType<BucketMetadata>() {};
    return apiClient.invokeAPI("BucketControllerApi.create", "/buckets", "POST", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete an empty bucket
   * Note: it is forbidden to delete a non-empty bucket. You need to delete manually all workflows in the bucket before.
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @return BucketMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public BucketMetadata delete(String sessionID, String bucketName) throws ApiException {
    return deleteWithHttpInfo(sessionID, bucketName).getData();
  }

  /**
   * Delete an empty bucket
   * Note: it is forbidden to delete a non-empty bucket. You need to delete manually all workflows in the bucket before.
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @return ApiResponse&lt;BucketMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BucketMetadata> deleteWithHttpInfo(String sessionID, String bucketName) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling delete");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling delete");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BucketMetadata> localVarReturnType = new GenericType<BucketMetadata>() {};
    return apiClient.invokeAPI("BucketControllerApi.delete", localVarPath, "DELETE", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Gets a bucket&#39;s metadata by ID
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param sessionID sessionID (optional)
   * @return BucketMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public BucketMetadata getMetadata(String bucketName, String sessionID) throws ApiException {
    return getMetadataWithHttpInfo(bucketName, sessionID).getData();
  }

  /**
   * Gets a bucket&#39;s metadata by ID
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param sessionID sessionID (optional)
   * @return ApiResponse&lt;BucketMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BucketMetadata> getMetadataWithHttpInfo(String bucketName, String sessionID) throws ApiException {
    // Check required parameters
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getMetadata");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BucketMetadata> localVarReturnType = new GenericType<BucketMetadata>() {};
    return apiClient.invokeAPI("BucketControllerApi.getMetadata", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update bucket owner
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param owner The new name of the user that will own the Bucket (required)
   * @return BucketMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public BucketMetadata updateBucketOwner(String sessionID, String bucketName, String owner) throws ApiException {
    return updateBucketOwnerWithHttpInfo(sessionID, bucketName, owner).getData();
  }

  /**
   * Update bucket owner
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param owner The new name of the user that will own the Bucket (required)
   * @return ApiResponse&lt;BucketMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BucketMetadata> updateBucketOwnerWithHttpInfo(String sessionID, String bucketName, String owner) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling updateBucketOwner");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling updateBucketOwner");
    }
    if (owner == null) {
      throw new ApiException(400, "Missing the required parameter 'owner' when calling updateBucketOwner");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "owner", owner)
    );

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BucketMetadata> localVarReturnType = new GenericType<BucketMetadata>() {};
    return apiClient.invokeAPI("BucketControllerApi.updateBucketOwner", localVarPath, "PUT", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
