# CatalogObjectControllerApi

All URIs are relative to *https://localhost:8080/catalog*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST1**](CatalogObjectControllerApi.md#createUsingPOST1) | **POST** /buckets/{bucketName}/resources | Creates a new catalog object
[**deleteUsingDELETE1**](CatalogObjectControllerApi.md#deleteUsingDELETE1) | **DELETE** /buckets/{bucketName}/resources/{name} | Delete a catalog object
[**getRawUsingGET**](CatalogObjectControllerApi.md#getRawUsingGET) | **GET** /buckets/{bucketName}/resources/{name}/raw | Gets the raw content of the last revision of a catalog object
[**getUsingGET**](CatalogObjectControllerApi.md#getUsingGET) | **GET** /buckets/{bucketName}/resources/{name} | Gets a catalog object&#39;s metadata by IDs
[**listUsingGET1**](CatalogObjectControllerApi.md#listUsingGET1) | **GET** /buckets/{bucketName}/resources | Lists catalog objects metadata


<a name="createUsingPOST1"></a>
# **createUsingPOST1**
> CatalogObjectMetadataList createUsingPOST1(bucketName, kind, commitMessage, objectContentType, file, sessionID, name)

Creates a new catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
String bucketName = "bucketName_example"; // String | bucketName
String kind = "kind_example"; // String | Kind of the new object
String commitMessage = "commitMessage_example"; // String | Commit message
String objectContentType = "objectContentType_example"; // String | The content type of CatalogRawObject - MIME type
File file = new File("/path/to/file.txt"); // File | The content of CatalogRawObject
String sessionID = "sessionID_example"; // String | sessionID
String name = "name_example"; // String | Name of the object or empty when a ZIP archive is uploaded (All objects inside the archive are stored inside the catalog).
try {
    CatalogObjectMetadataList result = apiInstance.createUsingPOST1(bucketName, kind, commitMessage, objectContentType, file, sessionID, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#createUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| bucketName |
 **kind** | **String**| Kind of the new object |
 **commitMessage** | **String**| Commit message |
 **objectContentType** | **String**| The content type of CatalogRawObject - MIME type |
 **file** | **File**| The content of CatalogRawObject |
 **sessionID** | **String**| sessionID | [optional]
 **name** | **String**| Name of the object or empty when a ZIP archive is uploaded (All objects inside the archive are stored inside the catalog). | [optional]

### Return type

[**CatalogObjectMetadataList**](CatalogObjectMetadataList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="deleteUsingDELETE1"></a>
# **deleteUsingDELETE1**
> CatalogObjectMetadata deleteUsingDELETE1(bucketName, name, sessionID)

Delete a catalog object

Delete the entire catalog object as well as its revisions. Returns the deleted CatalogObject&#39;s metadata.

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
String bucketName = "bucketName_example"; // String | bucketName
String name = "name_example"; // String | name
String sessionID = "sessionID_example"; // String | sessionID
try {
    CatalogObjectMetadata result = apiInstance.deleteUsingDELETE1(bucketName, name, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#deleteUsingDELETE1");
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

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getRawUsingGET"></a>
# **getRawUsingGET**
> String getRawUsingGET(bucketName, name, sessionID)

Gets the raw content of the last revision of a catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
String bucketName = "bucketName_example"; // String | bucketName
String name = "name_example"; // String | name
String sessionID = "sessionID_example"; // String | sessionID
try {
    String result = apiInstance.getRawUsingGET(bucketName, name, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#getRawUsingGET");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsingGET"></a>
# **getUsingGET**
> CatalogObjectMetadata getUsingGET(bucketName, name, sessionID)

Gets a catalog object&#39;s metadata by IDs

Returns metadata associated to the latest revision of the catalog object.

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
String bucketName = "bucketName_example"; // String | bucketName
String name = "name_example"; // String | name
String sessionID = "sessionID_example"; // String | sessionID
try {
    CatalogObjectMetadata result = apiInstance.getUsingGET(bucketName, name, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#getUsingGET");
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

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET1"></a>
# **listUsingGET1**
> List&lt;CatalogObjectMetadata&gt; listUsingGET1(bucketName, sessionID, kind, name)

Lists catalog objects metadata

Returns catalog objects metadata associated to the latest revision.

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
String bucketName = "bucketName_example"; // String | bucketName
String sessionID = "sessionID_example"; // String | sessionID
String kind = "kind_example"; // String | Filter according to kind.
String name = "name_example"; // String | Give a list of name separated by comma to get them in an archive
try {
    List<CatalogObjectMetadata> result = apiInstance.listUsingGET1(bucketName, sessionID, kind, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#listUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| bucketName |
 **sessionID** | **String**| sessionID | [optional]
 **kind** | **String**| Filter according to kind. | [optional]
 **name** | **String**| Give a list of name separated by comma to get them in an archive | [optional]

### Return type

[**List&lt;CatalogObjectMetadata&gt;**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

