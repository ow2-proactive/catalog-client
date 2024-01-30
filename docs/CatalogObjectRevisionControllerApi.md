# CatalogObjectRevisionControllerApi

All URIs are relative to *https://trydev2.activeeon.com:8443/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create2**](CatalogObjectRevisionControllerApi.md#create2) | **POST** /buckets/{bucketName}/resources/{name}/revisions | Creates a new catalog object revision |
| [**get1**](CatalogObjectRevisionControllerApi.md#get1) | **GET** /buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw} | Gets a specific revision |
| [**getRaw**](CatalogObjectRevisionControllerApi.md#getRaw) | **GET** /buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw}/raw | Gets the raw content of a specific revision |
| [**list2**](CatalogObjectRevisionControllerApi.md#list2) | **GET** /buckets/{bucketName}/resources/{name}/revisions | Lists a catalog object revisions |
| [**restore**](CatalogObjectRevisionControllerApi.md#restore) | **PUT** /buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw} | Restore a catalog object revision |



## create2

> CatalogObjectMetadata create2(sessionID, bucketName, name, commitMessage, _file, projectName, tags)

Creates a new catalog object revision

### Example

```java
import java.io.File;
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectRevisionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String name = "name_example"; // String | The name of the existing Object
        String commitMessage = "commitMessage_example"; // String | The commit message of the CatalogRawObject Revision
        File _file = new File("/path/to/file"); // File | 
        String projectName = ""; // String | Project of the object
        String tags = ""; // String | Tags of the object
        try {
            CatalogObjectMetadata result = apiInstance.create2(sessionID, bucketName, name, commitMessage, _file, projectName, tags);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectRevisionControllerApi#create2");
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
| **sessionID** | **String**| sessionID | |
| **bucketName** | **String**| The name of the existing Bucket | |
| **name** | **String**| The name of the existing Object | |
| **commitMessage** | **String**| The commit message of the CatalogRawObject Revision | |
| **_file** | **File**|  | |
| **projectName** | **String**| Project of the object | [optional] [default to ] |
| **tags** | **String**| Tags of the object | [optional] [default to ] |

### Return type

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket not found |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **422** | Invalid catalog object JSON content supplied |  -  |
| **201** | Created |  -  |


## get1

> CatalogObjectMetadata get1(bucketName, name, commitTimeRaw, sessionID)

Gets a specific revision

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectRevisionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String name = "name_example"; // String | The name of the existing Object
        Long commitTimeRaw = 56L; // Long | 
        String sessionID = "sessionID_example"; // String | sessionID
        try {
            CatalogObjectMetadata result = apiInstance.get1(bucketName, name, commitTimeRaw, sessionID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectRevisionControllerApi#get1");
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
| **bucketName** | **String**| The name of the existing Bucket | |
| **name** | **String**| The name of the existing Object | |
| **commitTimeRaw** | **Long**|  | |
| **sessionID** | **String**| sessionID | [optional] |

### Return type

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket, catalog object or catalog object revision not found |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **200** | OK |  -  |


## getRaw

> String getRaw(bucketName, name, commitTimeRaw, sessionID)

Gets the raw content of a specific revision

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectRevisionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String name = "name_example"; // String | The name of the existing Object
        Long commitTimeRaw = 56L; // Long | 
        String sessionID = "sessionID_example"; // String | sessionID
        try {
            String result = apiInstance.getRaw(bucketName, name, commitTimeRaw, sessionID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectRevisionControllerApi#getRaw");
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
| **bucketName** | **String**| The name of the existing Bucket | |
| **name** | **String**| The name of the existing Object | |
| **commitTimeRaw** | **Long**|  | |
| **sessionID** | **String**| sessionID | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket, catalog object or catalog object revision not found |  -  |
| **200** | Ok |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |


## list2

> List&lt;CatalogObjectMetadata&gt; list2(bucketName, name, sessionID)

Lists a catalog object revisions

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectRevisionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String name = "name_example"; // String | The name of the existing Object
        String sessionID = "sessionID_example"; // String | sessionID
        try {
            List<CatalogObjectMetadata> result = apiInstance.list2(bucketName, name, sessionID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectRevisionControllerApi#list2");
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
| **bucketName** | **String**| The name of the existing Bucket | |
| **name** | **String**| The name of the existing Object | |
| **sessionID** | **String**| sessionID | [optional] |

### Return type

[**List&lt;CatalogObjectMetadata&gt;**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **404** | Bucket or catalog object not found |  -  |
| **200** | OK |  -  |


## restore

> CatalogObjectMetadata restore(sessionID, bucketName, name, commitTimeRaw)

Restore a catalog object revision

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectRevisionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String name = "name_example"; // String | The name of the existing Object
        Long commitTimeRaw = 56L; // Long | 
        try {
            CatalogObjectMetadata result = apiInstance.restore(sessionID, bucketName, name, commitTimeRaw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectRevisionControllerApi#restore");
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
| **sessionID** | **String**| sessionID | |
| **bucketName** | **String**| The name of the existing Bucket | |
| **name** | **String**| The name of the existing Object | |
| **commitTimeRaw** | **Long**|  | |

### Return type

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket, object or revision not found |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **422** | Invalid catalog object JSON content supplied |  -  |
| **200** | OK |  -  |

