# CatalogObjectControllerApi

All URIs are relative to *https://localhost:8080/catalog*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST1**](CatalogObjectControllerApi.md#createUsingPOST1) | **POST** /buckets/{bucketId}/resources | Creates a new catalog object
[**deleteUsingDELETE1**](CatalogObjectControllerApi.md#deleteUsingDELETE1) | **DELETE** /buckets/{bucketId}/resources/{name} | Delete a catalog object
[**getRawUsingGET**](CatalogObjectControllerApi.md#getRawUsingGET) | **GET** /buckets/{bucketId}/resources/{name}/raw | Gets the raw content of the last revision of a catalog object
[**getUsingGET**](CatalogObjectControllerApi.md#getUsingGET) | **GET** /buckets/{bucketId}/resources/{name} | Gets a catalog object&#39;s metadata by IDs
[**listUsingGET1**](CatalogObjectControllerApi.md#listUsingGET1) | **GET** /buckets/{bucketId}/resources | Lists catalog objects metadata
[**restoreUsingPUT**](CatalogObjectControllerApi.md#restoreUsingPUT) | **PUT** /buckets/{bucketId}/resources/{name} | Restore a catalog object revision


<a name="createUsingPOST1"></a>
# **createUsingPOST1**
> CatalogObjectMetadataList createUsingPOST1(bucketId, file, sessionID, name, kind, commitMessage, objectContentType)

Creates a new catalog object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
Long bucketId = 789L; // Long | bucketId
File file = new File("/path/to/file.txt"); // File | file
String sessionID = "sessionID_example"; // String | sessionID
String name = "name_example"; // String | Name of the object or empty when a ZIP archive is uploaded (All objects inside the archive are stored inside the catalog).
String kind = "kind_example"; // String | Kind of the new object
String commitMessage = "commitMessage_example"; // String | Commit message
String objectContentType = "objectContentType_example"; // String | The content type of CatalogRawObject
try {
    CatalogObjectMetadataList result = apiInstance.createUsingPOST1(bucketId, file, sessionID, name, kind, commitMessage, objectContentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#createUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucketId |
 **file** | **File**| file |
 **sessionID** | **String**| sessionID | [optional]
 **name** | **String**| Name of the object or empty when a ZIP archive is uploaded (All objects inside the archive are stored inside the catalog). | [optional]
 **kind** | **String**| Kind of the new object | [optional]
 **commitMessage** | **String**| Commit message | [optional]
 **objectContentType** | **String**| The content type of CatalogRawObject | [optional]

### Return type

[**CatalogObjectMetadataList**](CatalogObjectMetadataList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="deleteUsingDELETE1"></a>
# **deleteUsingDELETE1**
> Object deleteUsingDELETE1(bucketId, name, sessionID)

Delete a catalog object

Delete the entire catalog object as well as its revisions. Returns the deleted CatalogRawObject&#39;s metadata

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
Long bucketId = 789L; // Long | bucketId
String name = "name_example"; // String | name
String sessionID = "sessionID_example"; // String | sessionID
try {
    Object result = apiInstance.deleteUsingDELETE1(bucketId, name, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#deleteUsingDELETE1");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getRawUsingGET"></a>
# **getRawUsingGET**
> File getRawUsingGET(bucketId, name, sessionID)

Gets the raw content of the last revision of a catalog object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
Long bucketId = 789L; // Long | bucketId
String name = "name_example"; // String | name
String sessionID = "sessionID_example"; // String | sessionID
try {
    File result = apiInstance.getRawUsingGET(bucketId, name, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#getRawUsingGET");
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

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsingGET"></a>
# **getUsingGET**
> Object getUsingGET(bucketId, name, sessionID)

Gets a catalog object&#39;s metadata by IDs

Returns metadata associated to the latest revision of the catalog object.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
Long bucketId = 789L; // Long | bucketId
String name = "name_example"; // String | name
String sessionID = "sessionID_example"; // String | sessionID
try {
    Object result = apiInstance.getUsingGET(bucketId, name, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#getUsingGET");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET1"></a>
# **listUsingGET1**
> Object listUsingGET1(bucketId, sessionID, kind, name, page, size, sort)

Lists catalog objects metadata

Returns catalog objects metadata associated to the latest revision.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
Long bucketId = 789L; // Long | bucketId
String sessionID = "sessionID_example"; // String | sessionID
String kind = "kind_example"; // String | Filter according to kind.
String name = "name_example"; // String | Give a list of name separated by comma to get them in an archive
Integer page = 56; // Integer | Results page you want to retrieve (0..N)
Integer size = 56; // Integer | Number of records per page.
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    Object result = apiInstance.listUsingGET1(bucketId, sessionID, kind, name, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#listUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucketId |
 **sessionID** | **String**| sessionID | [optional]
 **kind** | **String**| Filter according to kind. | [optional]
 **name** | **String**| Give a list of name separated by comma to get them in an archive | [optional]
 **page** | **Integer**| Results page you want to retrieve (0..N) | [optional]
 **size** | **Integer**| Number of records per page. | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="restoreUsingPUT"></a>
# **restoreUsingPUT**
> Object restoreUsingPUT(bucketId, name, commitTime, sessionID)

Restore a catalog object revision

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
Long bucketId = 789L; // Long | bucketId
String name = "name_example"; // String | name
Long commitTime = 789L; // Long | commitTime
String sessionID = "sessionID_example"; // String | sessionID
try {
    Object result = apiInstance.restoreUsingPUT(bucketId, name, commitTime, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#restoreUsingPUT");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

