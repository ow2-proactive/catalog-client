# CatalogObjectCallGraphControllerApi

All URIs are relative to *https://trydev2.activeeon.com:8443/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCallGraph**](CatalogObjectCallGraphControllerApi.md#getCallGraph) | **GET** /buckets/call-graph | Get the call graph of all catalog objects in a PDF report |
| [**getCallGraphForSelectedObjects**](CatalogObjectCallGraphControllerApi.md#getCallGraphForSelectedObjects) | **GET** /buckets/call-graph/selected/{bucketName} | Get the call graph of selected catalog objects in a bucket |



## getCallGraph

> byte[] getCallGraph(sessionID, owner, kind, contentType)

Get the call graph of all catalog objects in a PDF report

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectCallGraphControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectCallGraphControllerApi apiInstance = new CatalogObjectCallGraphControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String owner = "owner_example"; // String | The name of the user who owns the Bucket
        String kind = "kind_example"; // String | The kind of objects that buckets must contain
        String contentType = "contentType_example"; // String | The Content-Type of objects that buckets must contain
        try {
            byte[] result = apiInstance.getCallGraph(sessionID, owner, kind, contentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectCallGraphControllerApi#getCallGraph");
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
| **sessionID** | **String**| sessionID | [optional] |
| **owner** | **String**| The name of the user who owns the Bucket | [optional] |
| **kind** | **String**| The kind of objects that buckets must contain | [optional] |
| **contentType** | **String**| The Content-Type of objects that buckets must contain | [optional] |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Permission denied |  -  |
| **200** | OK |  -  |
| **401** | User not authenticated |  -  |


## getCallGraphForSelectedObjects

> byte[] getCallGraphForSelectedObjects(bucketName, sessionID, owner, kind, contentType, name)

Get the call graph of selected catalog objects in a bucket

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectCallGraphControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectCallGraphControllerApi apiInstance = new CatalogObjectCallGraphControllerApi(defaultClient);
        String bucketName = "bucketName_example"; // String | 
        String sessionID = "sessionID_example"; // String | sessionID
        String owner = "owner_example"; // String | The name of the user who owns the Bucket
        String kind = "kind_example"; // String | Filter according to kind.
        String contentType = "contentType_example"; // String | Filter according to Content-Type.
        List<String> name = Arrays.asList(); // List<String> | Give a list of name separated by comma to get them in the report
        try {
            byte[] result = apiInstance.getCallGraphForSelectedObjects(bucketName, sessionID, owner, kind, contentType, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectCallGraphControllerApi#getCallGraphForSelectedObjects");
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
| **bucketName** | **String**|  | |
| **sessionID** | **String**| sessionID | [optional] |
| **owner** | **String**| The name of the user who owns the Bucket | [optional] |
| **kind** | **String**| Filter according to kind. | [optional] |
| **contentType** | **String**| Filter according to Content-Type. | [optional] |
| **name** | **List&lt;String&gt;**| Give a list of name separated by comma to get them in the report | [optional] |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Permission denied |  -  |
| **200** | OK |  -  |
| **404** | Bucket not found |  -  |
| **401** | User not authenticated |  -  |

