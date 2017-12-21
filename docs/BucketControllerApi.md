# BucketControllerApi

All URIs are relative to *https://localhost:8080/catalog*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cleanEmptyUsingDELETE**](BucketControllerApi.md#cleanEmptyUsingDELETE) | **DELETE** /buckets | Delete the empty buckets
[**createUsingPOST**](BucketControllerApi.md#createUsingPOST) | **POST** /buckets | Creates a new bucket
[**deleteUsingDELETE**](BucketControllerApi.md#deleteUsingDELETE) | **DELETE** /buckets/{bucketId} | Delete an empty bucket
[**getMetadataUsingGET**](BucketControllerApi.md#getMetadataUsingGET) | **GET** /buckets/{bucketId} | Gets a bucket&#39;s metadata by ID
[**listUsingGET**](BucketControllerApi.md#listUsingGET) | **GET** /buckets | Lists the buckets


<a name="cleanEmptyUsingDELETE"></a>
# **cleanEmptyUsingDELETE**
> cleanEmptyUsingDELETE()

Delete the empty buckets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BucketControllerApi;


BucketControllerApi apiInstance = new BucketControllerApi();
try {
    apiInstance.cleanEmptyUsingDELETE();
} catch (ApiException e) {
    System.err.println("Exception when calling BucketControllerApi#cleanEmptyUsingDELETE");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createUsingPOST"></a>
# **createUsingPOST**
> BucketMetadata createUsingPOST(name, sessionID, owner)

Creates a new bucket

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BucketControllerApi;


BucketControllerApi apiInstance = new BucketControllerApi();
String name = "name_example"; // String | name
String sessionID = "sessionID_example"; // String | sessionID
String owner = "GROUP:public-objects"; // String | The name of the user that will own the Bucket
try {
    BucketMetadata result = apiInstance.createUsingPOST(name, sessionID, owner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketControllerApi#createUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **sessionID** | **String**| sessionID | [optional]
 **owner** | **String**| The name of the user that will own the Bucket | [optional] [default to GROUP:public-objects]

### Return type

[**BucketMetadata**](BucketMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> deleteUsingDELETE(bucketId, sessionID)

Delete an empty bucket

It&#39;s forbidden to delete a non-empty bucket. You need to delete manually all workflows in the bucket before.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BucketControllerApi;


BucketControllerApi apiInstance = new BucketControllerApi();
Long bucketId = 789L; // Long | bucketId
String sessionID = "sessionID_example"; // String | sessionID
try {
    apiInstance.deleteUsingDELETE(bucketId, sessionID);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucketId |
 **sessionID** | **String**| sessionID | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getMetadataUsingGET"></a>
# **getMetadataUsingGET**
> BucketMetadata getMetadataUsingGET(bucketId, sessionID)

Gets a bucket&#39;s metadata by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BucketControllerApi;


BucketControllerApi apiInstance = new BucketControllerApi();
Long bucketId = 789L; // Long | bucketId
String sessionID = "sessionID_example"; // String | sessionID
try {
    BucketMetadata result = apiInstance.getMetadataUsingGET(bucketId, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketControllerApi#getMetadataUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucketId |
 **sessionID** | **String**| sessionID | [optional]

### Return type

[**BucketMetadata**](BucketMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET"></a>
# **listUsingGET**
> List&lt;BucketMetadata&gt; listUsingGET(sessionID, owner, kind)

Lists the buckets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BucketControllerApi;


BucketControllerApi apiInstance = new BucketControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String owner = "owner_example"; // String | The name of the user who owns the Bucket
String kind = "kind_example"; // String | The kind of objects that buckets must contain
try {
    List<BucketMetadata> result = apiInstance.listUsingGET(sessionID, owner, kind);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketControllerApi#listUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID | [optional]
 **owner** | **String**| The name of the user who owns the Bucket | [optional]
 **kind** | **String**| The kind of objects that buckets must contain | [optional]

### Return type

[**List&lt;BucketMetadata&gt;**](BucketMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

