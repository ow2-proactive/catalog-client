# CatalogObjectReportControllerApi

All URIs are relative to *https://marouns-mbp:8080/catalog*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReportForSelectedObjectsUsingGET**](CatalogObjectReportControllerApi.md#getReportForSelectedObjectsUsingGET) | **GET** /buckets/report/selected/{bucketName} | Get list of selected catalog objects in a PDF report file
[**getReportUsingGET**](CatalogObjectReportControllerApi.md#getReportUsingGET) | **GET** /buckets/report | Get list of catalog objects in a PDF report file


<a name="getReportForSelectedObjectsUsingGET"></a>
# **getReportForSelectedObjectsUsingGET**
> getReportForSelectedObjectsUsingGET(bucketName, sessionID, owner, kind, contentType, name)

Get list of selected catalog objects in a PDF report file

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectReportControllerApi;


CatalogObjectReportControllerApi apiInstance = new CatalogObjectReportControllerApi();
String bucketName = "bucketName_example"; // String | bucketName
String sessionID = "sessionID_example"; // String | sessionID
String owner = "owner_example"; // String | The name of the user who owns the Bucket
String kind = "kind_example"; // String | Filter according to kind.
String contentType = "contentType_example"; // String | Filter according to Content-Type.
String name = "name_example"; // String | Give a list of name separated by comma to get them in the report
try {
    apiInstance.getReportForSelectedObjectsUsingGET(bucketName, sessionID, owner, kind, contentType, name);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectReportControllerApi#getReportForSelectedObjectsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| bucketName |
 **sessionID** | **String**| sessionID | [optional]
 **owner** | **String**| The name of the user who owns the Bucket | [optional]
 **kind** | **String**| Filter according to kind. | [optional]
 **contentType** | **String**| Filter according to Content-Type. | [optional]
 **name** | **String**| Give a list of name separated by comma to get them in the report | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getReportUsingGET"></a>
# **getReportUsingGET**
> getReportUsingGET(sessionID, owner, kind, contentType)

Get list of catalog objects in a PDF report file

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectReportControllerApi;


CatalogObjectReportControllerApi apiInstance = new CatalogObjectReportControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String owner = "owner_example"; // String | The name of the user who owns the Bucket
String kind = "kind_example"; // String | The kind of objects that buckets must contain
String contentType = "contentType_example"; // String | The Content-Type of objects that buckets must contain
try {
    apiInstance.getReportUsingGET(sessionID, owner, kind, contentType);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectReportControllerApi#getReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID | [optional]
 **owner** | **String**| The name of the user who owns the Bucket | [optional]
 **kind** | **String**| The kind of objects that buckets must contain | [optional]
 **contentType** | **String**| The Content-Type of objects that buckets must contain | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

