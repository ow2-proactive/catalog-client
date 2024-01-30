# GraphqlControllerApi

All URIs are relative to *https://trydev2.activeeon.com:8443/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**executeOperation**](GraphqlControllerApi.md#executeOperation) | **POST** /graphql |  |



## executeOperation

> Map&lt;String, Object&gt; executeOperation(sessionid, requestBody)



### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.GraphqlControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        GraphqlControllerApi apiInstance = new GraphqlControllerApi(defaultClient);
        String sessionid = "sessionid_example"; // String | 
        Map<String, Object> requestBody = null; // Map<String, Object> | 
        try {
            Map<String, Object> result = apiInstance.executeOperation(sessionid, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GraphqlControllerApi#executeOperation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionid** | **String**|  | |
| **requestBody** | **Map&lt;String,Object&gt;**|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

