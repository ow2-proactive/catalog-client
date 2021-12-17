# CatalogObjectGrantControllerApi

All URIs are relative to *https://localhost:8080/catalog*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCatalogObjectGrantForAGroupUsingPOST**](CatalogObjectGrantControllerApi.md#createCatalogObjectGrantForAGroupUsingPOST) | **POST** /buckets/{bucketName}/resources/{catalogObjectName}/grant/group | Create a new group grant for a catalog object
[**createCatalogObjectGrantForAUserUsingPOST**](CatalogObjectGrantControllerApi.md#createCatalogObjectGrantForAUserUsingPOST) | **POST** /buckets/{bucketName}/resources/{catalogObjectName}/grant/user | Create a new user grant for a catalog object
[**deleteAllCatalogObjectGrantsUsingDELETE**](CatalogObjectGrantControllerApi.md#deleteAllCatalogObjectGrantsUsingDELETE) | **DELETE** /buckets/{bucketName}/resources/{catalogObjectName}/grant | Delete all grant associated with a catalog object
[**deleteCatalogObjectGrantForAGroupUsingDELETE**](CatalogObjectGrantControllerApi.md#deleteCatalogObjectGrantForAGroupUsingDELETE) | **DELETE** /buckets/{bucketName}/resources/{catalogObjectName}/grant/group | Delete a user group grant access for a catalog object
[**deleteCatalogObjectGrantForAUserUsingDELETE**](CatalogObjectGrantControllerApi.md#deleteCatalogObjectGrantForAUserUsingDELETE) | **DELETE** /buckets/{bucketName}/resources/{catalogObjectName}/grant/user | Delete a user grant access for a catalog object
[**getAllCreatedCatalogObjectGrantsByAdminsUsingGET**](CatalogObjectGrantControllerApi.md#getAllCreatedCatalogObjectGrantsByAdminsUsingGET) | **GET** /buckets/{bucketName}/resources/{catalogObjectName}/grant | Get all grants associated with a catalog object
[**updateCatalogObjectGrantForAGroupUsingPUT**](CatalogObjectGrantControllerApi.md#updateCatalogObjectGrantForAGroupUsingPUT) | **PUT** /buckets/{bucketName}/resources/{catalogObjectName}/grant/group | Update a user group grant access for a catalog object
[**updateCatalogObjectGrantForAUserUsingPUT**](CatalogObjectGrantControllerApi.md#updateCatalogObjectGrantForAUserUsingPUT) | **PUT** /buckets/{bucketName}/resources/{catalogObjectName}/grant/user | Update a user grant access for a catalog object


<a name="createCatalogObjectGrantForAGroupUsingPOST"></a>
# **createCatalogObjectGrantForAGroupUsingPOST**
> CatalogObjectGrantMetadata createCatalogObjectGrantForAGroupUsingPOST(sessionID, bucketName, catalogObjectName, accessType, userGroup)

Create a new group grant for a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket.
String accessType = "accessType_example"; // String | The type of the access grant. It can be either read, write or admin.
String userGroup = "userGroup_example"; // String | The name of the group of users that will benefit of the access grant.
try {
    CatalogObjectGrantMetadata result = apiInstance.createCatalogObjectGrantForAGroupUsingPOST(sessionID, bucketName, catalogObjectName, accessType, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#createCatalogObjectGrantForAGroupUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog object is stored. |
 **catalogObjectName** | **String**| The name of the object in the bucket. |
 **accessType** | **String**| The type of the access grant. It can be either read, write or admin. |
 **userGroup** | **String**| The name of the group of users that will benefit of the access grant. |

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createCatalogObjectGrantForAUserUsingPOST"></a>
# **createCatalogObjectGrantForAUserUsingPOST**
> CatalogObjectGrantMetadata createCatalogObjectGrantForAUserUsingPOST(sessionID, bucketName, catalogObjectName, accessType, username)

Create a new user grant for a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket.
String accessType = "accessType_example"; // String | The type of the access grant. It can be either read, write or admin.
String username = "username_example"; // String | The name of the user that will benefit of the access grant.
try {
    CatalogObjectGrantMetadata result = apiInstance.createCatalogObjectGrantForAUserUsingPOST(sessionID, bucketName, catalogObjectName, accessType, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#createCatalogObjectGrantForAUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog object is stored. |
 **catalogObjectName** | **String**| The name of the object in the bucket. |
 **accessType** | **String**| The type of the access grant. It can be either read, write or admin. |
 **username** | **String**| The name of the user that will benefit of the access grant. |

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAllCatalogObjectGrantsUsingDELETE"></a>
# **deleteAllCatalogObjectGrantsUsingDELETE**
> List&lt;CatalogObjectGrantMetadata&gt; deleteAllCatalogObjectGrantsUsingDELETE(sessionID, bucketName, catalogObjectName)

Delete all grant associated with a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket.
try {
    List<CatalogObjectGrantMetadata> result = apiInstance.deleteAllCatalogObjectGrantsUsingDELETE(sessionID, bucketName, catalogObjectName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#deleteAllCatalogObjectGrantsUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |
 **catalogObjectName** | **String**| The name of the object in the bucket. |

### Return type

[**List&lt;CatalogObjectGrantMetadata&gt;**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCatalogObjectGrantForAGroupUsingDELETE"></a>
# **deleteCatalogObjectGrantForAGroupUsingDELETE**
> CatalogObjectGrantMetadata deleteCatalogObjectGrantForAGroupUsingDELETE(sessionID, bucketName, catalogObjectName, userGroup)

Delete a user group grant access for a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket.
String userGroup = "userGroup_example"; // String | The name of the group of users that are benefiting of the access grant.
try {
    CatalogObjectGrantMetadata result = apiInstance.deleteCatalogObjectGrantForAGroupUsingDELETE(sessionID, bucketName, catalogObjectName, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#deleteCatalogObjectGrantForAGroupUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog object is stored. |
 **catalogObjectName** | **String**| The name of the object in the bucket. |
 **userGroup** | **String**| The name of the group of users that are benefiting of the access grant. |

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCatalogObjectGrantForAUserUsingDELETE"></a>
# **deleteCatalogObjectGrantForAUserUsingDELETE**
> CatalogObjectGrantMetadata deleteCatalogObjectGrantForAUserUsingDELETE(sessionID, bucketName, catalogObjectName, username)

Delete a user grant access for a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket.
String username = "username_example"; // String | The name of the user that is benefiting of the access grant.
try {
    CatalogObjectGrantMetadata result = apiInstance.deleteCatalogObjectGrantForAUserUsingDELETE(sessionID, bucketName, catalogObjectName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#deleteCatalogObjectGrantForAUserUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog object is stored. |
 **catalogObjectName** | **String**| The name of the object in the bucket. |
 **username** | **String**| The name of the user that is benefiting of the access grant. |

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllCreatedCatalogObjectGrantsByAdminsUsingGET"></a>
# **getAllCreatedCatalogObjectGrantsByAdminsUsingGET**
> List&lt;CatalogObjectGrantMetadata&gt; getAllCreatedCatalogObjectGrantsByAdminsUsingGET(sessionID, bucketName, catalogObjectName)

Get all grants associated with a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket.
try {
    List<CatalogObjectGrantMetadata> result = apiInstance.getAllCreatedCatalogObjectGrantsByAdminsUsingGET(sessionID, bucketName, catalogObjectName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#getAllCreatedCatalogObjectGrantsByAdminsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |
 **catalogObjectName** | **String**| The name of the object in the bucket. |

### Return type

[**List&lt;CatalogObjectGrantMetadata&gt;**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCatalogObjectGrantForAGroupUsingPUT"></a>
# **updateCatalogObjectGrantForAGroupUsingPUT**
> CatalogObjectGrantMetadata updateCatalogObjectGrantForAGroupUsingPUT(sessionID, bucketName, catalogObjectName, accessType, userGroup)

Update a user group grant access for a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket.
String accessType = "accessType_example"; // String | The new type of the access grant. It can be either read, write or admin.
String userGroup = "userGroup_example"; // String | The name of the group of users that are benefiting of the access grant.
try {
    CatalogObjectGrantMetadata result = apiInstance.updateCatalogObjectGrantForAGroupUsingPUT(sessionID, bucketName, catalogObjectName, accessType, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#updateCatalogObjectGrantForAGroupUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog object is stored. |
 **catalogObjectName** | **String**| The name of the object in the bucket. |
 **accessType** | **String**| The new type of the access grant. It can be either read, write or admin. |
 **userGroup** | **String**| The name of the group of users that are benefiting of the access grant. | [optional]

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCatalogObjectGrantForAUserUsingPUT"></a>
# **updateCatalogObjectGrantForAUserUsingPUT**
> CatalogObjectGrantMetadata updateCatalogObjectGrantForAUserUsingPUT(sessionID, bucketName, catalogObjectName, accessType, username)

Update a user grant access for a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog object is stored.
String catalogObjectName = "catalogObjectName_example"; // String | The name of the object in the bucket.
String accessType = "accessType_example"; // String | The new type of the access grant. It can be either read, write or admin.
String username = "username_example"; // String | The name of the user that is benefiting from the access grant.
try {
    CatalogObjectGrantMetadata result = apiInstance.updateCatalogObjectGrantForAUserUsingPUT(sessionID, bucketName, catalogObjectName, accessType, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#updateCatalogObjectGrantForAUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog object is stored. |
 **catalogObjectName** | **String**| The name of the object in the bucket. |
 **accessType** | **String**| The new type of the access grant. It can be either read, write or admin. |
 **username** | **String**| The name of the user that is benefiting from the access grant. |

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

