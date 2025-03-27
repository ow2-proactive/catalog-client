# CatalogObjectCallGraphControllerApi

All URIs are relative to *https://trydev2.activeeon.com:8443/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCallGraph**](CatalogObjectCallGraphControllerApi.md#getCallGraph) | **GET** /buckets/call-graph | Get a ZIP file containing a call graph report for each catalog objects matching the provided filters |
| [**getCallGraphForSelectedObjects**](CatalogObjectCallGraphControllerApi.md#getCallGraphForSelectedObjects) | **GET** /buckets/call-graph/selected/{bucketName} | Get the call graph of selected catalog objects in a bucket |



## getCallGraph

> byte[] getCallGraph(sessionID, owner, kind, contentType, projectName, objectName, bucketName, tag, lastCommitBy, committedAtLeastOnceBy, lastCommitTimeLessThan, lastCommitTimeGreater)

Get a ZIP file containing a call graph report for each catalog objects matching the provided filters

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
        String projectName = "projectName_example"; // String | The project name of objects containing this name
        String objectName = "objectName_example"; // String | The object name of objects containing this name
        String bucketName = "bucketName_example"; // String | The bucket name of catalog objects
        String tag = "tag_example"; // String | The tag of catalog objects
        String lastCommitBy = "lastCommitBy_example"; // String | The user who last committed the catalog object
        String committedAtLeastOnceBy = "committedAtLeastOnceBy_example"; // String | The user committed at least once in the catalog object
        Long lastCommitTimeLessThan = 56L; // Long | The maximum time the object was last committed
        Long lastCommitTimeGreater = 56L; // Long | The minimum time the object was last committed
        try {
            byte[] result = apiInstance.getCallGraph(sessionID, owner, kind, contentType, projectName, objectName, bucketName, tag, lastCommitBy, committedAtLeastOnceBy, lastCommitTimeLessThan, lastCommitTimeGreater);
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
| **projectName** | **String**| The project name of objects containing this name | [optional] |
| **objectName** | **String**| The object name of objects containing this name | [optional] |
| **bucketName** | **String**| The bucket name of catalog objects | [optional] |
| **tag** | **String**| The tag of catalog objects | [optional] |
| **lastCommitBy** | **String**| The user who last committed the catalog object | [optional] |
| **committedAtLeastOnceBy** | **String**| The user committed at least once in the catalog object | [optional] |
| **lastCommitTimeLessThan** | **Long**| The maximum time the object was last committed | [optional] |
| **lastCommitTimeGreater** | **Long**| The minimum time the object was last committed | [optional] |

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
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **200** | OK |  -  |


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
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **200** | OK |  -  |
| **404** | Bucket not found |  -  |

