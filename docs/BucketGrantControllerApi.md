# BucketGrantControllerApi

All URIs are relative to *https://trydev2.activeeon.com:8443/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBucketGrantForAGroup**](BucketGrantControllerApi.md#createBucketGrantForAGroup) | **POST** /buckets/{bucketName}/grant/group | Create a new user group grant access for a bucket |
| [**createBucketGrantForAUser**](BucketGrantControllerApi.md#createBucketGrantForAUser) | **POST** /buckets/{bucketName}/grant/user | Create a new user grant access for a bucket |
| [**deleteAllBucketGrantsAssignedToABucket**](BucketGrantControllerApi.md#deleteAllBucketGrantsAssignedToABucket) | **DELETE** /buckets/{bucketName}/grant | Delete all grants assigned to a bucket |
| [**deleteAllGrantsForABucketAndItsObjects**](BucketGrantControllerApi.md#deleteAllGrantsForABucketAndItsObjects) | **DELETE** /buckets/{bucketName}/grant/all | Delete all grants associated with a bucket and all objects contained in this bucket |
| [**deleteBucketGrantForAGroup**](BucketGrantControllerApi.md#deleteBucketGrantForAGroup) | **DELETE** /buckets/{bucketName}/grant/group | Delete a group grant access for a bucket |
| [**deleteBucketGrantForAUser**](BucketGrantControllerApi.md#deleteBucketGrantForAUser) | **DELETE** /buckets/{bucketName}/grant/user | Delete a user grant access for a bucket |
| [**getAllGrantsForABucket**](BucketGrantControllerApi.md#getAllGrantsForABucket) | **GET** /buckets/{bucketName}/grant | Get all grants associated with a bucket |
| [**getAllGrantsForABucketAndItsObjects**](BucketGrantControllerApi.md#getAllGrantsForABucketAndItsObjects) | **GET** /buckets/{bucketName}/grant/all | Get all grants associated with a bucket and all objects contained in this bucket |
| [**updateBucketGrantForAGroup**](BucketGrantControllerApi.md#updateBucketGrantForAGroup) | **PUT** /buckets/{bucketName}/grant/group | Update the access type of an existing group bucket grant |
| [**updateBucketGrantForAUser**](BucketGrantControllerApi.md#updateBucketGrantForAUser) | **PUT** /buckets/{bucketName}/grant/user | Update the access type of an existing user bucket grant |



## createBucketGrantForAGroup

> BucketGrantMetadata createBucketGrantForAGroup(sessionID, bucketName, accessType, priority, userGroup)

Create a new user group grant access for a bucket

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketGrantControllerApi apiInstance = new BucketGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        String accessType = "noAccess"; // String | The type of the access grant.<br />It can be either noAccess, read, write or admin.
        Integer priority = 5; // Integer | The new priority of the access grant.<br />It can be a value from 1 (lowest) to 10 (highest), with 5 as default. Priorities are used to compute the final access rights of a user belonging to multiple groups.<br />Group grants with the same priority will resolve with the default accessType order (admin > write > read > noAccess).<br />Finally, please note that a user grant has always more priority than a group grant.
        String userGroup = ""; // String | The name of the group of users that will benefit of the access grant.
        try {
            BucketGrantMetadata result = apiInstance.createBucketGrantForAGroup(sessionID, bucketName, accessType, priority, userGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketGrantControllerApi#createBucketGrantForAGroup");
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
| **sessionID** | **String**| The session id used to access ProActive REST server | |
| **bucketName** | **String**| The name of the bucket where the catalog objects are stored. | |
| **accessType** | **String**| The type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. | [enum: noAccess, read, write, admin] |
| **priority** | **Integer**| The new priority of the access grant.&lt;br /&gt;It can be a value from 1 (lowest) to 10 (highest), with 5 as default. Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. | [default to 5] |
| **userGroup** | **String**| The name of the group of users that will benefit of the access grant. | [default to ] |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

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


## createBucketGrantForAUser

> BucketGrantMetadata createBucketGrantForAUser(sessionID, bucketName, accessType, username)

Create a new user grant access for a bucket

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketGrantControllerApi apiInstance = new BucketGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The the session id used to access ProActive REST server
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        String accessType = "noAccess"; // String | The type of the access grant.<br />It can be either noAccess, read, write or admin.
        String username = ""; // String | The name of the user that will benefit of the access grant.
        try {
            BucketGrantMetadata result = apiInstance.createBucketGrantForAUser(sessionID, bucketName, accessType, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketGrantControllerApi#createBucketGrantForAUser");
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
| **sessionID** | **String**| The the session id used to access ProActive REST server | |
| **bucketName** | **String**| The name of the bucket where the catalog objects are stored. | |
| **accessType** | **String**| The type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. | [enum: noAccess, read, write, admin] |
| **username** | **String**| The name of the user that will benefit of the access grant. | [default to ] |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

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


## deleteAllBucketGrantsAssignedToABucket

> List&lt;BucketGrantMetadata&gt; deleteAllBucketGrantsAssignedToABucket(sessionID, bucketName)

Delete all grants assigned to a bucket

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketGrantControllerApi apiInstance = new BucketGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        try {
            List<BucketGrantMetadata> result = apiInstance.deleteAllBucketGrantsAssignedToABucket(sessionID, bucketName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketGrantControllerApi#deleteAllBucketGrantsAssignedToABucket");
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
| **sessionID** | **String**| The session id used to access ProActive REST server. | |
| **bucketName** | **String**| The name of the bucket where the catalog objects are stored. | |

### Return type

[**List&lt;BucketGrantMetadata&gt;**](BucketGrantMetadata.md)

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


## deleteAllGrantsForABucketAndItsObjects

> AllBucketGrants deleteAllGrantsForABucketAndItsObjects(sessionID, bucketName)

Delete all grants associated with a bucket and all objects contained in this bucket

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketGrantControllerApi apiInstance = new BucketGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        try {
            AllBucketGrants result = apiInstance.deleteAllGrantsForABucketAndItsObjects(sessionID, bucketName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketGrantControllerApi#deleteAllGrantsForABucketAndItsObjects");
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
| **sessionID** | **String**| The session id used to access ProActive REST server. | |
| **bucketName** | **String**| The name of the bucket where the catalog objects are stored. | |

### Return type

[**AllBucketGrants**](AllBucketGrants.md)

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


## deleteBucketGrantForAGroup

> BucketGrantMetadata deleteBucketGrantForAGroup(sessionID, bucketName, userGroup)

Delete a group grant access for a bucket

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketGrantControllerApi apiInstance = new BucketGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        String userGroup = ""; // String | The name of the group of users that are benefiting from the access grant.
        try {
            BucketGrantMetadata result = apiInstance.deleteBucketGrantForAGroup(sessionID, bucketName, userGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketGrantControllerApi#deleteBucketGrantForAGroup");
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
| **sessionID** | **String**| The session id used to access ProActive REST server. | |
| **bucketName** | **String**| The name of the bucket where the catalog objects are stored. | |
| **userGroup** | **String**| The name of the group of users that are benefiting from the access grant. | [default to ] |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

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


## deleteBucketGrantForAUser

> BucketGrantMetadata deleteBucketGrantForAUser(sessionID, bucketName, username)

Delete a user grant access for a bucket

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketGrantControllerApi apiInstance = new BucketGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        String username = ""; // String | The name of the user that is benefiting from the access grant.
        try {
            BucketGrantMetadata result = apiInstance.deleteBucketGrantForAUser(sessionID, bucketName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketGrantControllerApi#deleteBucketGrantForAUser");
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
| **sessionID** | **String**| The session id used to access ProActive REST server. | |
| **bucketName** | **String**| The name of the bucket where the catalog objects are stored. | |
| **username** | **String**| The name of the user that is benefiting from the access grant. | [default to ] |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

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


## getAllGrantsForABucket

> List&lt;BucketGrantMetadata&gt; getAllGrantsForABucket(sessionID, bucketName)

Get all grants associated with a bucket

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketGrantControllerApi apiInstance = new BucketGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        try {
            List<BucketGrantMetadata> result = apiInstance.getAllGrantsForABucket(sessionID, bucketName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketGrantControllerApi#getAllGrantsForABucket");
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
| **sessionID** | **String**| The session id used to access ProActive REST server. | |
| **bucketName** | **String**| The name of the bucket where the catalog objects are stored. | |

### Return type

[**List&lt;BucketGrantMetadata&gt;**](BucketGrantMetadata.md)

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


## getAllGrantsForABucketAndItsObjects

> AllBucketGrants getAllGrantsForABucketAndItsObjects(sessionID, bucketName)

Get all grants associated with a bucket and all objects contained in this bucket

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketGrantControllerApi apiInstance = new BucketGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        try {
            AllBucketGrants result = apiInstance.getAllGrantsForABucketAndItsObjects(sessionID, bucketName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketGrantControllerApi#getAllGrantsForABucketAndItsObjects");
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
| **sessionID** | **String**| The session id used to access ProActive REST server. | |
| **bucketName** | **String**| The name of the bucket where the catalog objects are stored. | |

### Return type

[**AllBucketGrants**](AllBucketGrants.md)

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


## updateBucketGrantForAGroup

> BucketGrantMetadata updateBucketGrantForAGroup(sessionID, bucketName, userGroup, accessType, priority)

Update the access type of an existing group bucket grant

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketGrantControllerApi apiInstance = new BucketGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        String userGroup = ""; // String | The name of the group of users that are benefiting from the access grant.
        String accessType = "noAccess"; // String | The new type of the access grant. It can be either noAccess, read, write or admin.
        Integer priority = 5; // Integer | The new priority of the access grant.<br />It can be a value from 1 (lowest) to 10 (highest), with 5 as default.Priorities are used to compute the final access rights of a user belonging to multiple groups.<br />Group grants with the same priority will resolve with the default accessType order (admin > write > read > noAccess).<br />Finally, please note that a user grant has always more priority than a group grant.
        try {
            BucketGrantMetadata result = apiInstance.updateBucketGrantForAGroup(sessionID, bucketName, userGroup, accessType, priority);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketGrantControllerApi#updateBucketGrantForAGroup");
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
| **sessionID** | **String**| The session id used to access ProActive REST server. | |
| **bucketName** | **String**| The name of the bucket where the catalog objects are stored. | |
| **userGroup** | **String**| The name of the group of users that are benefiting from the access grant. | [default to ] |
| **accessType** | **String**| The new type of the access grant. It can be either noAccess, read, write or admin. | [enum: noAccess, read, write, admin] |
| **priority** | **Integer**| The new priority of the access grant.&lt;br /&gt;It can be a value from 1 (lowest) to 10 (highest), with 5 as default.Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. | [default to 5] |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

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


## updateBucketGrantForAUser

> BucketGrantMetadata updateBucketGrantForAUser(sessionID, bucketName, username, accessType)

Update the access type of an existing user bucket grant

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        BucketGrantControllerApi apiInstance = new BucketGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        String username = ""; // String | The name of the user that is benefiting from the access grant.
        String accessType = "noAccess"; // String | The new type of the access grant. It can be either noAccess, read, write or admin.
        try {
            BucketGrantMetadata result = apiInstance.updateBucketGrantForAUser(sessionID, bucketName, username, accessType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketGrantControllerApi#updateBucketGrantForAUser");
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
| **sessionID** | **String**| The session id used to access ProActive REST server. | |
| **bucketName** | **String**| The name of the bucket where the catalog objects are stored. | |
| **username** | **String**| The name of the user that is benefiting from the access grant. | [default to ] |
| **accessType** | **String**| The new type of the access grant. It can be either noAccess, read, write or admin. | [enum: noAccess, read, write, admin] |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

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

