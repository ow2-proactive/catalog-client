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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-26T11:53:55.670648-05:00[America/New_York]")
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
   * Get list of catalog objects in a PDF report file
   * 
   * @param sessionID sessionID (optional)
   * @param owner The name of the user who owns the Bucket (optional)
   * @param kind The kind of objects that buckets must contain (optional)
   * @param contentType The Content-Type of objects that buckets must contain (optional)
   * @return byte[]
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
     </table>
   */
  public byte[] getReport(String sessionID, String owner, String kind, String contentType) throws ApiException {
    return getReportWithHttpInfo(sessionID, owner, kind, contentType).getData();
  }

  /**
   * Get list of catalog objects in a PDF report file
   * 
   * @param sessionID sessionID (optional)
   * @param owner The name of the user who owns the Bucket (optional)
   * @param kind The kind of objects that buckets must contain (optional)
   * @param contentType The Content-Type of objects that buckets must contain (optional)
   * @return ApiResponse&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<byte[]> getReportWithHttpInfo(String sessionID, String owner, String kind, String contentType) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "owner", owner)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "kind", kind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentType", contentType));

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
   * Get list of selected catalog objects in a PDF report file
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
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
     </table>
   */
  public byte[] getReportForSelectedObjects(String bucketName, String sessionID, String kind, String contentType, List<String> requestBody) throws ApiException {
    return getReportForSelectedObjectsWithHttpInfo(bucketName, sessionID, kind, contentType, requestBody).getData();
  }

  /**
   * Get list of selected catalog objects in a PDF report file
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
       <tr><td> 403 </td><td> Permission denied </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User not authenticated </td><td>  -  </td></tr>
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
