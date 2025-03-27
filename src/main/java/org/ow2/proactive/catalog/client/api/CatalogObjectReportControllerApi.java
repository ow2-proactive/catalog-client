package org.ow2.proactive.catalog.client.api;

import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiResponse;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-27T12:13:03.112691600+01:00[Europe/Berlin]")
public class CatalogObjectReportControllerApi {
  private ApiClient apiClient;

  public CatalogObjectReportControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CatalogObjectReportControllerApi(ApiClient apiClient) {
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
   * Get a ZIP file containing the PDF reports for each catalog objects matching the provided filters
   * 
   * @param sessionID sessionID (optional)
   * @param owner The name of the user who owns the Bucket (optional)
   * @param kind The kind of objects that buckets must contain (optional)
   * @param contentType The Content-Type of objects that buckets must contain (optional)
   * @param projectName The project name of objects containing this name (optional)
   * @param objectName The object name of objects containing this name (optional)
   * @param bucketName The bucket name of catalog objects (optional)
   * @param tag The tag of catalog objects (optional)
   * @param lastCommitBy The user who last committed the catalog object (optional)
   * @param committedAtLeastOnceBy The user who committed at least once in the catalog object (optional)
   * @param lastCommitTimeLessThan The maximum time the object was last committed (optional)
   * @param lastCommitTimeGreater The minimum time the object was last committed (optional)
   * @return byte[]
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public byte[] getReport(String sessionID, String owner, String kind, String contentType, String projectName, String objectName, String bucketName, String tag, String lastCommitBy, String committedAtLeastOnceBy, Long lastCommitTimeLessThan, Long lastCommitTimeGreater) throws ApiException {
    return getReportWithHttpInfo(sessionID, owner, kind, contentType, projectName, objectName, bucketName, tag, lastCommitBy, committedAtLeastOnceBy, lastCommitTimeLessThan, lastCommitTimeGreater).getData();
  }

  /**
   * Get a ZIP file containing the PDF reports for each catalog objects matching the provided filters
   * 
   * @param sessionID sessionID (optional)
   * @param owner The name of the user who owns the Bucket (optional)
   * @param kind The kind of objects that buckets must contain (optional)
   * @param contentType The Content-Type of objects that buckets must contain (optional)
   * @param projectName The project name of objects containing this name (optional)
   * @param objectName The object name of objects containing this name (optional)
   * @param bucketName The bucket name of catalog objects (optional)
   * @param tag The tag of catalog objects (optional)
   * @param lastCommitBy The user who last committed the catalog object (optional)
   * @param committedAtLeastOnceBy The user who committed at least once in the catalog object (optional)
   * @param lastCommitTimeLessThan The maximum time the object was last committed (optional)
   * @param lastCommitTimeGreater The minimum time the object was last committed (optional)
   * @return ApiResponse&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<byte[]> getReportWithHttpInfo(String sessionID, String owner, String kind, String contentType, String projectName, String objectName, String bucketName, String tag, String lastCommitBy, String committedAtLeastOnceBy, Long lastCommitTimeLessThan, Long lastCommitTimeGreater) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "owner", owner)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "kind", kind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentType", contentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectName", projectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "objectName", objectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bucketName", bucketName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastCommitBy", lastCommitBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "committedAtLeastOnceBy", committedAtLeastOnceBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastCommitTimeLessThan", lastCommitTimeLessThan));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastCommitTimeGreater", lastCommitTimeGreater));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (sessionID != null) {
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json", "application/pdf");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI("CatalogObjectReportControllerApi.getReport", "/buckets/report", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get a PDF report file for the selected catalog items
   * 
   * @param bucketName  (required)
   * @param sessionID sessionID (optional)
   * @param kind Filter according to kind. (optional)
   * @param contentType Filter according to Content-Type. (optional)
   * @param requestBody  (optional)
   * @return byte[]
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
     </table>
   */
  public byte[] getReportForSelectedObjects(String bucketName, String sessionID, String kind, String contentType, List<String> requestBody) throws ApiException {
    return getReportForSelectedObjectsWithHttpInfo(bucketName, sessionID, kind, contentType, requestBody).getData();
  }

  /**
   * Get a PDF report file for the selected catalog items
   * 
   * @param bucketName  (required)
   * @param sessionID sessionID (optional)
   * @param kind Filter according to kind. (optional)
   * @param contentType Filter according to Content-Type. (optional)
   * @param requestBody  (optional)
   * @return ApiResponse&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<byte[]> getReportForSelectedObjectsWithHttpInfo(String bucketName, String sessionID, String kind, String contentType, List<String> requestBody) throws ApiException {
    // Check required parameters
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getReportForSelectedObjects");
    }

    // Path parameters
    String localVarPath = "/buckets/report/selected/{bucketName}"
            .replaceAll("\\{bucketName}", apiClient.escapeString(bucketName));

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

    String localVarAccept = apiClient.selectHeaderAccept("application/json", "application/pdf");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI("CatalogObjectReportControllerApi.getReportForSelectedObjects", localVarPath, "POST", localVarQueryParams, requestBody,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
