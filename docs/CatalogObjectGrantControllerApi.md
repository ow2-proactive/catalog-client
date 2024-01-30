# CatalogObjectGrantControllerApi

All URIs are relative to *https://trydev2.activeeon.com:8443/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCatalogObjectGrantForAGroup**](CatalogObjectGrantControllerApi.md#createCatalogObjectGrantForAGroup) | **POST** /buckets/{bucketName}/resources/{catalogObjectName}/grant/group | Create a new group grant for a catalog object |
| [**createCatalogObjectGrantForAUser**](CatalogObjectGrantControllerApi.md#createCatalogObjectGrantForAUser) | **POST** /buckets/{bucketName}/resources/{catalogObjectName}/grant/user | Create a new user grant for a catalog object |
| [**deleteAllCatalogObjectGrants**](CatalogObjectGrantControllerApi.md#deleteAllCatalogObjectGrants) | **DELETE** /buckets/{bucketName}/resources/{catalogObjectName}/grant | Delete all grant associated with a catalog object |
| [**deleteCatalogObjectGrantForAGroup**](CatalogObjectGrantControllerApi.md#deleteCatalogObjectGrantForAGroup) | **DELETE** /buckets/{bucketName}/resources/{catalogObjectName}/grant/group | Delete a user group grant access for a catalog object |
| [**deleteCatalogObjectGrantForAUser**](CatalogObjectGrantControllerApi.md#deleteCatalogObjectGrantForAUser) | **DELETE** /buckets/{bucketName}/resources/{catalogObjectName}/grant/user | Delete a user grant access for a catalog object |
| [**getAllCreatedCatalogObjectGrantsByAdmins**](CatalogObjectGrantControllerApi.md#getAllCreatedCatalogObjectGrantsByAdmins) | **GET** /buckets/{bucketName}/resources/{catalogObjectName}/grant | Get all grants associated with a catalog object |
| [**updateCatalogObjectGrantForAGroup**](CatalogObjectGrantControllerApi.md#updateCatalogObjectGrantForAGroup) | **PUT** /buckets/{bucketName}/resources/{catalogObjectName}/grant/group | Update a user group grant access for a catalog object |
| [**updateCatalogObjectGrantForAUser**](CatalogObjectGrantControllerApi.md#updateCatalogObjectGrantForAUser) | **PUT** /buckets/{bucketName}/resources/{catalogObjectName}/grant/user | Update a user grant access for a catalog object |



## createCatalogObjectGrantForAGroup

> CatalogObjectGrantMetadata createCatalogObjectGrantForAGroup(sessionID, bucketName, catalogObjectName, accessType, priority, userGroup)

Create a new group grant for a catalog object

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
        String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket, which is the subject of the grant.
        String accessType = "noAccess"; // String | The type of the access grant.<br />It can be either noAccess, read, write or admin.
        Integer priority = 5; // Integer | The new priority of the access grant.<br />It can be a value from 1 (lowest) to 10 (highest), with 5 as default.<br />Priorities are used to compute the final access rights of a user belonging to multiple groups.<br />Group grants with the same priority will resolve with the default accessType order (admin > write > read > noAccess).<br />Finally, please note that a user grant has always more priority than a group grant.
        String userGroup = ""; // String | The name of the group of users that will benefit of the access grant.
        try {
            CatalogObjectGrantMetadata result = apiInstance.createCatalogObjectGrantForAGroup(sessionID, bucketName, catalogObjectName, accessType, priority, userGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectGrantControllerApi#createCatalogObjectGrantForAGroup");
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
| **bucketName** | **String**| The name of the bucket where the catalog object is stored. | |
| **catalogObjectName** | **String**| The name of the object in the bucket, which is the subject of the grant. | |
| **accessType** | **String**| The type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. | [enum: noAccess, read, write, admin] |
| **priority** | **Integer**| The new priority of the access grant.&lt;br /&gt;It can be a value from 1 (lowest) to 10 (highest), with 5 as default.&lt;br /&gt;Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. | [default to 5] |
| **userGroup** | **String**| The name of the group of users that will benefit of the access grant. | [default to ] |

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

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


## createCatalogObjectGrantForAUser

> CatalogObjectGrantMetadata createCatalogObjectGrantForAUser(sessionID, bucketName, catalogObjectName, accessType, username)

Create a new user grant for a catalog object

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
        String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket, which is the subject of the grant.
        String accessType = "noAccess"; // String | The type of the access grant. It can be either noAccess, read, write or admin.
        String username = ""; // String | The name of the user that will benefit of the access grant.
        try {
            CatalogObjectGrantMetadata result = apiInstance.createCatalogObjectGrantForAUser(sessionID, bucketName, catalogObjectName, accessType, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectGrantControllerApi#createCatalogObjectGrantForAUser");
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
| **bucketName** | **String**| The name of the bucket where the catalog object is stored. | |
| **catalogObjectName** | **String**| The name of the object in the bucket, which is the subject of the grant. | |
| **accessType** | **String**| The type of the access grant. It can be either noAccess, read, write or admin. | [enum: noAccess, read, write, admin] |
| **username** | **String**| The name of the user that will benefit of the access grant. | [default to ] |

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

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


## deleteAllCatalogObjectGrants

> List&lt;CatalogObjectGrantMetadata&gt; deleteAllCatalogObjectGrants(sessionID, bucketName, catalogObjectName)

Delete all grant associated with a catalog object

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket, which is the subject of the grant.
        try {
            List<CatalogObjectGrantMetadata> result = apiInstance.deleteAllCatalogObjectGrants(sessionID, bucketName, catalogObjectName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectGrantControllerApi#deleteAllCatalogObjectGrants");
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
| **catalogObjectName** | **String**| The name of the object in the bucket, which is the subject of the grant. | |

### Return type

[**List&lt;CatalogObjectGrantMetadata&gt;**](CatalogObjectGrantMetadata.md)

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


## deleteCatalogObjectGrantForAGroup

> CatalogObjectGrantMetadata deleteCatalogObjectGrantForAGroup(sessionID, bucketName, catalogObjectName, userGroup)

Delete a user group grant access for a catalog object

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
        String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket, which is the subject of the grant.
        String userGroup = ""; // String | The name of the group of users that are benefiting of the access grant.
        try {
            CatalogObjectGrantMetadata result = apiInstance.deleteCatalogObjectGrantForAGroup(sessionID, bucketName, catalogObjectName, userGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectGrantControllerApi#deleteCatalogObjectGrantForAGroup");
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
| **bucketName** | **String**| The name of the bucket where the catalog object is stored. | |
| **catalogObjectName** | **String**| The name of the object in the bucket, which is the subject of the grant. | |
| **userGroup** | **String**| The name of the group of users that are benefiting of the access grant. | [default to ] |

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

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


## deleteCatalogObjectGrantForAUser

> CatalogObjectGrantMetadata deleteCatalogObjectGrantForAUser(sessionID, bucketName, catalogObjectName, username)

Delete a user grant access for a catalog object

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
        String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket, which is the subject of the grant.
        String username = ""; // String | The name of the user that is benefiting of the access grant.
        try {
            CatalogObjectGrantMetadata result = apiInstance.deleteCatalogObjectGrantForAUser(sessionID, bucketName, catalogObjectName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectGrantControllerApi#deleteCatalogObjectGrantForAUser");
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
| **bucketName** | **String**| The name of the bucket where the catalog object is stored. | |
| **catalogObjectName** | **String**| The name of the object in the bucket, which is the subject of the grant. | |
| **username** | **String**| The name of the user that is benefiting of the access grant. | [default to ] |

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

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


## getAllCreatedCatalogObjectGrantsByAdmins

> List&lt;CatalogObjectGrantMetadata&gt; getAllCreatedCatalogObjectGrantsByAdmins(sessionID, bucketName, catalogObjectName)

Get all grants associated with a catalog object

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
        String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket, which is the subject of the grant.
        try {
            List<CatalogObjectGrantMetadata> result = apiInstance.getAllCreatedCatalogObjectGrantsByAdmins(sessionID, bucketName, catalogObjectName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectGrantControllerApi#getAllCreatedCatalogObjectGrantsByAdmins");
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
| **catalogObjectName** | **String**| The name of the object in the bucket, which is the subject of the grant. | |

### Return type

[**List&lt;CatalogObjectGrantMetadata&gt;**](CatalogObjectGrantMetadata.md)

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


## updateCatalogObjectGrantForAGroup

> CatalogObjectGrantMetadata updateCatalogObjectGrantForAGroup(sessionID, bucketName, catalogObjectName, accessType, priority, userGroup)

Update a user group grant access for a catalog object

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
        String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket, which is the subject of the grant.
        String accessType = "noAccess"; // String | The new type of the access grant.<br />It can be either noAccess, read, write or admin.
        Integer priority = 5; // Integer | The new priority of the access grant. It can be a value from 1 (lowest) to 10 (highest), with 5 as default.<br />Priorities are used to compute the final access rights of a user belonging to multiple groups.<br />Group grants with the same priority will resolve with the default accessType order (admin > write > read > noAccess).<br />Finally, please note that a user grant has always more priority than a group grant.
        String userGroup = "userGroup_example"; // String | The name of the group of users that are benefiting of the access grant.
        try {
            CatalogObjectGrantMetadata result = apiInstance.updateCatalogObjectGrantForAGroup(sessionID, bucketName, catalogObjectName, accessType, priority, userGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectGrantControllerApi#updateCatalogObjectGrantForAGroup");
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
| **bucketName** | **String**| The name of the bucket where the catalog object is stored. | |
| **catalogObjectName** | **String**| The name of the object in the bucket, which is the subject of the grant. | |
| **accessType** | **String**| The new type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. | [enum: noAccess, read, write, admin] |
| **priority** | **Integer**| The new priority of the access grant. It can be a value from 1 (lowest) to 10 (highest), with 5 as default.&lt;br /&gt;Priorities are used to compute the final access rights of a user belonging to multiple groups.&lt;br /&gt;Group grants with the same priority will resolve with the default accessType order (admin &gt; write &gt; read &gt; noAccess).&lt;br /&gt;Finally, please note that a user grant has always more priority than a group grant. | [default to 5] |
| **userGroup** | **String**| The name of the group of users that are benefiting of the access grant. | |

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

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


## updateCatalogObjectGrantForAUser

> CatalogObjectGrantMetadata updateCatalogObjectGrantForAUser(sessionID, bucketName, catalogObjectName, accessType, username)

Update a user grant access for a catalog object

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
        String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
        String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket, which is the subject of the grant.
        String accessType = "noAccess"; // String | The new type of the access grant.<br />It can be either noAccess, read, write or admin.
        String username = ""; // String | The name of the user that is benefiting from the access grant.
        try {
            CatalogObjectGrantMetadata result = apiInstance.updateCatalogObjectGrantForAUser(sessionID, bucketName, catalogObjectName, accessType, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectGrantControllerApi#updateCatalogObjectGrantForAUser");
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
| **bucketName** | **String**| The name of the bucket where the catalog object is stored. | |
| **catalogObjectName** | **String**| The name of the object in the bucket, which is the subject of the grant. | |
| **accessType** | **String**| The new type of the access grant.&lt;br /&gt;It can be either noAccess, read, write or admin. | [enum: noAccess, read, write, admin] |
| **username** | **String**| The name of the user that is benefiting from the access grant. | [default to ] |

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

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

