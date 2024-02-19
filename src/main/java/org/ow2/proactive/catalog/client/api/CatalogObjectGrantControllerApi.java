package org.ow2.proactive.catalog.client.api;

import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiResponse;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.Pair;

import javax.ws.rs.core.GenericType;

import org.ow2.proactive.catalog.client.model.CatalogObjectGrantMetadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-12T10:49:33.729424-05:00[America/New_York]")
public class CatalogObjectGrantControllerApi {
  private ApiClient apiClient;

  public CatalogObjectGrantControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CatalogObjectGrantControllerApi(ApiClient apiClient) {
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
   * Create a new group grant for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param accessType The type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. (required)
   * @param priority The new priority of the access grant.&lt;br /&gt;It can be a value from 1 (lowest) to 10 (highest), with 5 as default.&lt;br /&gt;Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. (required)
   * @param userGroup The name of the group of users that will benefit of the access grant. (required)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectGrantMetadata createCatalogObjectGrantForAGroup(String sessionID, String bucketName, String catalogObjectName, String accessType, Integer priority, String userGroup) throws ApiException {
    return createCatalogObjectGrantForAGroupWithHttpInfo(sessionID, bucketName, catalogObjectName, accessType, priority, userGroup).getData();
  }

  /**
   * Create a new group grant for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param accessType The type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. (required)
   * @param priority The new priority of the access grant.&lt;br /&gt;It can be a value from 1 (lowest) to 10 (highest), with 5 as default.&lt;br /&gt;Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. (required)
   * @param userGroup The name of the group of users that will benefit of the access grant. (required)
   * @return ApiResponse&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectGrantMetadata> createCatalogObjectGrantForAGroupWithHttpInfo(String sessionID, String bucketName, String catalogObjectName, String accessType, Integer priority, String userGroup) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling createCatalogObjectGrantForAGroup");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling createCatalogObjectGrantForAGroup");
    }
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling createCatalogObjectGrantForAGroup");
    }
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling createCatalogObjectGrantForAGroup");
    }
    if (priority == null) {
      throw new ApiException(400, "Missing the required parameter 'priority' when calling createCatalogObjectGrantForAGroup");
    }
    if (userGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroup' when calling createCatalogObjectGrantForAGroup");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/group"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{catalogObjectName}", apiClient.escapeString(catalogObjectName));

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
    GenericType<CatalogObjectGrantMetadata> localVarReturnType = new GenericType<CatalogObjectGrantMetadata>() {};
    return apiClient.invokeAPI("CatalogObjectGrantControllerApi.createCatalogObjectGrantForAGroup", localVarPath, "POST", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectGrantMetadata createCatalogObjectGrantForAUser(String sessionID, String bucketName, String catalogObjectName, String accessType, String username) throws ApiException {
    return createCatalogObjectGrantForAUserWithHttpInfo(sessionID, bucketName, catalogObjectName, accessType, username).getData();
  }

  /**
   * Create a new user grant for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param accessType The type of the access grant. It can be either noAccess, read, write or admin. (required)
   * @param username The name of the user that will benefit of the access grant. (required)
   * @return ApiResponse&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectGrantMetadata> createCatalogObjectGrantForAUserWithHttpInfo(String sessionID, String bucketName, String catalogObjectName, String accessType, String username) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling createCatalogObjectGrantForAUser");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling createCatalogObjectGrantForAUser");
    }
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling createCatalogObjectGrantForAUser");
    }
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling createCatalogObjectGrantForAUser");
    }
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling createCatalogObjectGrantForAUser");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/user"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{catalogObjectName}", apiClient.escapeString(catalogObjectName));

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
    GenericType<CatalogObjectGrantMetadata> localVarReturnType = new GenericType<CatalogObjectGrantMetadata>() {};
    return apiClient.invokeAPI("CatalogObjectGrantControllerApi.createCatalogObjectGrantForAUser", localVarPath, "POST", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete all grant associated with a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @return List&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<CatalogObjectGrantMetadata> deleteAllCatalogObjectGrants(String sessionID, String bucketName, String catalogObjectName) throws ApiException {
    return deleteAllCatalogObjectGrantsWithHttpInfo(sessionID, bucketName, catalogObjectName).getData();
  }

  /**
   * Delete all grant associated with a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @return ApiResponse&lt;List&lt;CatalogObjectGrantMetadata&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CatalogObjectGrantMetadata>> deleteAllCatalogObjectGrantsWithHttpInfo(String sessionID, String bucketName, String catalogObjectName) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteAllCatalogObjectGrants");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteAllCatalogObjectGrants");
    }
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling deleteAllCatalogObjectGrants");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{catalogObjectName}", apiClient.escapeString(catalogObjectName));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<CatalogObjectGrantMetadata>> localVarReturnType = new GenericType<List<CatalogObjectGrantMetadata>>() {};
    return apiClient.invokeAPI("CatalogObjectGrantControllerApi.deleteAllCatalogObjectGrants", localVarPath, "DELETE", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectGrantMetadata deleteCatalogObjectGrantForAGroup(String sessionID, String bucketName, String catalogObjectName, String userGroup) throws ApiException {
    return deleteCatalogObjectGrantForAGroupWithHttpInfo(sessionID, bucketName, catalogObjectName, userGroup).getData();
  }

  /**
   * Delete a user group grant access for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param userGroup The name of the group of users that are benefiting of the access grant. (required)
   * @return ApiResponse&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectGrantMetadata> deleteCatalogObjectGrantForAGroupWithHttpInfo(String sessionID, String bucketName, String catalogObjectName, String userGroup) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteCatalogObjectGrantForAGroup");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteCatalogObjectGrantForAGroup");
    }
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling deleteCatalogObjectGrantForAGroup");
    }
    if (userGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroup' when calling deleteCatalogObjectGrantForAGroup");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/group"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{catalogObjectName}", apiClient.escapeString(catalogObjectName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "userGroup", userGroup)
    );

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CatalogObjectGrantMetadata> localVarReturnType = new GenericType<CatalogObjectGrantMetadata>() {};
    return apiClient.invokeAPI("CatalogObjectGrantControllerApi.deleteCatalogObjectGrantForAGroup", localVarPath, "DELETE", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
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
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectGrantMetadata deleteCatalogObjectGrantForAUser(String sessionID, String bucketName, String catalogObjectName, String username) throws ApiException {
    return deleteCatalogObjectGrantForAUserWithHttpInfo(sessionID, bucketName, catalogObjectName, username).getData();
  }

  /**
   * Delete a user grant access for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param username The name of the user that is benefiting of the access grant. (required)
   * @return ApiResponse&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectGrantMetadata> deleteCatalogObjectGrantForAUserWithHttpInfo(String sessionID, String bucketName, String catalogObjectName, String username) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteCatalogObjectGrantForAUser");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteCatalogObjectGrantForAUser");
    }
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling deleteCatalogObjectGrantForAUser");
    }
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling deleteCatalogObjectGrantForAUser");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/user"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{catalogObjectName}", apiClient.escapeString(catalogObjectName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "username", username)
    );

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CatalogObjectGrantMetadata> localVarReturnType = new GenericType<CatalogObjectGrantMetadata>() {};
    return apiClient.invokeAPI("CatalogObjectGrantControllerApi.deleteCatalogObjectGrantForAUser", localVarPath, "DELETE", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get all grants associated with a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @return List&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<CatalogObjectGrantMetadata> getAllCreatedCatalogObjectGrantsByAdmins(String sessionID, String bucketName, String catalogObjectName) throws ApiException {
    return getAllCreatedCatalogObjectGrantsByAdminsWithHttpInfo(sessionID, bucketName, catalogObjectName).getData();
  }

  /**
   * Get all grants associated with a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog objects are stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @return ApiResponse&lt;List&lt;CatalogObjectGrantMetadata&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CatalogObjectGrantMetadata>> getAllCreatedCatalogObjectGrantsByAdminsWithHttpInfo(String sessionID, String bucketName, String catalogObjectName) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling getAllCreatedCatalogObjectGrantsByAdmins");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getAllCreatedCatalogObjectGrantsByAdmins");
    }
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling getAllCreatedCatalogObjectGrantsByAdmins");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{catalogObjectName}", apiClient.escapeString(catalogObjectName));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<CatalogObjectGrantMetadata>> localVarReturnType = new GenericType<List<CatalogObjectGrantMetadata>>() {};
    return apiClient.invokeAPI("CatalogObjectGrantControllerApi.getAllCreatedCatalogObjectGrantsByAdmins", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update a user group grant access for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param accessType The new type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. (required)
   * @param priority The new priority of the access grant. It can be a value from 1 (lowest) to 10 (highest), with 5 as default.&lt;br /&gt;Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. (required)
   * @param userGroup The name of the group of users that are benefiting of the access grant. (required)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectGrantMetadata updateCatalogObjectGrantForAGroup(String sessionID, String bucketName, String catalogObjectName, String accessType, Integer priority, String userGroup) throws ApiException {
    return updateCatalogObjectGrantForAGroupWithHttpInfo(sessionID, bucketName, catalogObjectName, accessType, priority, userGroup).getData();
  }

  /**
   * Update a user group grant access for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param accessType The new type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. (required)
   * @param priority The new priority of the access grant. It can be a value from 1 (lowest) to 10 (highest), with 5 as default.&lt;br /&gt;Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. (required)
   * @param userGroup The name of the group of users that are benefiting of the access grant. (required)
   * @return ApiResponse&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectGrantMetadata> updateCatalogObjectGrantForAGroupWithHttpInfo(String sessionID, String bucketName, String catalogObjectName, String accessType, Integer priority, String userGroup) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling updateCatalogObjectGrantForAGroup");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling updateCatalogObjectGrantForAGroup");
    }
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling updateCatalogObjectGrantForAGroup");
    }
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling updateCatalogObjectGrantForAGroup");
    }
    if (priority == null) {
      throw new ApiException(400, "Missing the required parameter 'priority' when calling updateCatalogObjectGrantForAGroup");
    }
    if (userGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroup' when calling updateCatalogObjectGrantForAGroup");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/group"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{catalogObjectName}", apiClient.escapeString(catalogObjectName));

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
    GenericType<CatalogObjectGrantMetadata> localVarReturnType = new GenericType<CatalogObjectGrantMetadata>() {};
    return apiClient.invokeAPI("CatalogObjectGrantControllerApi.updateCatalogObjectGrantForAGroup", localVarPath, "PUT", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update a user grant access for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param accessType The new type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. (required)
   * @param username The name of the user that is benefiting from the access grant. (required)
   * @return CatalogObjectGrantMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectGrantMetadata updateCatalogObjectGrantForAUser(String sessionID, String bucketName, String catalogObjectName, String accessType, String username) throws ApiException {
    return updateCatalogObjectGrantForAUserWithHttpInfo(sessionID, bucketName, catalogObjectName, accessType, username).getData();
  }

  /**
   * Update a user grant access for a catalog object
   * 
   * @param sessionID The session id used to access ProActive REST server. (required)
   * @param bucketName The name of the bucket where the catalog object is stored. (required)
   * @param catalogObjectName The name of the object in the bucket, which is the subject of the grant. (required)
   * @param accessType The new type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. (required)
   * @param username The name of the user that is benefiting from the access grant. (required)
   * @return ApiResponse&lt;CatalogObjectGrantMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectGrantMetadata> updateCatalogObjectGrantForAUserWithHttpInfo(String sessionID, String bucketName, String catalogObjectName, String accessType, String username) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling updateCatalogObjectGrantForAUser");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling updateCatalogObjectGrantForAUser");
    }
    if (catalogObjectName == null) {
      throw new ApiException(400, "Missing the required parameter 'catalogObjectName' when calling updateCatalogObjectGrantForAUser");
    }
    if (accessType == null) {
      throw new ApiException(400, "Missing the required parameter 'accessType' when calling updateCatalogObjectGrantForAUser");
    }
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling updateCatalogObjectGrantForAUser");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{catalogObjectName}/grant/user"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{catalogObjectName}", apiClient.escapeString(catalogObjectName));

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
    GenericType<CatalogObjectGrantMetadata> localVarReturnType = new GenericType<CatalogObjectGrantMetadata>() {};
    return apiClient.invokeAPI("CatalogObjectGrantControllerApi.updateCatalogObjectGrantForAUser", localVarPath, "PUT", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
