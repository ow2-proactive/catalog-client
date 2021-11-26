# CatalogObjectGrantControllerApi

All URIs are relative to *https://localhost:8080/catalog*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCatalogObjectGrantUsingPOST**](CatalogObjectGrantControllerApi.md#createCatalogObjectGrantUsingPOST) | **POST** /buckets/{bucketName}/grant/resources/{catalogObjectName}/grant | Create a new username grant or a user group grant access for a catalog object
[**deleteCatalogObjectGrantUsingDELETE**](CatalogObjectGrantControllerApi.md#deleteCatalogObjectGrantUsingDELETE) | **DELETE** /buckets/{bucketName}/grant/resources/{catalogObjectName}/grant | Delete a username grant or a user group grant access for a catalog object
[**getAllAssignedCatalogObjectGrantsForTheCurrentUserAndHisGroupUsingGET**](CatalogObjectGrantControllerApi.md#getAllAssignedCatalogObjectGrantsForTheCurrentUserAndHisGroupUsingGET) | **GET** /buckets/{bucketName}/grant/resources/{catalogObjectName}/grant | Get all assigned grants for the user and his group on a specific catalog object
[**getAllCreatedCatalogObjectGrantsByTheCurrentUserForTheCurrentUserBucketUsingGET**](CatalogObjectGrantControllerApi.md#getAllCreatedCatalogObjectGrantsByTheCurrentUserForTheCurrentUserBucketUsingGET) | **GET** /buckets/{bucketName}/grant | Get all created grants by the current user on all bucket&#39;s object
[**updateCatalogObjectGrantUsingPUT**](CatalogObjectGrantControllerApi.md#updateCatalogObjectGrantUsingPUT) | **PUT** /buckets/{bucketName}/grant/resources/{catalogObjectName}/grant | Update a username grant or a user group grant access for a catalog object


<a name="createCatalogObjectGrantUsingPOST"></a>
# **createCatalogObjectGrantUsingPOST**
> CatalogObjectGrantMetadata createCatalogObjectGrantUsingPOST(sessionID, bucketName, catalogObjectName, currentUser, accessType, username, userGroup)

Create a new username grant or a user group grant access for a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | bucketName
String catalogObjectName = "catalogObjectName_example"; // String | catalogObjectName
String currentUser = "currentUser_example"; // String | The user who is creating this grant
String accessType = "accessType_example"; // String | The access type of the grant
String username = "username_example"; // String | The name of the user that will have grant access
String userGroup = "userGroup_example"; // String | The name of the user group that will have grant access
try {
    CatalogObjectGrantMetadata result = apiInstance.createCatalogObjectGrantUsingPOST(sessionID, bucketName, catalogObjectName, currentUser, accessType, username, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#createCatalogObjectGrantUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| bucketName |
 **catalogObjectName** | **String**| catalogObjectName |
 **currentUser** | **String**| The user who is creating this grant | [optional]
 **accessType** | **String**| The access type of the grant | [optional]
 **username** | **String**| The name of the user that will have grant access | [optional]
 **userGroup** | **String**| The name of the user group that will have grant access | [optional]

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCatalogObjectGrantUsingDELETE"></a>
# **deleteCatalogObjectGrantUsingDELETE**
> CatalogObjectGrantMetadata deleteCatalogObjectGrantUsingDELETE(sessionID, bucketName, catalogObjectName, currentUser, username, userGroup)

Delete a username grant or a user group grant access for a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | bucketName
String catalogObjectName = "catalogObjectName_example"; // String | catalogObjectName
String currentUser = "currentUser_example"; // String | The current user
String username = "username_example"; // String | The name of the user that will have grant access
String userGroup = "userGroup_example"; // String | The name of the user group that will have grant access
try {
    CatalogObjectGrantMetadata result = apiInstance.deleteCatalogObjectGrantUsingDELETE(sessionID, bucketName, catalogObjectName, currentUser, username, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#deleteCatalogObjectGrantUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| bucketName |
 **catalogObjectName** | **String**| catalogObjectName |
 **currentUser** | **String**| The current user | [optional]
 **username** | **String**| The name of the user that will have grant access | [optional]
 **userGroup** | **String**| The name of the user group that will have grant access | [optional]

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllAssignedCatalogObjectGrantsForTheCurrentUserAndHisGroupUsingGET"></a>
# **getAllAssignedCatalogObjectGrantsForTheCurrentUserAndHisGroupUsingGET**
> List&lt;CatalogObjectGrantMetadata&gt; getAllAssignedCatalogObjectGrantsForTheCurrentUserAndHisGroupUsingGET(sessionID, bucketName, catalogObjectName, currentUser, userGroup)

Get all assigned grants for the user and his group on a specific catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | bucketName
String catalogObjectName = "catalogObjectName_example"; // String | catalogObjectName
String currentUser = "currentUser_example"; // String | The current user
String userGroup = "userGroup_example"; // String | The current userGroup
try {
    List<CatalogObjectGrantMetadata> result = apiInstance.getAllAssignedCatalogObjectGrantsForTheCurrentUserAndHisGroupUsingGET(sessionID, bucketName, catalogObjectName, currentUser, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#getAllAssignedCatalogObjectGrantsForTheCurrentUserAndHisGroupUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| bucketName |
 **catalogObjectName** | **String**| catalogObjectName |
 **currentUser** | **String**| The current user | [optional]
 **userGroup** | **String**| The current userGroup | [optional]

### Return type

[**List&lt;CatalogObjectGrantMetadata&gt;**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllCreatedCatalogObjectGrantsByTheCurrentUserForTheCurrentUserBucketUsingGET"></a>
# **getAllCreatedCatalogObjectGrantsByTheCurrentUserForTheCurrentUserBucketUsingGET**
> List&lt;CatalogObjectGrantMetadata&gt; getAllCreatedCatalogObjectGrantsByTheCurrentUserForTheCurrentUserBucketUsingGET(sessionID, bucketName, currentUser)

Get all created grants by the current user on all bucket&#39;s object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | bucketName
String currentUser = "currentUser_example"; // String | The current user
try {
    List<CatalogObjectGrantMetadata> result = apiInstance.getAllCreatedCatalogObjectGrantsByTheCurrentUserForTheCurrentUserBucketUsingGET(sessionID, bucketName, currentUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#getAllCreatedCatalogObjectGrantsByTheCurrentUserForTheCurrentUserBucketUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| bucketName |
 **currentUser** | **String**| The current user | [optional]

### Return type

[**List&lt;CatalogObjectGrantMetadata&gt;**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCatalogObjectGrantUsingPUT"></a>
# **updateCatalogObjectGrantUsingPUT**
> CatalogObjectGrantMetadata updateCatalogObjectGrantUsingPUT(sessionID, bucketName, catalogObjectName, currentUser, accessType, username, userGroup)

Update a username grant or a user group grant access for a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectGrantControllerApi;


CatalogObjectGrantControllerApi apiInstance = new CatalogObjectGrantControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | bucketName
String catalogObjectName = "catalogObjectName_example"; // String | catalogObjectName
String currentUser = "currentUser_example"; // String | The current user
String accessType = "accessType_example"; // String | The new access type
String username = "username_example"; // String | The name of the user that have the grant access
String userGroup = "userGroup_example"; // String | The name of the user group that have the grant access
try {
    CatalogObjectGrantMetadata result = apiInstance.updateCatalogObjectGrantUsingPUT(sessionID, bucketName, catalogObjectName, currentUser, accessType, username, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectGrantControllerApi#updateCatalogObjectGrantUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| bucketName |
 **catalogObjectName** | **String**| catalogObjectName |
 **currentUser** | **String**| The current user | [optional]
 **accessType** | **String**| The new access type | [optional]
 **username** | **String**| The name of the user that have the grant access | [optional]
 **userGroup** | **String**| The name of the user group that have the grant access | [optional]

### Return type

[**CatalogObjectGrantMetadata**](CatalogObjectGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

