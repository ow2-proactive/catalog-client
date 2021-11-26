/*
 * CatalogObjectEntity Catalog API
 * The purpose of the catalog is to store ProActive objects.  A catalog is subdivided into buckets.   Each bucket manages zero, one or more versioned ProActive objects.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.ow2.proactive.catalog.client.api;

import com.sun.jersey.api.client.GenericType;

import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.Pair;

import org.ow2.proactive.catalog.client.model.BucketGrantMetadata;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-26T10:38:35.118+01:00")
public class BucketGrantControllerApi {
  private ApiClient apiClient;

  public BucketGrantControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BucketGrantControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new username grant or a user group grant access for a bucket
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the Bucket (optional)
   * @param currentUser The user who is creating this grant (optional)
   * @param accessType The access type of the grant (optional)
   * @param username The name of the user that will have grant access (optional)
   * @param userGroup The name of the user group that will have grant access (optional)
   * @return BucketGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public BucketGrantMetadata createBucketGrantUsingPOST(String sessionID, String bucketName, String currentUser, String accessType, String username, String userGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling createBucketGrantUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/grant";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("bucketName", bucketName));
    localVarQueryParams.addAll(apiClient.parameterToPair("currentUser", currentUser));
    localVarQueryParams.addAll(apiClient.parameterToPair("accessType", accessType));
    localVarQueryParams.addAll(apiClient.parameterToPair("username", username));
    localVarQueryParams.addAll(apiClient.parameterToPair("userGroup", userGroup));

    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<BucketGrantMetadata> localVarReturnType = new GenericType<BucketGrantMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a grant access for a bucket
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the Bucket (optional)
   * @param currentUser The current user (optional)
   * @param username The name of the user that have grant access over this bucket (optional)
   * @param userGroup The name of the user group that have grant access over this bucket (optional)
   * @return BucketGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public BucketGrantMetadata deleteBucketGrantUsingDELETE(String sessionID, String bucketName, String currentUser, String username, String userGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteBucketGrantUsingDELETE");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/grant";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("bucketName", bucketName));
    localVarQueryParams.addAll(apiClient.parameterToPair("currentUser", currentUser));
    localVarQueryParams.addAll(apiClient.parameterToPair("username", username));
    localVarQueryParams.addAll(apiClient.parameterToPair("userGroup", userGroup));

    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<BucketGrantMetadata> localVarReturnType = new GenericType<BucketGrantMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all assigned grants for the user and his groups
   * 
   * @param sessionID sessionID (required)
   * @param currentUser The current user (optional)
   * @param userGroups The list of the current user groups (optional)
   * @return List&lt;BucketGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   */
  public List<BucketGrantMetadata> getAssignedBucketGrantsForUserAndHisGroupUsingGET(String sessionID, String currentUser, List<String> userGroups) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling getAssignedBucketGrantsForUserAndHisGroupUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/grant";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("currentUser", currentUser));
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "userGroups", userGroups));

    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<BucketGrantMetadata>> localVarReturnType = new GenericType<List<BucketGrantMetadata>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all created grants by a specific user
   * 
   * @param sessionID sessionID (required)
   * @param username username (required)
   * @return List&lt;BucketGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   */
  public List<BucketGrantMetadata> getCreatedBucketGrantsUsingGET(String sessionID, String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling getCreatedBucketGrantsUsingGET");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling getCreatedBucketGrantsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/grant/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<BucketGrantMetadata>> localVarReturnType = new GenericType<List<BucketGrantMetadata>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update the access type of an existing bucket grant
   * 
   * @param sessionID sessionID (required)
   * @param accessType accessType (required)
   * @param bucketName bucketName (required)
   * @param currentUser The user who is updating this grant (optional)
   * @param username username (optional)
   * @param userGroup userGroup (optional)
   * @return BucketGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public BucketGrantMetadata updateBucketGrantUsingPUT(String sessionID, String accessType, String bucketName, String currentUser, String username, String userGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling updateBucketGrantUsingPUT");
    }
    
    // verify the required parameter 'accessType' is set
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling updateBucketGrantUsingPUT");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling updateBucketGrantUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/grant/{bucketName}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("currentUser", currentUser));

    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
if (username != null)
      localVarHeaderParams.put("username", apiClient.parameterToString(username));
if (userGroup != null)
      localVarHeaderParams.put("userGroup", apiClient.parameterToString(userGroup));
if (accessType != null)
      localVarHeaderParams.put("accessType", apiClient.parameterToString(accessType));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<BucketGrantMetadata> localVarReturnType = new GenericType<BucketGrantMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
