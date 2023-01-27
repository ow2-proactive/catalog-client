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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-26T17:28:06.013+01:00")
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
   * Create a new group grant for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param accessType The type of the access grant. It can be either noAccess, read, write or admin. (required)
   * @param priority The new priority of the access grant. It can be a value from 1 (lowest) to 10 (highest), with 5 as default. Priorities are used to compute the final access rights of a user belonging to multiple groups. Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess). Finally, please note that a user grant has always more priority than a group grant. (required)
   * @param userGroup The name of the group of users that will benefit of the access grant. (required)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectGrantMetadata createCatalogObjectGrantForAGroupUsingPOST(String sessionID, String bucketName, String catalogObjectName, String accessType, Integer priority, String userGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling createCatalogObjectGrantForAGroupUsingPOST");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling createCatalogObjectGrantForAGroupUsingPOST");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling createCatalogObjectGrantForAGroupUsingPOST");
    }
    
    // verify the required parameter 'accessType' is set
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling createCatalogObjectGrantForAGroupUsingPOST");
    }
    
    // verify the required parameter 'priority' is set
    if (priority == null) {
      throw new ApiException(400, "Missing the required parameter 'priority' when calling createCatalogObjectGrantForAGroupUsingPOST");
    }
    
    // verify the required parameter 'userGroup' is set
    if (userGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroup' when calling createCatalogObjectGrantForAGroupUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/group"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("accessType", accessType));
    localVarQueryParams.addAll(apiClient.parameterToPair("priority", priority));
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
   * Create a new user grant for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param accessType The type of the access grant. It can be either noAccess, read, write or admin. (required)
   * @param username The name of the user that will benefit of the access grant. (required)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectGrantMetadata createCatalogObjectGrantForAUserUsingPOST(String sessionID, String bucketName, String catalogObjectName, String accessType, String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling createCatalogObjectGrantForAUserUsingPOST");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling createCatalogObjectGrantForAUserUsingPOST");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling createCatalogObjectGrantForAUserUsingPOST");
    }
    
    // verify the required parameter 'accessType' is set
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling createCatalogObjectGrantForAUserUsingPOST");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling createCatalogObjectGrantForAUserUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/user"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("accessType", accessType));
    localVarQueryParams.addAll(apiClient.parameterToPair("username", username));

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
   * Delete all grant associated with a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @return List&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CatalogObjectGrantMetadata> deleteAllCatalogObjectGrantsUsingDELETE(String sessionID, String bucketName, String catalogObjectName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteAllCatalogObjectGrantsUsingDELETE");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteAllCatalogObjectGrantsUsingDELETE");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling deleteAllCatalogObjectGrantsUsingDELETE");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

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

    GenericType<List<CatalogObjectGrantMetadata>> localVarReturnType = new GenericType<List<CatalogObjectGrantMetadata>>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a user group grant access for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param userGroup The name of the group of users that are benefiting of the access grant. (required)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectGrantMetadata deleteCatalogObjectGrantForAGroupUsingDELETE(String sessionID, String bucketName, String catalogObjectName, String userGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteCatalogObjectGrantForAGroupUsingDELETE");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteCatalogObjectGrantForAGroupUsingDELETE");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling deleteCatalogObjectGrantForAGroupUsingDELETE");
    }
    
    // verify the required parameter 'userGroup' is set
    if (userGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroup' when calling deleteCatalogObjectGrantForAGroupUsingDELETE");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/group"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * Delete a user grant access for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param username The name of the user that is benefiting of the access grant. (required)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectGrantMetadata deleteCatalogObjectGrantForAUserUsingDELETE(String sessionID, String bucketName, String catalogObjectName, String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteCatalogObjectGrantForAUserUsingDELETE");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteCatalogObjectGrantForAUserUsingDELETE");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling deleteCatalogObjectGrantForAUserUsingDELETE");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling deleteCatalogObjectGrantForAUserUsingDELETE");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/user"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("username", username));

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
   * Get all grants associated with a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @return List&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CatalogObjectGrantMetadata> getAllCreatedCatalogObjectGrantsByAdminsUsingGET(String sessionID, String bucketName, String catalogObjectName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling getAllCreatedCatalogObjectGrantsByAdminsUsingGET");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getAllCreatedCatalogObjectGrantsByAdminsUsingGET");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling getAllCreatedCatalogObjectGrantsByAdminsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

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

    GenericType<List<CatalogObjectGrantMetadata>> localVarReturnType = new GenericType<List<CatalogObjectGrantMetadata>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a user group grant access for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param accessType The new type of the access grant. It can be either noAccess, read, write or admin. (required)
   * @param priority The new priority of the access grant. It can be a value from 1 (lowest) to 10 (highest), with 5 as default. Priorities are used to compute the final access rights of a user belonging to multiple groups. Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess). Finally, please note that a user grant has always more priority than a group grant. (required)
   * @param userGroup The name of the group of users that are benefiting of the access grant. (required)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectGrantMetadata updateCatalogObjectGrantForAGroupUsingPUT(String sessionID, String bucketName, String catalogObjectName, String accessType, Integer priority, String userGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling updateCatalogObjectGrantForAGroupUsingPUT");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling updateCatalogObjectGrantForAGroupUsingPUT");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling updateCatalogObjectGrantForAGroupUsingPUT");
    }
    
    // verify the required parameter 'accessType' is set
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling updateCatalogObjectGrantForAGroupUsingPUT");
    }
    
    // verify the required parameter 'priority' is set
    if (priority == null) {
      throw new ApiException(400, "Missing the required parameter 'priority' when calling updateCatalogObjectGrantForAGroupUsingPUT");
    }
    
    // verify the required parameter 'userGroup' is set
    if (userGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroup' when calling updateCatalogObjectGrantForAGroupUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/group"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("accessType", accessType));
    localVarQueryParams.addAll(apiClient.parameterToPair("priority", priority));
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
  /**
   * Update a user grant access for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param accessType The new type of the access grant. It can be either noAccess, read, write or admin. (required)
   * @param username The name of the user that is benefiting from the access grant. (required)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectGrantMetadata updateCatalogObjectGrantForAUserUsingPUT(String sessionID, String bucketName, String catalogObjectName, String accessType, String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling updateCatalogObjectGrantForAUserUsingPUT");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling updateCatalogObjectGrantForAUserUsingPUT");
    }
    
    // verify the required parameter 'catalogObjectName' is set
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling updateCatalogObjectGrantForAUserUsingPUT");
    }
    
    // verify the required parameter 'accessType' is set
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling updateCatalogObjectGrantForAUserUsingPUT");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling updateCatalogObjectGrantForAUserUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/user"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "catalogObjectName" + "\\}", apiClient.escapeString(catalogObjectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("accessType", accessType));
    localVarQueryParams.addAll(apiClient.parameterToPair("username", username));

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
