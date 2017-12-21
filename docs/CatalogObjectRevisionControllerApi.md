# CatalogObjectRevisionControllerApi

All URIs are relative to *https://localhost:8080/catalog*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST2**](CatalogObjectRevisionControllerApi.md#createUsingPOST2) | **POST** /buckets/{bucketId}/resources/{name}/revisions | Creates a new catalog object revision
[**getRawUsingGET1**](CatalogObjectRevisionControllerApi.md#getRawUsingGET1) | **GET** /buckets/{bucketId}/resources/{name}/revisions/{commitTime}/raw | Gets the raw content of a specific revision
[**getUsingGET1**](CatalogObjectRevisionControllerApi.md#getUsingGET1) | **GET** /buckets/{bucketId}/resources/{name}/revisions/{commitTime} | Gets a specific revision
[**listUsingGET2**](CatalogObjectRevisionControllerApi.md#listUsingGET2) | **GET** /buckets/{bucketId}/resources/{name}/revisions | Lists a catalog object revisions


<a name="createUsingPOST2"></a>
# **createUsingPOST2**
> CatalogObjectMetadata createUsingPOST2(bucketId, name, file, sessionID, commitMessage)

Creates a new catalog object revision

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CatalogObjectRevisionControllerApi;


CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi();
Long bucketId = 789L; // Long | bucketId
String name = "name_example"; // String | name
File file = new File("/path/to/file.txt"); // File | file
String sessionID = "sessionID_example"; // String | sessionID
String commitMessage = "commitMessage_example"; // String | The commit message of the CatalogRawObject Revision
try {
    CatalogObjectMetadata result = apiInstance.createUsingPOST2(bucketId, name, file, sessionID, commitMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectRevisionControllerApi#createUsingPOST2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucketId |
 **name** | **String**| name |
 **file** | **File**| file |
 **sessionID** | **String**| sessionID | [optional]
 **commitMessage** | **String**| The commit message of the CatalogRawObject Revision | [optional]

### Return type

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="getRawUsingGET1"></a>
# **getRawUsingGET1**
> File getRawUsingGET1(bucketId, name, commitTime, sessionID)

Gets the raw content of a specific revision

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CatalogObjectRevisionControllerApi;


CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi();
Long bucketId = 789L; // Long | bucketId
String name = "name_example"; // String | name
Long commitTime = 789L; // Long | commitTime
String sessionID = "sessionID_example"; // String | sessionID
try {
    File result = apiInstance.getRawUsingGET1(bucketId, name, commitTime, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectRevisionControllerApi#getRawUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucketId |
 **name** | **String**| name |
 **commitTime** | **Long**| commitTime |
 **sessionID** | **String**| sessionID | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsingGET1"></a>
# **getUsingGET1**
> CatalogObjectMetadata getUsingGET1(bucketId, name, commitTime, sessionID)

Gets a specific revision

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CatalogObjectRevisionControllerApi;


CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi();
Long bucketId = 789L; // Long | bucketId
String name = "name_example"; // String | name
Long commitTime = 789L; // Long | commitTime
String sessionID = "sessionID_example"; // String | sessionID
try {
    CatalogObjectMetadata result = apiInstance.getUsingGET1(bucketId, name, commitTime, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectRevisionControllerApi#getUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucketId |
 **name** | **String**| name |
 **commitTime** | **Long**| commitTime |
 **sessionID** | **String**| sessionID | [optional]

### Return type

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET2"></a>
# **listUsingGET2**
> List&lt;CatalogObjectMetadata&gt; listUsingGET2(bucketId, name, sessionID)

Lists a catalog object revisions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CatalogObjectRevisionControllerApi;


CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi();
Long bucketId = 789L; // Long | bucketId
String name = "name_example"; // String | name
String sessionID = "sessionID_example"; // String | sessionID
try {
    List<CatalogObjectMetadata> result = apiInstance.listUsingGET2(bucketId, name, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectRevisionControllerApi#listUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucketId |
 **name** | **String**| name |
 **sessionID** | **String**| sessionID | [optional]

### Return type

[**List&lt;CatalogObjectMetadata&gt;**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

