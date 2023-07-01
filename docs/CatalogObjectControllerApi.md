# CatalogObjectControllerApi

All URIs are relative to *https://trydev.activeeon.com:8443/catalog*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST1**](CatalogObjectControllerApi.md#createUsingPOST1) | **POST** /buckets/{bucketName}/resources | Creates a new catalog object
[**deleteUsingDELETE1**](CatalogObjectControllerApi.md#deleteUsingDELETE1) | **DELETE** /buckets/{bucketName}/resources/{name} | Delete a catalog object
[**getDependenciesUsingGET**](CatalogObjectControllerApi.md#getDependenciesUsingGET) | **GET** /buckets/{bucketName}/resources/{name}/dependencies | Gets dependencies (dependsOn and calledBy) of a catalog object
[**getRawUsingGET**](CatalogObjectControllerApi.md#getRawUsingGET) | **GET** /buckets/{bucketName}/resources/{name}/raw | Gets the raw content of the last revision of a catalog object
[**getUsingGET**](CatalogObjectControllerApi.md#getUsingGET) | **GET** /buckets/{bucketName}/resources/{name} | Gets a catalog object&#39;s metadata by IDs
[**listCatalogObjectNameReferenceUsingGET**](CatalogObjectControllerApi.md#listCatalogObjectNameReferenceUsingGET) | **GET** /buckets/references | Lists catalog object name references by kind and Content-Type
[**listContentTypesUsingGET**](CatalogObjectControllerApi.md#listContentTypesUsingGET) | **GET** /buckets/content-types | Lists all Content-Types for all objects
[**listKindsUsingGET**](CatalogObjectControllerApi.md#listKindsUsingGET) | **GET** /buckets/kinds | Lists all kinds for all objects
[**listObjectTagsUsingGET**](CatalogObjectControllerApi.md#listObjectTagsUsingGET) | **GET** /buckets/tags | Lists all tags values for all objects stored in the catalog
[**listUsingGET1**](CatalogObjectControllerApi.md#listUsingGET1) | **GET** /buckets/{bucketName}/resources | Lists catalog objects metadata
[**updateObjectMetadataUsingPUT**](CatalogObjectControllerApi.md#updateObjectMetadataUsingPUT) | **PUT** /buckets/{bucketName}/resources/{name} | Update a catalog object metadata, like kind, Content-Type, project name and tags


<a name="createUsingPOST1"></a>
# **createUsingPOST1**
> CatalogObjectMetadataList createUsingPOST1(sessionID, bucketName, kind, commitMessage, objectContentType, file, name, projectName, tags)

Creates a new catalog object

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | bucketName
String kind = "kind_example"; // String | Kind of the new object
String commitMessage = "commitMessage_example"; // String | Commit message
String objectContentType = "objectContentType_example"; // String | The Content-Type of CatalogRawObject - MIME type
File file = new File("/path/to/file.txt"); // File | The content of CatalogRawObject
String name = "name_example"; // String | Name of the object or empty when a ZIP archive is uploaded (All objects inside the archive are stored inside the catalog).
String projectName = "projectName_example"; // String | Project of the object
String tags = "tags_example"; // String | List of comma separated tags of the object
try {
    CatalogObjectMetadataList result = apiInstance.createUsingPOST1(sessionID, bucketName, kind, commitMessage, objectContentType, file, name, projectName, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#createUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| bucketName |
 **kind** | **String**| Kind of the new object |
 **commitMessage** | **String**| Commit message |
 **objectContentType** | **String**| The Content-Type of CatalogRawObject - MIME type |
 **file** | **File**| The content of CatalogRawObject |
 **name** | **String**| Name of the object or empty when a ZIP archive is uploaded (All objects inside the archive are stored inside the catalog). | [optional]
 **projectName** | **String**| Project of the object | [optional]
 **tags** | **String**| List of comma separated tags of the object | [optional]

### Return type

[**CatalogObjectMetadataList**](CatalogObjectMetadataList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="deleteUsingDELETE1"></a>
# **deleteUsingDELETE1**
> CatalogObjectMetadata deleteUsingDELETE1(sessionID, bucketName, name)

Delete a catalog object

Delete the entire catalog object as well as its revisions. Returns the deleted CatalogObject&#39;s metadata.

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | bucketName
String name = "name_example"; // String | name
try {
    CatalogObjectMetadata result = apiInstance.deleteUsingDELETE1(sessionID, bucketName, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#deleteUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| bucketName |
 **name** | **String**| name |

### Return type

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDependenciesUsingGET"></a>
# **getDependenciesUsingGET**
> CatalogObjectDependencies getDependenciesUsingGET(bucketName, name, sessionID)

Gets dependencies (dependsOn and calledBy) of a catalog object

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
    CatalogObjectDependencies result = apiInstance.getDependenciesUsingGET(bucketName, name, sessionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#getDependenciesUsingGET");
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

[**CatalogObjectDependencies**](CatalogObjectDependencies.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

<a name="listCatalogObjectNameReferenceUsingGET"></a>
# **listCatalogObjectNameReferenceUsingGET**
> List&lt;CatalogObjectNameReference&gt; listCatalogObjectNameReferenceUsingGET(sessionID, kind, contentType)

Lists catalog object name references by kind and Content-Type

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String kind = "kind_example"; // String | Filter according to kind
String contentType = "contentType_example"; // String | Filter according to Content-Type
try {
    List<CatalogObjectNameReference> result = apiInstance.listCatalogObjectNameReferenceUsingGET(sessionID, kind, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#listCatalogObjectNameReferenceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID | [optional]
 **kind** | **String**| Filter according to kind | [optional]
 **contentType** | **String**| Filter according to Content-Type | [optional]

### Return type

[**List&lt;CatalogObjectNameReference&gt;**](CatalogObjectNameReference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listContentTypesUsingGET"></a>
# **listContentTypesUsingGET**
> List&lt;String&gt; listContentTypesUsingGET()

Lists all Content-Types for all objects

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
try {
    List<String> result = apiInstance.listContentTypesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#listContentTypesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listKindsUsingGET"></a>
# **listKindsUsingGET**
> List&lt;String&gt; listKindsUsingGET()

Lists all kinds for all objects

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
try {
    List<String> result = apiInstance.listKindsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#listKindsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listObjectTagsUsingGET"></a>
# **listObjectTagsUsingGET**
> List&lt;String&gt; listObjectTagsUsingGET()

Lists all tags values for all objects stored in the catalog

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
try {
    List<String> result = apiInstance.listObjectTagsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#listObjectTagsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUsingGET1"></a>
# **listUsingGET1**
> List&lt;CatalogObjectMetadata&gt; listUsingGET1(bucketName, sessionID, kind, contentType, objectName, objectTag, listObjectNamesForArchive, pageNo, pageSize)

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
String kind = "kind_example"; // String | Filter according to kind(s). Multiple kinds can be specified using comma separators
String contentType = "contentType_example"; // String | Filter according to Content-Type.
String objectName = "objectName_example"; // String | Filter according to Object Name.
String objectTag = "objectTag_example"; // String | Filter according to Object Tag.
String listObjectNamesForArchive = "listObjectNamesForArchive_example"; // String | Give a list of name separated by comma to get them in an archive
Integer pageNo = 0; // Integer | Page number
Integer pageSize = 2147483647; // Integer | Page size
try {
    List<CatalogObjectMetadata> result = apiInstance.listUsingGET1(bucketName, sessionID, kind, contentType, objectName, objectTag, listObjectNamesForArchive, pageNo, pageSize);
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
 **kind** | **String**| Filter according to kind(s). Multiple kinds can be specified using comma separators | [optional]
 **contentType** | **String**| Filter according to Content-Type. | [optional]
 **objectName** | **String**| Filter according to Object Name. | [optional]
 **objectTag** | **String**| Filter according to Object Tag. | [optional]
 **listObjectNamesForArchive** | **String**| Give a list of name separated by comma to get them in an archive | [optional]
 **pageNo** | **Integer**| Page number | [optional] [default to 0]
 **pageSize** | **Integer**| Page size | [optional] [default to 2147483647]

### Return type

[**List&lt;CatalogObjectMetadata&gt;**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateObjectMetadataUsingPUT"></a>
# **updateObjectMetadataUsingPUT**
> CatalogObjectMetadata updateObjectMetadataUsingPUT(sessionID, bucketName, name, kind, contentType, projectName, tags)

Update a catalog object metadata, like kind, Content-Type, project name and tags

### Example
```java
// Import classes:
//import org.ow2.proactive.catalog.client.ApiException;
//import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;


CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi();
String sessionID = "sessionID_example"; // String | sessionID
String bucketName = "bucketName_example"; // String | bucketName
String name = "name_example"; // String | name
String kind = "kind_example"; // String | The new kind of an object
String contentType = "contentType_example"; // String | The new Content-Type of an object - MIME type
String projectName = "projectName_example"; // String | The new project name of an object
String tags = "tags_example"; // String | List of comma separated tags of the object
try {
    CatalogObjectMetadata result = apiInstance.updateObjectMetadataUsingPUT(sessionID, bucketName, name, kind, contentType, projectName, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogObjectControllerApi#updateObjectMetadataUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionID** | **String**| sessionID |
 **bucketName** | **String**| bucketName |
 **name** | **String**| name |
 **kind** | **String**| The new kind of an object | [optional]
 **contentType** | **String**| The new Content-Type of an object - MIME type | [optional]
 **projectName** | **String**| The new project name of an object | [optional]
 **tags** | **String**| List of comma separated tags of the object | [optional]

### Return type

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

