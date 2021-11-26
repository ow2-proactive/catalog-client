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

import org.ow2.proactive.catalog.client.model.CatalogObjectMetadata;
import java.io.File;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-26T13:41:32.805+01:00")
public class CatalogObjectRevisionControllerApi {
  private ApiClient apiClient;

  public CatalogObjectRevisionControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

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
   * @param sessionID sessionID (required)
   * @param bucketName bucketName (required)
   * @param name name (required)
   * @param commitMessage The commit message of the CatalogRawObject Revision (required)
   * @param file file (required)
   * @param projectName Project of the object (optional)
   * @return CatalogObjectMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectMetadata createUsingPOST2(String sessionID, String bucketName, String name, String commitMessage, File file, String projectName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling createUsingPOST2");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling createUsingPOST2");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling createUsingPOST2");
    }
    
    // verify the required parameter 'commitMessage' is set
    if (commitMessage == null) {
      throw new ApiException(400, "Missing the required parameter 'commitMessage' when calling createUsingPOST2");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling createUsingPOST2");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{name}/revisions"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("commitMessage", commitMessage));
    localVarQueryParams.addAll(apiClient.parameterToPair("projectName", projectName));

    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CatalogObjectMetadata> localVarReturnType = new GenericType<CatalogObjectMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets the raw content of a specific revision
   * 
   * @param bucketName bucketName (required)
   * @param name name (required)
   * @param commitTimeRaw commitTimeRaw (required)
   * @param sessionID sessionID (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getRawUsingGET1(String bucketName, String name, Long commitTimeRaw, String sessionID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getRawUsingGET1");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getRawUsingGET1");
    }
    
    // verify the required parameter 'commitTimeRaw' is set
    if (commitTimeRaw == null) {
      throw new ApiException(400, "Missing the required parameter 'commitTimeRaw' when calling getRawUsingGET1");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw}/raw"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "commitTimeRaw" + "\\}", apiClient.escapeString(commitTimeRaw.toString()));

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

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a specific revision
   * 
   * @param bucketName bucketName (required)
   * @param name name (required)
   * @param commitTimeRaw commitTimeRaw (required)
   * @param sessionID sessionID (optional)
   * @return CatalogObjectMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectMetadata getUsingGET1(String bucketName, String name, Long commitTimeRaw, String sessionID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getUsingGET1");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getUsingGET1");
    }
    
    // verify the required parameter 'commitTimeRaw' is set
    if (commitTimeRaw == null) {
      throw new ApiException(400, "Missing the required parameter 'commitTimeRaw' when calling getUsingGET1");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "commitTimeRaw" + "\\}", apiClient.escapeString(commitTimeRaw.toString()));

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

    GenericType<CatalogObjectMetadata> localVarReturnType = new GenericType<CatalogObjectMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Lists a catalog object revisions
   * 
   * @param bucketName bucketName (required)
   * @param name name (required)
   * @param sessionID sessionID (optional)
   * @return List&lt;CatalogObjectMetadata&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CatalogObjectMetadata> listUsingGET2(String bucketName, String name, String sessionID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling listUsingGET2");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling listUsingGET2");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{name}/revisions"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

    GenericType<List<CatalogObjectMetadata>> localVarReturnType = new GenericType<List<CatalogObjectMetadata>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Restore a catalog object revision
   * 
   * @param sessionID sessionID (required)
   * @param bucketName bucketName (required)
   * @param name name (required)
   * @param commitTimeRaw commitTimeRaw (required)
   * @return CatalogObjectMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectMetadata restoreUsingPUT(String sessionID, String bucketName, String name, Long commitTimeRaw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling restoreUsingPUT");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling restoreUsingPUT");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling restoreUsingPUT");
    }
    
    // verify the required parameter 'commitTimeRaw' is set
    if (commitTimeRaw == null) {
      throw new ApiException(400, "Missing the required parameter 'commitTimeRaw' when calling restoreUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "commitTimeRaw" + "\\}", apiClient.escapeString(commitTimeRaw.toString()));

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

    GenericType<CatalogObjectMetadata> localVarReturnType = new GenericType<CatalogObjectMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
