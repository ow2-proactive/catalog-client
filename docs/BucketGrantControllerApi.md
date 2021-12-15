# BucketGrantControllerApi

All URIs are relative to *https://localhost:8080/catalog*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBucketGrantForAGroupUsingPOST**](BucketGrantControllerApi.md#createBucketGrantForAGroupUsingPOST) | **POST** /buckets/{bucketName}/grant/group | Create a new user group grant access for a bucket
[**createBucketGrantForAUserUsingPOST**](BucketGrantControllerApi.md#createBucketGrantForAUserUsingPOST) | **POST** /buckets/{bucketName}/grant/user | Create a new user grant grant access for a bucket
[**deleteAllBucketGrantsAssignedToABucketUsingDELETE**](BucketGrantControllerApi.md#deleteAllBucketGrantsAssignedToABucketUsingDELETE) | **DELETE** /buckets/{bucketName}/grant | Delete all grants assigned to a bucket
[**deleteAllGrantsForABucketAndItsObjectsUsingDELETE**](BucketGrantControllerApi.md#deleteAllGrantsForABucketAndItsObjectsUsingDELETE) | **DELETE** /buckets/{bucketName}/grant/all | Get all created grant for a bucket and for its object
[**deleteBucketGrantForAGroupUsingDELETE**](BucketGrantControllerApi.md#deleteBucketGrantForAGroupUsingDELETE) | **DELETE** /buckets/{bucketName}/grant/group | Delete a group grant access for a bucket
[**deleteBucketGrantForAUserUsingDELETE**](BucketGrantControllerApi.md#deleteBucketGrantForAUserUsingDELETE) | **DELETE** /buckets/{bucketName}/grant/user | Delete a user grant access for a bucket
[**getAllGrantsForABucketAndItsObjectsUsingGET**](BucketGrantControllerApi.md#getAllGrantsForABucketAndItsObjectsUsingGET) | **GET** /buckets/{bucketName}/grant/all | Get all created grant for a bucket and for its object
[**getAllGrantsForABucketUsingGET**](BucketGrantControllerApi.md#getAllGrantsForABucketUsingGET) | **GET** /buckets/{bucketName}/grant | Get all created grant for a bucket
[**updateBucketGrantForAGroupUsingPUT**](BucketGrantControllerApi.md#updateBucketGrantForAGroupUsingPUT) | **PUT** /buckets/{bucketName}/grant/group | Update the access type of an existing group bucket grant
[**updateBucketGrantForAUserUsingPUT**](BucketGrantControllerApi.md#updateBucketGrantForAUserUsingPUT) | **PUT** /buckets/{bucketName}/grant/user | Update the access type of an existing user bucket grant


<a name="createBucketGrantForAGroupUsingPOST"></a>
# **createBucketGrantForAGroupUsingPOST**
> BucketGrantMetadata createBucketGrantForAGroupUsingPOST(sessionID, bucketName, accessType, userGroup)

Create a new user group grant access for a bucket

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
String accessType = "accessType_example"; // String | The type of the access grant. It can be either read, write or admin.
String userGroup = "userGroup_example"; // String | The name of the group of users that will benefit of the access grant.
try {
    BucketGrantMetadata result = apiInstance.createBucketGrantForAGroupUsingPOST(sessionID, bucketName, accessType, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#createBucketGrantForAGroupUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |
 **accessType** | **String**| The type of the access grant. It can be either read, write or admin. |
 **userGroup** | **String**| The name of the group of users that will benefit of the access grant. |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBucketGrantForAUserUsingPOST"></a>
# **createBucketGrantForAUserUsingPOST**
> BucketGrantMetadata createBucketGrantForAUserUsingPOST(sessionID, bucketName, accessType, username)

Create a new user grant grant access for a bucket

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | The the session id used to access ProActive REST server
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
String accessType = "accessType_example"; // String | The type of the access grant. It can be either read, write or admin.
String username = "username_example"; // String | The name of the user that will benefit of the access grant.
try {
    BucketGrantMetadata result = apiInstance.createBucketGrantForAUserUsingPOST(sessionID, bucketName, accessType, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#createBucketGrantForAUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The the session id used to access ProActive REST server |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |
 **accessType** | **String**| The type of the access grant. It can be either read, write or admin. |
 **username** | **String**| The name of the user that will benefit of the access grant. |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAllBucketGrantsAssignedToABucketUsingDELETE"></a>
# **deleteAllBucketGrantsAssignedToABucketUsingDELETE**
> List&lt;BucketGrantMetadata&gt; deleteAllBucketGrantsAssignedToABucketUsingDELETE(sessionID, bucketName)

Delete all grants assigned to a bucket

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
try {
    List<BucketGrantMetadata> result = apiInstance.deleteAllBucketGrantsAssignedToABucketUsingDELETE(sessionID, bucketName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#deleteAllBucketGrantsAssignedToABucketUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |

### Return type

[**List&lt;BucketGrantMetadata&gt;**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAllGrantsForABucketAndItsObjectsUsingDELETE"></a>
# **deleteAllGrantsForABucketAndItsObjectsUsingDELETE**
> AllBucketGrants deleteAllGrantsForABucketAndItsObjectsUsingDELETE(sessionID, bucketName)

Get all created grant for a bucket and for its object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
try {
    AllBucketGrants result = apiInstance.deleteAllGrantsForABucketAndItsObjectsUsingDELETE(sessionID, bucketName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#deleteAllGrantsForABucketAndItsObjectsUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |

### Return type

[**AllBucketGrants**](AllBucketGrants.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBucketGrantForAGroupUsingDELETE"></a>
# **deleteBucketGrantForAGroupUsingDELETE**
> BucketGrantMetadata deleteBucketGrantForAGroupUsingDELETE(sessionID, bucketName, userGroup)

Delete a group grant access for a bucket

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
String userGroup = "userGroup_example"; // String | The name of the group of users that are benefiting from the access grant.
try {
    BucketGrantMetadata result = apiInstance.deleteBucketGrantForAGroupUsingDELETE(sessionID, bucketName, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#deleteBucketGrantForAGroupUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |
 **userGroup** | **String**| The name of the group of users that are benefiting from the access grant. |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBucketGrantForAUserUsingDELETE"></a>
# **deleteBucketGrantForAUserUsingDELETE**
> BucketGrantMetadata deleteBucketGrantForAUserUsingDELETE(sessionID, bucketName, username)

Delete a user grant access for a bucket

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
String username = "username_example"; // String | The name of the user that is benefiting from the access grant.
try {
    BucketGrantMetadata result = apiInstance.deleteBucketGrantForAUserUsingDELETE(sessionID, bucketName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#deleteBucketGrantForAUserUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |
 **username** | **String**| The name of the user that is benefiting from the access grant. |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllGrantsForABucketAndItsObjectsUsingGET"></a>
# **getAllGrantsForABucketAndItsObjectsUsingGET**
> AllBucketGrants getAllGrantsForABucketAndItsObjectsUsingGET(sessionID, bucketName)

Get all created grant for a bucket and for its object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
try {
    AllBucketGrants result = apiInstance.getAllGrantsForABucketAndItsObjectsUsingGET(sessionID, bucketName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#getAllGrantsForABucketAndItsObjectsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |

### Return type

[**AllBucketGrants**](AllBucketGrants.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllGrantsForABucketUsingGET"></a>
# **getAllGrantsForABucketUsingGET**
> List&lt;BucketGrantMetadata&gt; getAllGrantsForABucketUsingGET(sessionID, bucketName)

Get all created grant for a bucket

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
try {
    List<BucketGrantMetadata> result = apiInstance.getAllGrantsForABucketUsingGET(sessionID, bucketName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#getAllGrantsForABucketUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |

### Return type

[**List&lt;BucketGrantMetadata&gt;**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateBucketGrantForAGroupUsingPUT"></a>
# **updateBucketGrantForAGroupUsingPUT**
> BucketGrantMetadata updateBucketGrantForAGroupUsingPUT(sessionID, bucketName, userGroup, accessType)

Update the access type of an existing group bucket grant

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
String userGroup = "userGroup_example"; // String | The name of the group of users that are benefiting from the access grant.
String accessType = "accessType_example"; // String | The new type of the access grant. It can be either read, write or admin.
try {
    BucketGrantMetadata result = apiInstance.updateBucketGrantForAGroupUsingPUT(sessionID, bucketName, userGroup, accessType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#updateBucketGrantForAGroupUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |
 **userGroup** | **String**| The name of the group of users that are benefiting from the access grant. |
 **accessType** | **String**| The new type of the access grant. It can be either read, write or admin. |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateBucketGrantForAUserUsingPUT"></a>
# **updateBucketGrantForAUserUsingPUT**
> BucketGrantMetadata updateBucketGrantForAUserUsingPUT(sessionID, bucketName, username, accessType)

Update the access type of an existing user bucket grant

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | The session id used to access ProActive REST server.
String bucketName = "bucketName_example"; // String | The name of the bucket where the catalog objects are stored.
String username = "username_example"; // String | The name of the user that is benefiting from the access grant.
String accessType = "accessType_example"; // String | The new type of the access grant. It can be either read, write or admin.
try {
    BucketGrantMetadata result = apiInstance.updateBucketGrantForAUserUsingPUT(sessionID, bucketName, username, accessType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#updateBucketGrantForAUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| The session id used to access ProActive REST server. |
 **bucketName** | **String**| The name of the bucket where the catalog objects are stored. |
 **username** | **String**| The name of the user that is benefiting from the access grant. |
 **accessType** | **String**| The new type of the access grant. It can be either read, write or admin. |

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

