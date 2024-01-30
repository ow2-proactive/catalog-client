# CatalogObjectControllerApi

All URIs are relative to *https://trydev2.activeeon.com:8443/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create1**](CatalogObjectControllerApi.md#create1) | **POST** /buckets/{bucketName}/resources | Creates a new catalog object |
| [**delete1**](CatalogObjectControllerApi.md#delete1) | **DELETE** /buckets/{bucketName}/resources/{name} | Delete a catalog object |
| [**exportCatalogObjects**](CatalogObjectControllerApi.md#exportCatalogObjects) | **POST** /buckets/{bucketName}/resources/export | Export catalog objects as a plain zip archive or a ProActive Catalog Package |
| [**get**](CatalogObjectControllerApi.md#get) | **GET** /buckets/{bucketName}/resources/{name} | Gets a catalog object&#39;s metadata by IDs |
| [**getDependencies**](CatalogObjectControllerApi.md#getDependencies) | **GET** /buckets/{bucketName}/resources/{name}/dependencies | Gets dependencies (dependsOn and calledBy) of a catalog object |
| [**getRaw1**](CatalogObjectControllerApi.md#getRaw1) | **GET** /buckets/{bucketName}/resources/{name}/raw | Gets the raw content of the last revision of a catalog object |
| [**importCatalogObjects**](CatalogObjectControllerApi.md#importCatalogObjects) | **POST** /buckets/{bucketName}/resources/import | Import an archive, either a plain zip or a ProActive Catalog package |
| [**list1**](CatalogObjectControllerApi.md#list1) | **GET** /buckets/{bucketName}/resources | Lists catalog objects metadata |
| [**listCatalogObjectNameReference**](CatalogObjectControllerApi.md#listCatalogObjectNameReference) | **GET** /buckets/references | Lists catalog object name references by kind and Content-Type |
| [**listContentTypes**](CatalogObjectControllerApi.md#listContentTypes) | **GET** /buckets/content-types | Lists all Content-Types for all objects |
| [**listKinds**](CatalogObjectControllerApi.md#listKinds) | **GET** /buckets/kinds | Lists all kinds for all objects |
| [**listObjectTags**](CatalogObjectControllerApi.md#listObjectTags) | **GET** /buckets/tags | Lists all tags values for all objects stored in the catalog |
| [**updateObjectMetadata**](CatalogObjectControllerApi.md#updateObjectMetadata) | **PUT** /buckets/{bucketName}/resources/{name} | Update a catalog object metadata, like kind, Content-Type, project name and tags |



## create1

> CatalogObjectMetadataList create1(sessionID, bucketName, kind, commitMessage, objectContentType, _file, name, projectName, tags)

Creates a new catalog object

### Example

```java
import java.io.File;
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String kind = "kind_example"; // String | Kind of the new object
        String commitMessage = "commitMessage_example"; // String | Commit message
        String objectContentType = "objectContentType_example"; // String | The Content-Type of CatalogRawObject - MIME type
        File _file = new File("/path/to/file"); // File | The content of CatalogRawObject
        String name = "name_example"; // String | Name of the object or empty when a ZIP archive is uploaded.<br/>All objects inside an archive will be stored inside the catalog.
        String projectName = ""; // String | Project of the object
        String tags = "tags_example"; // String | List of comma separated tags of the object
        try {
            CatalogObjectMetadataList result = apiInstance.create1(sessionID, bucketName, kind, commitMessage, objectContentType, _file, name, projectName, tags);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#create1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionID** | **String**| sessionID | |
| **bucketName** | **String**| The name of the existing Bucket | |
| **kind** | **String**| Kind of the new object | |
| **commitMessage** | **String**| Commit message | |
| **objectContentType** | **String**| The Content-Type of CatalogRawObject - MIME type | |
| **_file** | **File**| The content of CatalogRawObject | |
| **name** | **String**| Name of the object or empty when a ZIP archive is uploaded.&lt;br/&gt;All objects inside an archive will be stored inside the catalog. | [optional] |
| **projectName** | **String**| Project of the object | [optional] [default to ] |
| **tags** | **String**| List of comma separated tags of the object | [optional] |

### Return type

[**CatalogObjectMetadataList**](CatalogObjectMetadataList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket not found |  -  |
| **422** | Invalid file content supplied |  -  |
| **201** | Created |  -  |


## delete1

> delete1(sessionID, bucketName, name)

Delete a catalog object

Note: delete the entire catalog object as well as its revisions. Returns the deleted CatalogObject's metadata.

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String name = "name_example"; // String | The name of the Object to delete
        try {
            apiInstance.delete1(sessionID, bucketName, name);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#delete1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionID** | **String**| sessionID | |
| **bucketName** | **String**| The name of the existing Bucket | |
| **name** | **String**| The name of the Object to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket or object not found |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |


## exportCatalogObjects

> List&lt;CatalogObjectMetadata&gt; exportCatalogObjects(bucketName, sessionID, isPlainZip, requestBody)

Export catalog objects as a plain zip archive or a ProActive Catalog Package

Can either export catalog objects as a plain zip or as a ProActive Package containing the exported files along with a METADATA json file describing the exported objects. <br/> Note: Returns catalog objects metadata associated to the latest revision.

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        String bucketName = "bucketName_example"; // String | 
        String sessionID = "sessionID_example"; // String | sessionID
        Boolean isPlainZip = false; // Boolean | Plain zip instead of a Proactive package
        List<String> requestBody = Arrays.asList(); // List<String> | An optional json list of catalog object names to export. If not provided, the bucket will be exported fully.
        try {
            List<CatalogObjectMetadata> result = apiInstance.exportCatalogObjects(bucketName, sessionID, isPlainZip, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#exportCatalogObjects");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bucketName** | **String**|  | |
| **sessionID** | **String**| sessionID | [optional] |
| **isPlainZip** | **Boolean**| Plain zip instead of a Proactive package | [optional] [default to false] |
| **requestBody** | **List&lt;String&gt;**| An optional json list of catalog object names to export. If not provided, the bucket will be exported fully. | [optional] |

### Return type

[**List&lt;CatalogObjectMetadata&gt;**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **206** | Missing object |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **404** | Bucket not found or no object was found |  -  |


## get

> CatalogObjectMetadata get(bucketName, name, sessionID, checkAssociationStatus)

Gets a catalog object&#39;s metadata by IDs

Note: returns metadata associated to the latest revision of the catalog object.

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String name = "name_example"; // String | The name of the existing Object
        String sessionID = "sessionID_example"; // String | sessionID
        Boolean checkAssociationStatus = false; // Boolean | Check job planner association status
        try {
            CatalogObjectMetadata result = apiInstance.get(bucketName, name, sessionID, checkAssociationStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#get");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bucketName** | **String**| The name of the existing Bucket | |
| **name** | **String**| The name of the existing Object | |
| **sessionID** | **String**| sessionID | [optional] |
| **checkAssociationStatus** | **Boolean**| Check job planner association status | [optional] [default to false] |

### Return type

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **404** | Bucket or catalog object not found |  -  |
| **200** | OK |  -  |


## getDependencies

> CatalogObjectDependencies getDependencies(bucketName, name, sessionID)

Gets dependencies (dependsOn and calledBy) of a catalog object

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String name = "name_example"; // String | The name of the existing Object
        String sessionID = "sessionID_example"; // String | sessionID
        try {
            CatalogObjectDependencies result = apiInstance.getDependencies(bucketName, name, sessionID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#getDependencies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bucketName** | **String**| The name of the existing Bucket | |
| **name** | **String**| The name of the existing Object | |
| **sessionID** | **String**| sessionID | [optional] |

### Return type

[**CatalogObjectDependencies**](CatalogObjectDependencies.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket, catalog object or catalog object revision not found |  -  |
| **200** | Ok |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |


## getRaw1

> String getRaw1(bucketName, name, sessionID)

Gets the raw content of the last revision of a catalog object

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String name = "name_example"; // String | The name of the existing Object
        String sessionID = "sessionID_example"; // String | sessionID
        try {
            String result = apiInstance.getRaw1(bucketName, name, sessionID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#getRaw1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bucketName** | **String**| The name of the existing Bucket | |
| **name** | **String**| The name of the existing Object | |
| **sessionID** | **String**| sessionID | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket, catalog object or catalog object revision not found |  -  |
| **200** | Ok |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |


## importCatalogObjects

> CatalogObjectMetadataList importCatalogObjects(sessionID, bucketName, _file, isPlainZip, commitMessage, kind, projectName, tags)

Import an archive, either a plain zip or a ProActive Catalog package

Can either import objects from a plain zip archive, in which case the objects kind, project name and tags must be specified. Alternatively, a ProActive Catalog package can be imported, the various information will be obtained from the METADATA json file present in the package.

### Example

```java
import java.io.File;
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        File _file = new File("/path/to/file"); // File | The ProActive package zip file
        Boolean isPlainZip = false; // Boolean | Plain zip instead of a Proactive package
        String commitMessage = ""; // String | Commit message. If empty, the message will either be empty for a plain zip or the commit message recorded inside the ProActive Catalog package.
        String kind = "kind_example"; // String | Kind of the new object (only used when importing a plain zip)
        String projectName = ""; // String | Project of the package objects (Optional). If used with a ProActive Catalog package, will override all objects project names.
        String tags = "tags_example"; // String | List of comma separated tags of the objects (Optional). If used with a ProActive Catalog package, will override all objects tags.
        try {
            CatalogObjectMetadataList result = apiInstance.importCatalogObjects(sessionID, bucketName, _file, isPlainZip, commitMessage, kind, projectName, tags);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#importCatalogObjects");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionID** | **String**| sessionID | |
| **bucketName** | **String**| The name of the existing Bucket | |
| **_file** | **File**| The ProActive package zip file | |
| **isPlainZip** | **Boolean**| Plain zip instead of a Proactive package | [optional] [default to false] |
| **commitMessage** | **String**| Commit message. If empty, the message will either be empty for a plain zip or the commit message recorded inside the ProActive Catalog package. | [optional] [default to ] |
| **kind** | **String**| Kind of the new object (only used when importing a plain zip) | [optional] |
| **projectName** | **String**| Project of the package objects (Optional). If used with a ProActive Catalog package, will override all objects project names. | [optional] [default to ] |
| **tags** | **String**| List of comma separated tags of the objects (Optional). If used with a ProActive Catalog package, will override all objects tags. | [optional] |

### Return type

[**CatalogObjectMetadataList**](CatalogObjectMetadataList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket not found |  -  |
| **422** | Invalid file content supplied |  -  |
| **201** | Created |  -  |


## list1

> List&lt;CatalogObjectMetadata&gt; list1(bucketName, sessionID, kind, contentType, objectName, objectTag, associationStatus, projectName, lastCommitBy, lastCommitTimeGreater, lastCommitTimeLessThan, listObjectNamesForArchive, pageNo, pageSize)

Lists catalog objects metadata

Note: Returns catalog objects metadata associated to the latest revision.

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        String bucketName = "bucketName_example"; // String | 
        String sessionID = "sessionID_example"; // String | sessionID
        String kind = "kind_example"; // String | Filter according to kind(s).<br/>Multiple kinds can be specified using comma separators
        String contentType = "contentType_example"; // String | Filter according to Content-Type.
        String objectName = "objectName_example"; // String | Filter according to Object Name.
        String objectTag = "objectTag_example"; // String | Filter according to Object Tag.
        String associationStatus = "ALL"; // String | Filter according to Job-Planner association status.<br/>If enabled, only objects for which a job-planner association exists with the provided status will be returned.<br/>Parameter can be ALL, PLANNED, DEACTIVATED, FAILED or UNPLANNED.<br/>ALL will filter objects which have an association with any status.<br/>UNPLANNED will filter objects without any association.
        String projectName = "projectName_example"; // String | Include only objects whose project name contains the given string.
        String lastCommitBy = "lastCommitBy_example"; // String | Include only objects whose last commit belong to the given user.
        Long lastCommitTimeGreater = 56L; // Long | Include only objects whose last commit time is greater than the given EPOCH time.
        Long lastCommitTimeLessThan = 56L; // Long | Include only objects whose last commit time is less than the given EPOCH time.
        List<String> listObjectNamesForArchive = Arrays.asList(); // List<String> | Give a list of name separated by comma to get them in an archive
        Integer pageNo = 0; // Integer | Page number
        Integer pageSize = 2147483647; // Integer | Page size
        try {
            List<CatalogObjectMetadata> result = apiInstance.list1(bucketName, sessionID, kind, contentType, objectName, objectTag, associationStatus, projectName, lastCommitBy, lastCommitTimeGreater, lastCommitTimeLessThan, listObjectNamesForArchive, pageNo, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#list1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bucketName** | **String**|  | |
| **sessionID** | **String**| sessionID | [optional] |
| **kind** | **String**| Filter according to kind(s).&lt;br/&gt;Multiple kinds can be specified using comma separators | [optional] |
| **contentType** | **String**| Filter according to Content-Type. | [optional] |
| **objectName** | **String**| Filter according to Object Name. | [optional] |
| **objectTag** | **String**| Filter according to Object Tag. | [optional] |
| **associationStatus** | **String**| Filter according to Job-Planner association status.&lt;br/&gt;If enabled, only objects for which a job-planner association exists with the provided status will be returned.&lt;br/&gt;Parameter can be ALL, PLANNED, DEACTIVATED, FAILED or UNPLANNED.&lt;br/&gt;ALL will filter objects which have an association with any status.&lt;br/&gt;UNPLANNED will filter objects without any association. | [optional] [enum: ALL, PLANNED, DEACTIVATED, FAILED, UNPLANNED] |
| **projectName** | **String**| Include only objects whose project name contains the given string. | [optional] |
| **lastCommitBy** | **String**| Include only objects whose last commit belong to the given user. | [optional] |
| **lastCommitTimeGreater** | **Long**| Include only objects whose last commit time is greater than the given EPOCH time. | [optional] |
| **lastCommitTimeLessThan** | **Long**| Include only objects whose last commit time is less than the given EPOCH time. | [optional] |
| **listObjectNamesForArchive** | **List&lt;String&gt;**| Give a list of name separated by comma to get them in an archive | [optional] |
| **pageNo** | **Integer**| Page number | [optional] [default to 0] |
| **pageSize** | **Integer**| Page size | [optional] [default to 2147483647] |

### Return type

[**List&lt;CatalogObjectMetadata&gt;**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket not found |  -  |
| **206** | Missing object |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |


## listCatalogObjectNameReference

> List&lt;CatalogObjectNameReference&gt; listCatalogObjectNameReference(sessionID, kind, contentType)

Lists catalog object name references by kind and Content-Type

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String kind = "kind_example"; // String | Filter according to kind
        String contentType = "contentType_example"; // String | Filter according to Content-Type
        try {
            List<CatalogObjectNameReference> result = apiInstance.listCatalogObjectNameReference(sessionID, kind, contentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#listCatalogObjectNameReference");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionID** | **String**| sessionID | [optional] |
| **kind** | **String**| Filter according to kind | [optional] |
| **contentType** | **String**| Filter according to Content-Type | [optional] |

### Return type

[**List&lt;CatalogObjectNameReference&gt;**](CatalogObjectNameReference.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **200** | OK |  -  |


## listContentTypes

> Set&lt;String&gt; listContentTypes()

Lists all Content-Types for all objects

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        try {
            Set<String> result = apiInstance.listContentTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#listContentTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Set&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## listKinds

> Set&lt;String&gt; listKinds()

Lists all kinds for all objects

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        try {
            Set<String> result = apiInstance.listKinds();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#listKinds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Set&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## listObjectTags

> Set&lt;String&gt; listObjectTags()

Lists all tags values for all objects stored in the catalog

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        try {
            Set<String> result = apiInstance.listObjectTags();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#listObjectTags");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Set&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateObjectMetadata

> CatalogObjectMetadata updateObjectMetadata(sessionID, bucketName, name, kind, contentType, projectName, tags)

Update a catalog object metadata, like kind, Content-Type, project name and tags

### Example

```java
// Import classes:
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.CatalogObjectControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");

        CatalogObjectControllerApi apiInstance = new CatalogObjectControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String bucketName = "bucketName_example"; // String | The name of the existing Bucket
        String name = "name_example"; // String | The name of the existing Object
        String kind = "kind_example"; // String | The new kind of an object
        String contentType = "contentType_example"; // String | The new Content-Type of an object - MIME type
        String projectName = "projectName_example"; // String | The new project name of an object
        String tags = "tags_example"; // String | List of comma separated tags of the object
        try {
            CatalogObjectMetadata result = apiInstance.updateObjectMetadata(sessionID, bucketName, name, kind, contentType, projectName, tags);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogObjectControllerApi#updateObjectMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionID** | **String**| sessionID | |
| **bucketName** | **String**| The name of the existing Bucket | |
| **name** | **String**| The name of the existing Object | |
| **kind** | **String**| The new kind of an object | [optional] |
| **contentType** | **String**| The new Content-Type of an object - MIME type | [optional] |
| **projectName** | **String**| The new project name of an object | [optional] |
| **tags** | **String**| List of comma separated tags of the object | [optional] |

### Return type

[**CatalogObjectMetadata**](CatalogObjectMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Bucket, object or revision not found |  -  |
| **401** | User not authenticated |  -  |
| **403** | Permission denied |  -  |
| **400** | Wrong specified parameters: at least one should be present |  -  |
| **200** | OK |  -  |

