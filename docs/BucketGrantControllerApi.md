# BucketGrantControllerApi

All URIs are relative to *https://localhost:8080/catalog*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBucketGrantUsingPOST**](BucketGrantControllerApi.md#createBucketGrantUsingPOST) | **POST** /buckets/grant | Create a new username grant or a user group grant access for a bucket
[**deleteBucketGrantUsingDELETE**](BucketGrantControllerApi.md#deleteBucketGrantUsingDELETE) | **DELETE** /buckets/grant | Delete a grant access for a bucket
[**getAssignedBucketGrantsForUserAndHisGroupUsingGET**](BucketGrantControllerApi.md#getAssignedBucketGrantsForUserAndHisGroupUsingGET) | **GET** /buckets/grant | Get all assigned grants for the user and his groups
[**getCreatedBucketGrantsUsingGET**](BucketGrantControllerApi.md#getCreatedBucketGrantsUsingGET) | **GET** /buckets/grant/{username} | Get all created grants by a specific user
[**updateBucketGrantUsingPUT**](BucketGrantControllerApi.md#updateBucketGrantUsingPUT) | **PUT** /buckets/grant/{bucketName} | Update the access type of an existing bucket grant


<a name="createBucketGrantUsingPOST"></a>
# **createBucketGrantUsingPOST**
> BucketGrantMetadata createBucketGrantUsingPOST(sessionID, bucketName, currentUser, accessType, username, userGroup)

Create a new username grant or a user group grant access for a bucket

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | The name of the Bucket
String currentUser = "currentUser_example"; // String | The user who is creating this grant
String accessType = "accessType_example"; // String | The access type of the grant
String username = "username_example"; // String | The name of the user that will have grant access
String userGroup = "userGroup_example"; // String | The name of the user group that will have grant access
try {
    BucketGrantMetadata result = apiInstance.createBucketGrantUsingPOST(sessionID, bucketName, currentUser, accessType, username, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#createBucketGrantUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| The name of the Bucket | [optional]
 **currentUser** | **String**| The user who is creating this grant | [optional]
 **accessType** | **String**| The access type of the grant | [optional]
 **username** | **String**| The name of the user that will have grant access | [optional]
 **userGroup** | **String**| The name of the user group that will have grant access | [optional]

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBucketGrantUsingDELETE"></a>
# **deleteBucketGrantUsingDELETE**
> BucketGrantMetadata deleteBucketGrantUsingDELETE(sessionID, bucketName, currentUser, username, userGroup)

Delete a grant access for a bucket

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | The name of the Bucket
String currentUser = "currentUser_example"; // String | The current user
String username = "username_example"; // String | The name of the user that have grant access over this bucket
String userGroup = "userGroup_example"; // String | The name of the user group that have grant access over this bucket
try {
    BucketGrantMetadata result = apiInstance.deleteBucketGrantUsingDELETE(sessionID, bucketName, currentUser, username, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#deleteBucketGrantUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| The name of the Bucket | [optional]
 **currentUser** | **String**| The current user | [optional]
 **username** | **String**| The name of the user that have grant access over this bucket | [optional]
 **userGroup** | **String**| The name of the user group that have grant access over this bucket | [optional]

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAssignedBucketGrantsForUserAndHisGroupUsingGET"></a>
# **getAssignedBucketGrantsForUserAndHisGroupUsingGET**
> List&lt;BucketGrantMetadata&gt; getAssignedBucketGrantsForUserAndHisGroupUsingGET(sessionID, currentUser, userGroups)

Get all assigned grants for the user and his groups

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String currentUser = "currentUser_example"; // String | The current user
List<String> userGroups = Arrays.asList("userGroups_example"); // List<String> | The list of the current user groups
try {
    List<BucketGrantMetadata> result = apiInstance.getAssignedBucketGrantsForUserAndHisGroupUsingGET(sessionID, currentUser, userGroups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#getAssignedBucketGrantsForUserAndHisGroupUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **currentUser** | **String**| The current user | [optional]
 **userGroups** | [**List&lt;String&gt;**](String.md)| The list of the current user groups | [optional]

### Return type

[**List&lt;BucketGrantMetadata&gt;**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getCreatedBucketGrantsUsingGET"></a>
# **getCreatedBucketGrantsUsingGET**
> List&lt;BucketGrantMetadata&gt; getCreatedBucketGrantsUsingGET(sessionID, username)

Get all created grants by a specific user

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String username = "username_example"; // String | username
try {
    List<BucketGrantMetadata> result = apiInstance.getCreatedBucketGrantsUsingGET(sessionID, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#getCreatedBucketGrantsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **username** | **String**| username |

### Return type

[**List&lt;BucketGrantMetadata&gt;**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateBucketGrantUsingPUT"></a>
# **updateBucketGrantUsingPUT**
> BucketGrantMetadata updateBucketGrantUsingPUT(sessionID, accessType, bucketName, currentUser, username, userGroup)

Update the access type of an existing bucket grant

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.BucketGrantControllerApi;


BucketGrantControllerApi apiInstance = new BucketGrantControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String accessType = "accessType_example"; // String | accessType
String bucketName = "bucketName_example"; // String | bucketName
String currentUser = "currentUser_example"; // String | The user who is updating this grant
String username = "username_example"; // String | username
String userGroup = "userGroup_example"; // String | userGroup
try {
    BucketGrantMetadata result = apiInstance.updateBucketGrantUsingPUT(sessionID, accessType, bucketName, currentUser, username, userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketGrantControllerApi#updateBucketGrantUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **accessType** | **String**| accessType |
 **bucketName** | **String**| bucketName |
 **currentUser** | **String**| The user who is updating this grant | [optional]
 **username** | **String**| username | [optional]
 **userGroup** | **String**| userGroup | [optional]

### Return type

[**BucketGrantMetadata**](BucketGrantMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

