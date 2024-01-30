package org.ow2.proactive.catalog.client.api;

import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiResponse;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.Pair;

import javax.ws.rs.core.GenericType;

import org.ow2.proactive.catalog.client.model.CatalogObjectDependencies;
import org.ow2.proactive.catalog.client.model.CatalogObjectMetadata;
import org.ow2.proactive.catalog.client.model.CatalogObjectMetadataList;
import org.ow2.proactive.catalog.client.model.CatalogObjectNameReference;
import java.io.File;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-26T11:53:55.670648-05:00[America/New_York]")
public class CatalogObjectControllerApi {
  private ApiClient apiClient;

  public CatalogObjectControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CatalogObjectControllerApi(ApiClient apiClient) {
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
   * Creates a new catalog object
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param kind Kind of the new object (required)
   * @param commitMessage Commit message (required)
   * @param objectContentType The Content-Type of CatalogRawObject - MIME type (required)
   * @param _file The content of CatalogRawObject (required)
   * @param name Name of the object or empty when a ZIP archive is uploaded.&lt;br/&gt;All objects inside an archive will be stored inside the catalog. (optional)
   * @param projectName Project of the object (optional, default to )
   * @param tags List of comma separated tags of the object (optional)
   * @return CatalogObjectMetadataList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Invalid file content supplied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectMetadataList create1(String sessionID, String bucketName, String kind, String commitMessage, String objectContentType, File _file, String name, String projectName, String tags) throws ApiException {
    return create1WithHttpInfo(sessionID, bucketName, kind, commitMessage, objectContentType, _file, name, projectName, tags).getData();
  }

  /**
   * Creates a new catalog object
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param kind Kind of the new object (required)
   * @param commitMessage Commit message (required)
   * @param objectContentType The Content-Type of CatalogRawObject - MIME type (required)
   * @param _file The content of CatalogRawObject (required)
   * @param name Name of the object or empty when a ZIP archive is uploaded.&lt;br/&gt;All objects inside an archive will be stored inside the catalog. (optional)
   * @param projectName Project of the object (optional, default to )
   * @param tags List of comma separated tags of the object (optional)
   * @return ApiResponse&lt;CatalogObjectMetadataList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Invalid file content supplied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectMetadataList> create1WithHttpInfo(String sessionID, String bucketName, String kind, String commitMessage, String objectContentType, File _file, String name, String projectName, String tags) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling create1");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling create1");
    }
    if (kind == null) {
      throw new ApiException(400, "Missing the required parameter 'kind' when calling create1");
    }
    if (commitMessage == null) {
      throw new ApiException(400, "Missing the required parameter 'commitMessage' when calling create1");
    }
    if (objectContentType == null) {
      throw new ApiException(400, "Missing the required parameter 'objectContentType' when calling create1");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling create1");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "name", name)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectName", projectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "kind", kind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "commitMessage", commitMessage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "objectContentType", objectContentType));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams.put("file", _file);

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    GenericType<CatalogObjectMetadataList> localVarReturnType = new GenericType<CatalogObjectMetadataList>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.create1", localVarPath, "POST", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete a catalog object
   * Note: delete the entire catalog object as well as its revisions. Returns the deleted CatalogObject&#39;s metadata.
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the Object to delete (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket or object not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
     </table>
   */
  public void delete1(String sessionID, String bucketName, String name) throws ApiException {
    delete1WithHttpInfo(sessionID, bucketName, name);
  }

  /**
   * Delete a catalog object
   * Note: delete the entire catalog object as well as its revisions. Returns the deleted CatalogObject&#39;s metadata.
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the Object to delete (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket or object not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> delete1WithHttpInfo(String sessionID, String bucketName, String name) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling delete1");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling delete1");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling delete1");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{name}"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{name}", apiClient.escapeString(name));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("CatalogObjectControllerApi.delete1", localVarPath, "DELETE", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Export catalog objects as a plain zip archive or a ProActive Catalog Package
   * Can either export catalog objects as a plain zip or as a ProActive Package containing the exported files along with a METADATA json file describing the exported objects. &lt;br/&gt; Note: Returns catalog objects metadata associated to the latest revision.
   * @param bucketName  (required)
   * @param sessionID sessionID (optional)
   * @param isPlainZip Plain zip instead of a Proactive package (optional, default to false)
   * @param requestBody An optional json list of catalog object names to export. If not provided, the bucket will be exported fully. (optional)
   * @return List&lt;CatalogObjectMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 206 </td><td> Missing object </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket not found or no object was found </td><td>  -  </td></tr>
     </table>
   */
  public List<CatalogObjectMetadata> exportCatalogObjects(String bucketName, String sessionID, Boolean isPlainZip, List<String> requestBody) throws ApiException {
    return exportCatalogObjectsWithHttpInfo(bucketName, sessionID, isPlainZip, requestBody).getData();
  }

  /**
   * Export catalog objects as a plain zip archive or a ProActive Catalog Package
   * Can either export catalog objects as a plain zip or as a ProActive Package containing the exported files along with a METADATA json file describing the exported objects. &lt;br/&gt; Note: Returns catalog objects metadata associated to the latest revision.
   * @param bucketName  (required)
   * @param sessionID sessionID (optional)
   * @param isPlainZip Plain zip instead of a Proactive package (optional, default to false)
   * @param requestBody An optional json list of catalog object names to export. If not provided, the bucket will be exported fully. (optional)
   * @return ApiResponse&lt;List&lt;CatalogObjectMetadata&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 206 </td><td> Missing object </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket not found or no object was found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CatalogObjectMetadata>> exportCatalogObjectsWithHttpInfo(String bucketName, String sessionID, Boolean isPlainZip, List<String> requestBody) throws ApiException {
    // Check required parameters
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling exportCatalogObjects");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/export"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isPlainZip", isPlainZip)
    );

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<List<CatalogObjectMetadata>> localVarReturnType = new GenericType<List<CatalogObjectMetadata>>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.exportCatalogObjects", localVarPath, "POST", localVarQueryParams, requestBody,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Gets a catalog object&#39;s metadata by IDs
   * Note: returns metadata associated to the latest revision of the catalog object.
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param sessionID sessionID (optional)
   * @param checkAssociationStatus Check job planner association status (optional, default to false)
   * @return CatalogObjectMetadata
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
  public CatalogObjectMetadata get(String bucketName, String name, String sessionID, Boolean checkAssociationStatus) throws ApiException {
    return getWithHttpInfo(bucketName, name, sessionID, checkAssociationStatus).getData();
  }

  /**
   * Gets a catalog object&#39;s metadata by IDs
   * Note: returns metadata associated to the latest revision of the catalog object.
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param sessionID sessionID (optional)
   * @param checkAssociationStatus Check job planner association status (optional, default to false)
   * @return ApiResponse&lt;CatalogObjectMetadata&gt;
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
  public ApiResponse<CatalogObjectMetadata> getWithHttpInfo(String bucketName, String name, String sessionID, Boolean checkAssociationStatus) throws ApiException {
    // Check required parameters
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling get");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling get");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{name}"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{name}", apiClient.escapeString(name));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "checkAssociationStatus", checkAssociationStatus)
    );

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CatalogObjectMetadata> localVarReturnType = new GenericType<CatalogObjectMetadata>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.get", localVarPath, "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Gets dependencies (dependsOn and calledBy) of a catalog object
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param sessionID sessionID (optional)
   * @return CatalogObjectDependencies
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
  public CatalogObjectDependencies getDependencies(String bucketName, String name, String sessionID) throws ApiException {
    return getDependenciesWithHttpInfo(bucketName, name, sessionID).getData();
  }

  /**
   * Gets dependencies (dependsOn and calledBy) of a catalog object
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param sessionID sessionID (optional)
   * @return ApiResponse&lt;CatalogObjectDependencies&gt;
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
  public ApiResponse<CatalogObjectDependencies> getDependenciesWithHttpInfo(String bucketName, String name, String sessionID) throws ApiException {
    // Check required parameters
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getDependencies");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getDependencies");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{name}/dependencies"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{name}", apiClient.escapeString(name));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CatalogObjectDependencies> localVarReturnType = new GenericType<CatalogObjectDependencies>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.getDependencies", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Gets the raw content of the last revision of a catalog object
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
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
  public String getRaw1(String bucketName, String name, String sessionID) throws ApiException {
    return getRaw1WithHttpInfo(bucketName, name, sessionID).getData();
  }

  /**
   * Gets the raw content of the last revision of a catalog object
   * 
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
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
  public ApiResponse<String> getRaw1WithHttpInfo(String bucketName, String name, String sessionID) throws ApiException {
    // Check required parameters
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getRaw1");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getRaw1");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{name}/raw"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{name}", apiClient.escapeString(name));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.getRaw1", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Import an archive, either a plain zip or a ProActive Catalog package
   * Can either import objects from a plain zip archive, in which case the objects kind, project name and tags must be specified. Alternatively, a ProActive Catalog package can be imported, the various information will be obtained from the METADATA json file present in the package.
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param _file The ProActive package zip file (required)
   * @param isPlainZip Plain zip instead of a Proactive package (optional, default to false)
   * @param commitMessage Commit message. If empty, the message will either be empty for a plain zip or the commit message recorded inside the ProActive Catalog package. (optional, default to )
   * @param kind Kind of the new object (only used when importing a plain zip) (optional)
   * @param projectName Project of the package objects (Optional). If used with a ProActive Catalog package, will override all objects project names. (optional, default to )
   * @param tags List of comma separated tags of the objects (Optional). If used with a ProActive Catalog package, will override all objects tags. (optional)
   * @return CatalogObjectMetadataList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Invalid file content supplied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectMetadataList importCatalogObjects(String sessionID, String bucketName, File _file, Boolean isPlainZip, String commitMessage, String kind, String projectName, String tags) throws ApiException {
    return importCatalogObjectsWithHttpInfo(sessionID, bucketName, _file, isPlainZip, commitMessage, kind, projectName, tags).getData();
  }

  /**
   * Import an archive, either a plain zip or a ProActive Catalog package
   * Can either import objects from a plain zip archive, in which case the objects kind, project name and tags must be specified. Alternatively, a ProActive Catalog package can be imported, the various information will be obtained from the METADATA json file present in the package.
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param _file The ProActive package zip file (required)
   * @param isPlainZip Plain zip instead of a Proactive package (optional, default to false)
   * @param commitMessage Commit message. If empty, the message will either be empty for a plain zip or the commit message recorded inside the ProActive Catalog package. (optional, default to )
   * @param kind Kind of the new object (only used when importing a plain zip) (optional)
   * @param projectName Project of the package objects (Optional). If used with a ProActive Catalog package, will override all objects project names. (optional, default to )
   * @param tags List of comma separated tags of the objects (Optional). If used with a ProActive Catalog package, will override all objects tags. (optional)
   * @return ApiResponse&lt;CatalogObjectMetadataList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Invalid file content supplied </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectMetadataList> importCatalogObjectsWithHttpInfo(String sessionID, String bucketName, File _file, Boolean isPlainZip, String commitMessage, String kind, String projectName, String tags) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling importCatalogObjects");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling importCatalogObjects");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling importCatalogObjects");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/import"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isPlainZip", isPlainZip)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "commitMessage", commitMessage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "kind", kind));
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
    GenericType<CatalogObjectMetadataList> localVarReturnType = new GenericType<CatalogObjectMetadataList>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.importCatalogObjects", localVarPath, "POST", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Lists catalog objects metadata
   * Note: Returns catalog objects metadata associated to the latest revision.
   * @param bucketName  (required)
   * @param sessionID sessionID (optional)
   * @param kind Filter according to kind(s).&lt;br/&gt;Multiple kinds can be specified using comma separators (optional)
   * @param contentType Filter according to Content-Type. (optional)
   * @param objectName Filter according to Object Name. (optional)
   * @param objectTag Filter according to Object Tag. (optional)
   * @param associationStatus Filter according to Job-Planner association status.&lt;br/&gt;If enabled, only objects for which a job-planner association exists with the provided status will be returned.&lt;br/&gt;Parameter can be ALL, PLANNED, DEACTIVATED, FAILED or UNPLANNED.&lt;br/&gt;ALL will filter objects which have an association with any status.&lt;br/&gt;UNPLANNED will filter objects without any association. (optional)
   * @param projectName Include only objects whose project name contains the given string. (optional)
   * @param lastCommitBy Include only objects whose last commit belong to the given user. (optional)
   * @param lastCommitTimeGreater Include only objects whose last commit time is greater than the given EPOCH time. (optional)
   * @param lastCommitTimeLessThan Include only objects whose last commit time is less than the given EPOCH time. (optional)
   * @param listObjectNamesForArchive Give a list of name separated by comma to get them in an archive (optional)
   * @param pageNo Page number (optional, default to 0)
   * @param pageSize Page size (optional, default to 2147483647)
   * @return List&lt;CatalogObjectMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 206 </td><td> Missing object </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
     </table>
   */
  public List<CatalogObjectMetadata> list1(String bucketName, String sessionID, String kind, String contentType, String objectName, String objectTag, String associationStatus, String projectName, String lastCommitBy, Long lastCommitTimeGreater, Long lastCommitTimeLessThan, List<String> listObjectNamesForArchive, Integer pageNo, Integer pageSize) throws ApiException {
    return list1WithHttpInfo(bucketName, sessionID, kind, contentType, objectName, objectTag, associationStatus, projectName, lastCommitBy, lastCommitTimeGreater, lastCommitTimeLessThan, listObjectNamesForArchive, pageNo, pageSize).getData();
  }

  /**
   * Lists catalog objects metadata
   * Note: Returns catalog objects metadata associated to the latest revision.
   * @param bucketName  (required)
   * @param sessionID sessionID (optional)
   * @param kind Filter according to kind(s).&lt;br/&gt;Multiple kinds can be specified using comma separators (optional)
   * @param contentType Filter according to Content-Type. (optional)
   * @param objectName Filter according to Object Name. (optional)
   * @param objectTag Filter according to Object Tag. (optional)
   * @param associationStatus Filter according to Job-Planner association status.&lt;br/&gt;If enabled, only objects for which a job-planner association exists with the provided status will be returned.&lt;br/&gt;Parameter can be ALL, PLANNED, DEACTIVATED, FAILED or UNPLANNED.&lt;br/&gt;ALL will filter objects which have an association with any status.&lt;br/&gt;UNPLANNED will filter objects without any association. (optional)
   * @param projectName Include only objects whose project name contains the given string. (optional)
   * @param lastCommitBy Include only objects whose last commit belong to the given user. (optional)
   * @param lastCommitTimeGreater Include only objects whose last commit time is greater than the given EPOCH time. (optional)
   * @param lastCommitTimeLessThan Include only objects whose last commit time is less than the given EPOCH time. (optional)
   * @param listObjectNamesForArchive Give a list of name separated by comma to get them in an archive (optional)
   * @param pageNo Page number (optional, default to 0)
   * @param pageSize Page size (optional, default to 2147483647)
   * @return ApiResponse&lt;List&lt;CatalogObjectMetadata&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 206 </td><td> Missing object </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CatalogObjectMetadata>> list1WithHttpInfo(String bucketName, String sessionID, String kind, String contentType, String objectName, String objectTag, String associationStatus, String projectName, String lastCommitBy, Long lastCommitTimeGreater, Long lastCommitTimeLessThan, List<String> listObjectNamesForArchive, Integer pageNo, Integer pageSize) throws ApiException {
    // Check required parameters
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling list1");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "kind", kind)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentType", contentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "objectName", objectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "objectTag", objectTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "associationStatus", associationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectName", projectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastCommitBy", lastCommitBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastCommitTimeGreater", lastCommitTimeGreater));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastCommitTimeLessThan", lastCommitTimeLessThan));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "listObjectNamesForArchive", listObjectNamesForArchive));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNo", pageNo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<CatalogObjectMetadata>> localVarReturnType = new GenericType<List<CatalogObjectMetadata>>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.list1", localVarPath, "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Lists catalog object name references by kind and Content-Type
   * 
   * @param sessionID sessionID (optional)
   * @param kind Filter according to kind (optional)
   * @param contentType Filter according to Content-Type (optional)
   * @return List&lt;CatalogObjectNameReference&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public List<CatalogObjectNameReference> listCatalogObjectNameReference(String sessionID, String kind, String contentType) throws ApiException {
    return listCatalogObjectNameReferenceWithHttpInfo(sessionID, kind, contentType).getData();
  }

  /**
   * Lists catalog object name references by kind and Content-Type
   * 
   * @param sessionID sessionID (optional)
   * @param kind Filter according to kind (optional)
   * @param contentType Filter according to Content-Type (optional)
   * @return ApiResponse&lt;List&lt;CatalogObjectNameReference&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CatalogObjectNameReference>> listCatalogObjectNameReferenceWithHttpInfo(String sessionID, String kind, String contentType) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "kind", kind)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentType", contentType));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<CatalogObjectNameReference>> localVarReturnType = new GenericType<List<CatalogObjectNameReference>>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.listCatalogObjectNameReference", "/buckets/references", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Lists all Content-Types for all objects
   * 
   * @return Set&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<String> listContentTypes() throws ApiException {
    return listContentTypesWithHttpInfo().getData();
  }

  /**
   * Lists all Content-Types for all objects
   * 
   * @return ApiResponse&lt;Set&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<String>> listContentTypesWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<String>> localVarReturnType = new GenericType<Set<String>>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.listContentTypes", "/buckets/content-types", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Lists all kinds for all objects
   * 
   * @return Set&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<String> listKinds() throws ApiException {
    return listKindsWithHttpInfo().getData();
  }

  /**
   * Lists all kinds for all objects
   * 
   * @return ApiResponse&lt;Set&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<String>> listKindsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<String>> localVarReturnType = new GenericType<Set<String>>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.listKinds", "/buckets/kinds", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Lists all tags values for all objects stored in the catalog
   * 
   * @return Set&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public Set<String> listObjectTags() throws ApiException {
    return listObjectTagsWithHttpInfo().getData();
  }

  /**
   * Lists all tags values for all objects stored in the catalog
   * 
   * @return ApiResponse&lt;Set&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Set<String>> listObjectTagsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Set<String>> localVarReturnType = new GenericType<Set<String>>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.listObjectTags", "/buckets/tags", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update a catalog object metadata, like kind, Content-Type, project name and tags
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param kind The new kind of an object (optional)
   * @param contentType The new Content-Type of an object - MIME type (optional)
   * @param projectName The new project name of an object (optional)
   * @param tags List of comma separated tags of the object (optional)
   * @return CatalogObjectMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket, object or revision not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Wrong specified parameters: at least one should be present </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public CatalogObjectMetadata updateObjectMetadata(String sessionID, String bucketName, String name, String kind, String contentType, String projectName, String tags) throws ApiException {
    return updateObjectMetadataWithHttpInfo(sessionID, bucketName, name, kind, contentType, projectName, tags).getData();
  }

  /**
   * Update a catalog object metadata, like kind, Content-Type, project name and tags
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket (required)
   * @param name The name of the existing Object (required)
   * @param kind The new kind of an object (optional)
   * @param contentType The new Content-Type of an object - MIME type (optional)
   * @param projectName The new project name of an object (optional)
   * @param tags List of comma separated tags of the object (optional)
   * @return ApiResponse&lt;CatalogObjectMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Bucket, object or revision not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Wrong specified parameters: at least one should be present </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatalogObjectMetadata> updateObjectMetadataWithHttpInfo(String sessionID, String bucketName, String name, String kind, String contentType, String projectName, String tags) throws ApiException {
    // Check required parameters
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling updateObjectMetadata");
    }
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling updateObjectMetadata");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling updateObjectMetadata");
    }

    // Path parameters
    String localVarPath = "/buckets/{bucketName}/resources/{name}"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName))
            .replaceAll("\\{name}", apiClient.escapeString(name));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "kind", kind)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentType", contentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectName", projectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CatalogObjectMetadata> localVarReturnType = new GenericType<CatalogObjectMetadata>() {};
    return apiClient.invokeAPI("CatalogObjectControllerApi.updateObjectMetadata", localVarPath, "PUT", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
