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

import org.ow2.proactive.catalog.client.model.CatalogObjectGrantMetadata;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-26T13:34:24.732+01:00")
public class CatalogObjectGrantControllerApi {
  private ApiClient apiClient;

  public CatalogObjectGrantControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CatalogObjectGrantControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new username grant or a user group grant access for a catalog object
   * 
   * @param sessionID sessionID (required)
   * @param bucketName bucketName (required)
   * @param catalogObjectName catalogObjectName (required)
   * @param currentUser The user who is creating this grant (optional)
   * @param accessType The access type of the grant (optional)
   * @param username The name of the user that will have grant access (optional)
   * @param userGroup The name of the user group that will have grant access (optional)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectGrantMetadata createCatalogObjectGrantUsingPOST(String sessionID, String bucketName, String catalogObjectName, String currentUser, String accessType, String username, String userGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling createCatalogObjectGrantUsingPOST");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling createCatalogObjectGrantUsingPOST");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling createCatalogObjectGrantUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/grant/resources/{catalogObjectName}/grant"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<CatalogObjectGrantMetadata> localVarReturnType = new GenericType<CatalogObjectGrantMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a username grant or a user group grant access for a catalog object
   * 
   * @param sessionID sessionID (required)
   * @param bucketName bucketName (required)
   * @param catalogObjectName catalogObjectName (required)
   * @param currentUser The current user (optional)
   * @param username The name of the user that will have grant access (optional)
   * @param userGroup The name of the user group that will have grant access (optional)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectGrantMetadata deleteCatalogObjectGrantUsingDELETE(String sessionID, String bucketName, String catalogObjectName, String currentUser, String username, String userGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteCatalogObjectGrantUsingDELETE");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteCatalogObjectGrantUsingDELETE");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling deleteCatalogObjectGrantUsingDELETE");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/grant/resources/{catalogObjectName}/grant"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<CatalogObjectGrantMetadata> localVarReturnType = new GenericType<CatalogObjectGrantMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all assigned grants for the user and his group on a specific catalog object
   * 
   * @param sessionID sessionID (required)
   * @param bucketName bucketName (required)
   * @param catalogObjectName catalogObjectName (required)
   * @param currentUser The current user (optional)
   * @param userGroup The current userGroup (optional)
   * @return List&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CatalogObjectGrantMetadata> getAllAssignedCatalogObjectGrantsForTheCurrentUserAndHisGroupUsingGET(String sessionID, String bucketName, String catalogObjectName, String currentUser, String userGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling getAllAssignedCatalogObjectGrantsForTheCurrentUserAndHisGroupUsingGET");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getAllAssignedCatalogObjectGrantsForTheCurrentUserAndHisGroupUsingGET");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling getAllAssignedCatalogObjectGrantsForTheCurrentUserAndHisGroupUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/grant/resources/{catalogObjectName}/grant"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("currentUser", currentUser));
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

    GenericType<List<CatalogObjectGrantMetadata>> localVarReturnType = new GenericType<List<CatalogObjectGrantMetadata>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all created grants by the current user on all bucket&#39;s object
   * 
   * @param sessionID sessionID (required)
   * @param bucketName bucketName (required)
   * @param currentUser The current user (optional)
   * @return List&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CatalogObjectGrantMetadata> getAllCreatedCatalogObjectGrantsByTheCurrentUserForTheCurrentUserBucketUsingGET(String sessionID, String bucketName, String currentUser) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling getAllCreatedCatalogObjectGrantsByTheCurrentUserForTheCurrentUserBucketUsingGET");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getAllCreatedCatalogObjectGrantsByTheCurrentUserForTheCurrentUserBucketUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/grant"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("currentUser", currentUser));

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

    GenericType<List<CatalogObjectGrantMetadata>> localVarReturnType = new GenericType<List<CatalogObjectGrantMetadata>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a username grant or a user group grant access for a catalog object
   * 
   * @param sessionID sessionID (required)
   * @param bucketName bucketName (required)
   * @param catalogObjectName catalogObjectName (required)
   * @param currentUser The current user (optional)
   * @param accessType The new access type (optional)
   * @param username The name of the user that have the grant access (optional)
   * @param userGroup The name of the user group that have the grant access (optional)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectGrantMetadata updateCatalogObjectGrantUsingPUT(String sessionID, String bucketName, String catalogObjectName, String currentUser, String accessType, String username, String userGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling updateCatalogObjectGrantUsingPUT");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling updateCatalogObjectGrantUsingPUT");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling updateCatalogObjectGrantUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/grant/resources/{catalogObjectName}/grant"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<CatalogObjectGrantMetadata> localVarReturnType = new GenericType<CatalogObjectGrantMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
