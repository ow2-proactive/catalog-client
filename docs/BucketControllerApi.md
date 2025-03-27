# BucketControllerApi

All URIs are relative to *https://trydev2.activeeon.com:8443/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](BucketControllerApi.md#callList) | **GET** /buckets | Lists the buckets |
| [**cleanEmpty**](BucketControllerApi.md#cleanEmpty) | **DELETE** /buckets | Delete the empty buckets |
| [**create**](BucketControllerApi.md#create) | **POST** /buckets | Creates a new bucket |
| [**delete**](BucketControllerApi.md#delete) | **DELETE** /buckets/{bucketName} | Delete an empty bucket |
| [**getMetadata**](BucketControllerApi.md#getMetadata) | **GET** /buckets/{bucketName} | Gets a bucket&#39;s metadata by ID |
| [**updateBucketOwner**](BucketControllerApi.md#updateBucketOwner) | **PUT** /buckets/{bucketName} | Update bucket owner |



## callList

> List&lt;BucketMetadata&gt; callList(sessionID, owner, tenant, kind, contentType, objectTag, associationStatus, objectName, bucketName, projectName, lastCommitBy, committedAtLeastOnceBy, lastCommitTimeGreater, lastCommitTimeLessThan, allBuckets)

Lists the buckets

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketControllerApi apiInstance = new BucketControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String owner = "owner_example"; // String | The name of the user who owns the Bucket
        String tenant = "tenant_example"; // String | The name of the tenant that has access to the Bucket
        String kind = "kind_example"; // String | The kind(s) of objects that buckets must contain.<br />Multiple kinds can be specified using comma separators
        String contentType = "contentType_example"; // String | The Content-Type of objects that buckets must contain
        String objectTag = "objectTag_example"; // String | The tag of objects that buckets must contain
        String associationStatus = "ALL"; // String | The buckets must contain objects which have the given job-planner association status.<br />Can be ALL, PLANNED, DEACTIVATED, FAILED or UNPLANNED.<br />ALL will filter objects which have an association with any status.<br />UNPLANNED will filter objects without any association.
        String objectName = "objectName_example"; // String | The name of objects that buckets must contain
        String bucketName = "bucketName_example"; // String | The bucket name contains the value of this parameter (case insensitive)
        String projectName = "projectName_example"; // String | Include only objects whose project name contains the given string.
        String lastCommitBy = "lastCommitBy_example"; // String | Include only objects whose last commit belong to the given user.
        String committedAtLeastOnceBy = "committedAtLeastOnceBy_example"; // String | Include only objects have been committed at least once by the given user.
        Long lastCommitTimeGreater = 0L; // Long | Include only objects whose last commit time is greater than the given EPOCH time.
        Long lastCommitTimeLessThan = 0L; // Long | Include only objects whose last commit time is less than the given EPOCH time.
        String allBuckets = "false"; // String | If true, buckets without objects matching the filters will be returned with objectCount=0. Default is false
        try {
            List<BucketMetadata> result = apiInstance.callList(sessionID, owner, tenant, kind, contentType, objectTag, associationStatus, objectName, bucketName, projectName, lastCommitBy, committedAtLeastOnceBy, lastCommitTimeGreater, lastCommitTimeLessThan, allBuckets);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketControllerApi#callList");
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
| **tenant** | **String**| The name of the tenant that has access to the Bucket | [optional] |
| **kind** | **String**| The kind(s) of objects that buckets must contain.&lt;br /&gt;Multiple kinds can be specified using comma separators | [optional] |
| **contentType** | **String**| The Content-Type of objects that buckets must contain | [optional] |
| **objectTag** | **String**| The tag of objects that buckets must contain | [optional] |
| **associationStatus** | **String**| The buckets must contain objects which have the given job-planner association status.&lt;br /&gt;Can be ALL, PLANNED, DEACTIVATED, FAILED or UNPLANNED.&lt;br /&gt;ALL will filter objects which have an association with any status.&lt;br /&gt;UNPLANNED will filter objects without any association. | [optional] [enum: ALL, PLANNED, DEACTIVATED, FAILED, UNPLANNED] |
| **objectName** | **String**| The name of objects that buckets must contain | [optional] |
| **bucketName** | **String**| The bucket name contains the value of this parameter (case insensitive) | [optional] |
| **projectName** | **String**| Include only objects whose project name contains the given string. | [optional] |
| **lastCommitBy** | **String**| Include only objects whose last commit belong to the given user. | [optional] |
| **committedAtLeastOnceBy** | **String**| Include only objects have been committed at least once by the given user. | [optional] |
| **lastCommitTimeGreater** | **Long**| Include only objects whose last commit time is greater than the given EPOCH time. | [optional] [default to 0] |
| **lastCommitTimeLessThan** | **Long**| Include only objects whose last commit time is less than the given EPOCH time. | [optional] [default to 0] |
| **allBuckets** | **String**| If true, buckets without objects matching the filters will be returned with objectCount&#x3D;0. Default is false | [optional] [default to false] |

### Return type

[**List&lt;BucketMetadata&gt;**](BucketMetadata.md)

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
| **200** | OK |  -  |


## cleanEmpty

> cleanEmpty(sessionID)

Delete the empty buckets

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketControllerApi apiInstance = new BucketControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        try {
            apiInstance.cleanEmpty(sessionID);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketControllerApi#cleanEmpty");
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

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **200** | OK |  -  |


## create

> BucketMetadata create(sessionID, name, owner)

Creates a new bucket

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketControllerApi apiInstance = new BucketControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String name = "name_example"; // String | The unique name of the Bucket.<br />The name of bucket can be between 3 and 63 characters long, and can contain only lower-case characters, numbers, and dashes.<br />A bucket's name must start with a lowercase letter and cannot terminate with a dash
        String owner = "GROUP:public-objects"; // String | The name of the user that will own the Bucket. Defaults to GROUP:public-objects
        try {
            BucketMetadata result = apiInstance.create(sessionID, name, owner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketControllerApi#create");
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
| **name** | **String**| The unique name of the Bucket.&lt;br /&gt;The name of bucket can be between 3 and 63 characters long, and can contain only lower-case characters, numbers, and dashes.&lt;br /&gt;A bucket&#39;s name must start with a lowercase letter and cannot terminate with a dash | |
| **owner** | **String**| The name of the user that will own the Bucket. Defaults to GROUP:public-objects | [optional] [default to GROUP:public-objects] |

### Return type

[**BucketMetadata**](BucketMetadata.md)

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
| **201** | Created |  -  |


## delete

> BucketMetadata delete(sessionID, bucketName)

Delete an empty bucket

Note: it is forbidden to delete a non-empty bucket. You need to delete manually all workflows in the bucket before.

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketControllerApi apiInstance = new BucketControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        try {
            BucketMetadata result = apiInstance.delete(sessionID, bucketName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketControllerApi#delete");
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

### Return type

[**BucketMetadata**](BucketMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket not found |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **200** | OK |  -  |


## getMetadata

> BucketMetadata getMetadata(bucketName, sessionID)

Gets a bucket&#39;s metadata by ID

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketControllerApi apiInstance = new BucketControllerApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String sessionID = "sessionID_example"; // String | sessionID
        try {
            BucketMetadata result = apiInstance.getMetadata(bucketName, sessionID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketControllerApi#getMetadata");
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
| **sessionID** | **String**| sessionID | [optional] |

### Return type

[**BucketMetadata**](BucketMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket not found |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **200** | OK |  -  |


## updateBucketOwner

> BucketMetadata updateBucketOwner(sessionID, bucketName, owner)

Update bucket owner

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketControllerApi apiInstance = new BucketControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String owner = "owner_example"; // String | The new name of the user that will own the Bucket
        try {
            BucketMetadata result = apiInstance.updateBucketOwner(sessionID, bucketName, owner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketControllerApi#updateBucketOwner");
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
| **owner** | **String**| The new name of the user that will own the Bucket | |

### Return type

[**BucketMetadata**](BucketMetadata.md)

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
| **200** | OK |  -  |

