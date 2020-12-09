# CatalogObjectRevisionControllerApi

All URIs are relative to *https://localhost:8080/catalog*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST2**](CatalogObjectRevisionControllerApi.md#createUsingPOST2) | **POST** /buckets/{bucketName}/resources/{name}/revisions | Creates a new catalog object revision
[**getRawUsingGET1**](CatalogObjectRevisionControllerApi.md#getRawUsingGET1) | **GET** /buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw}/raw | Gets the raw content of a specific revision
[**getUsingGET1**](CatalogObjectRevisionControllerApi.md#getUsingGET1) | **GET** /buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw} | Gets a specific revision
[**listUsingGET2**](CatalogObjectRevisionControllerApi.md#listUsingGET2) | **GET** /buckets/{bucketName}/resources/{name}/revisions | Lists a catalog object revisions
[**restoreUsingPUT**](CatalogObjectRevisionControllerApi.md#restoreUsingPUT) | **PUT** /buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw} | Restore a catalog object revision


<a name="createUsingPOST2"></a>
# **createUsingPOST2**
> CatalogObjectMetadata createUsingPOST2(sessionID, bucketName, name, commitMessage, file, projectName)

Creates a new catalog object revision

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectRevisionControllerApi;


CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | bucketName
String name = "name_example"; // String | name
String commitMessage = "commitMessage_example"; // String | The commit message of the CatalogRawObject Revision
File file = new File("/path/to/file.txt"); // File | file
String projectName = "projectName_example"; // String | Project of the object
try {
    CatalogObjectMetadata result = apiInstance.createUsingPOST2(sessionID, bucketName, name, commitMessage, file, projectName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectRevisionControllerApi#createUsingPOST2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| bucketName |
 **name** | **String**| name |
 **commitMessage** | **String**| The commit message of the CatalogRawObject Revision |
 **file** | **File**| file |
 **projectName** | **String**| Project of the object | [optional]

### Return type

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="getRawUsingGET1"></a>
# **getRawUsingGET1**
> String getRawUsingGET1(bucketName, name, commitTimeRaw, sessionID)

Gets the raw content of a specific revision

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectRevisionControllerApi;


CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi();
String bucketName = "bucketName_example"; // String | bucketName
String name = "name_example"; // String | name
Long commitTimeRaw = 789L; // Long | commitTimeRaw
String sessionID = "sessionID_example"; // String | sessionID
try {
    String result = apiInstance.getRawUsingGET1(bucketName, name, commitTimeRaw, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectRevisionControllerApi#getRawUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| bucketName |
 **name** | **String**| name |
 **commitTimeRaw** | **Long**| commitTimeRaw |
 **sessionID** | **String**| sessionID | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsingGET1"></a>
# **getUsingGET1**
> CatalogObjectMetadata getUsingGET1(bucketName, name, commitTimeRaw, sessionID)

Gets a specific revision

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectRevisionControllerApi;


CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi();
String bucketName = "bucketName_example"; // String | bucketName
String name = "name_example"; // String | name
Long commitTimeRaw = 789L; // Long | commitTimeRaw
String sessionID = "sessionID_example"; // String | sessionID
try {
    CatalogObjectMetadata result = apiInstance.getUsingGET1(bucketName, name, commitTimeRaw, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectRevisionControllerApi#getUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| bucketName |
 **name** | **String**| name |
 **commitTimeRaw** | **Long**| commitTimeRaw |
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
> List&lt;CatalogObjectMetadata&gt; listUsingGET2(bucketName, name, sessionID)

Lists a catalog object revisions

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectRevisionControllerApi;


CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi();
String bucketName = "bucketName_example"; // String | bucketName
String name = "name_example"; // String | name
String sessionID = "sessionID_example"; // String | sessionID
try {
    List<CatalogObjectMetadata> result = apiInstance.listUsingGET2(bucketName, name, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectRevisionControllerApi#listUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| bucketName |
 **name** | **String**| name |
 **sessionID** | **String**| sessionID | [optional]

### Return type

[**List&lt;CatalogObjectMetadata&gt;**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="restoreUsingPUT"></a>
# **restoreUsingPUT**
> CatalogObjectMetadata restoreUsingPUT(sessionID, bucketName, name, commitTimeRaw)

Restore a catalog object revision

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectRevisionControllerApi;


CatalogObjectRevisionControllerApi apiInstance = new CatalogObjectRevisionControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | bucketName
String name = "name_example"; // String | name
Long commitTimeRaw = 789L; // Long | commitTimeRaw
try {
    CatalogObjectMetadata result = apiInstance.restoreUsingPUT(sessionID, bucketName, name, commitTimeRaw);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectRevisionControllerApi#restoreUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| bucketName |
 **name** | **String**| name |
 **commitTimeRaw** | **Long**| commitTimeRaw |

### Return type

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

