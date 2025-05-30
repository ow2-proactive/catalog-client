# openapi-java-client

CatalogObjectEntity Catalog API

- API version: 1.0\&quot;

- Build date: 2025-03-27T12:13:03.112691600+01:00[Europe/Berlin]

The purpose of the catalog is to store ProActive objects.

A catalog is subdivided into buckets.

 Each bucket manages zero, one or more
versioned ProActive objects.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0"</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0""
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-1.0".jar`
- `target/lib/*.jar`

## Usage

To add a HTTP proxy for the API client, use `ClientConfig`:
```java

import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.ow2.proactive.catalog.client.*;
import org.ow2.proactive.catalog.client.api.BucketControllerApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

BucketControllerApi apiInstance = new BucketControllerApi(defaultClient);

```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.ow2.proactive.catalog.client.*;
import org.ow2.proactive.catalog.client.auth.*;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.api.BucketControllerApi;

public class BucketControllerApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://trydev2.activeeon.com:8443/catalog");
        
        BucketControllerApi apiInstance = new BucketControllerApi(defaultClient);
        String sessionID = "sessionID_example"; // String | sessionID
        String owner = "owner_example"; // String | The name of the user who owns the Bucket
        String tenant = "tenant_example"; // String | The name of the tenant that has access to the Bucket
        String kind = "kind_example"; // String | The kind(s) of objects that buckets must contain.<br />Multiple kinds can be specified using comma separators
        String contentType = "contentType_example"; // String | The Content-Type of objects that buckets must contain
        String objectTag = "objectTag_example"; // String | The tag of objects that buckets must contain
        String associationStatus = "ALL"; // String | The buckets must contain objects which have the given job-planner association status.<br />Can be ALL, PLANNED, DEACTIVATED, FAILED or UNPLANNED.<br />ALL will filter objects which have an association with any status.<br />UNPLANNED will filter objects without any association.
        String objectName = "objectName_example"; // String | The name of objects that buckets must contain
        String bucketName = "bucketName_example"; // String | The bucket name contains the value of this parameter (case insensitive)
        String projectName = "projectName_example"; // String | Include only objects whose project name contains the given string.
        String lastCommitBy = "lastCommitBy_example"; // String | Include only objects whose last commit belong to the given user.
        String committedAtLeastOnceBy = "committedAtLeastOnceBy_example"; // String | Include only objects have been committed at least once by the given user.
        Long lastCommitTimeGreater = 0L; // Long | Include only objects whose last commit time is greater than the given EPOCH time.
        Long lastCommitTimeLessThan = 0L; // Long | Include only objects whose last commit time is less than the given EPOCH time.
        String allBuckets = "false"; // String | If true, buckets without objects matching the filters will be returned with objectCount=0. Default is false
        try {
            List<BucketMetadata> result = apiInstance.callList(sessionID, owner, tenant, kind, contentType, objectTag, associationStatus, objectName, bucketName, projectName, lastCommitBy, committedAtLeastOnceBy, lastCommitTimeGreater, lastCommitTimeLessThan, allBuckets);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketControllerApi#callList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://trydev2.activeeon.com:8443/catalog*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BucketControllerApi* | [**callList**](docs/BucketControllerApi.md#callList) | **GET** /buckets | Lists the buckets
*BucketControllerApi* | [**cleanEmpty**](docs/BucketControllerApi.md#cleanEmpty) | **DELETE** /buckets | Delete the empty buckets
*BucketControllerApi* | [**create**](docs/BucketControllerApi.md#create) | **POST** /buckets | Creates a new bucket
*BucketControllerApi* | [**delete**](docs/BucketControllerApi.md#delete) | **DELETE** /buckets/{bucketName} | Delete an empty bucket
*BucketControllerApi* | [**getMetadata**](docs/BucketControllerApi.md#getMetadata) | **GET** /buckets/{bucketName} | Gets a bucket&#39;s metadata by ID
*BucketControllerApi* | [**updateBucketOwner**](docs/BucketControllerApi.md#updateBucketOwner) | **PUT** /buckets/{bucketName} | Update bucket owner
*BucketGrantControllerApi* | [**createBucketGrantForAGroup**](docs/BucketGrantControllerApi.md#createBucketGrantForAGroup) | **POST** /buckets/{bucketName}/grant/group | Create a new user group grant access for a bucket
*BucketGrantControllerApi* | [**createBucketGrantForAUser**](docs/BucketGrantControllerApi.md#createBucketGrantForAUser) | **POST** /buckets/{bucketName}/grant/user | Create a new user grant access for a bucket
*BucketGrantControllerApi* | [**deleteAllBucketGrantsAssignedToABucket**](docs/BucketGrantControllerApi.md#deleteAllBucketGrantsAssignedToABucket) | **DELETE** /buckets/{bucketName}/grant | Delete all grants assigned to a bucket
*BucketGrantControllerApi* | [**deleteAllGrantsForABucketAndItsObjects**](docs/BucketGrantControllerApi.md#deleteAllGrantsForABucketAndItsObjects) | **DELETE** /buckets/{bucketName}/grant/all | Delete all grants associated with a bucket and all objects contained in this bucket
*BucketGrantControllerApi* | [**deleteBucketGrantForAGroup**](docs/BucketGrantControllerApi.md#deleteBucketGrantForAGroup) | **DELETE** /buckets/{bucketName}/grant/group | Delete a group grant access for a bucket
*BucketGrantControllerApi* | [**deleteBucketGrantForAUser**](docs/BucketGrantControllerApi.md#deleteBucketGrantForAUser) | **DELETE** /buckets/{bucketName}/grant/user | Delete a user grant access for a bucket
*BucketGrantControllerApi* | [**getAllGrantsForABucket**](docs/BucketGrantControllerApi.md#getAllGrantsForABucket) | **GET** /buckets/{bucketName}/grant | Get all grants associated with a bucket
*BucketGrantControllerApi* | [**getAllGrantsForABucketAndItsObjects**](docs/BucketGrantControllerApi.md#getAllGrantsForABucketAndItsObjects) | **GET** /buckets/{bucketName}/grant/all | Get all grants associated with a bucket and all objects contained in this bucket
*BucketGrantControllerApi* | [**updateBucketGrantForAGroup**](docs/BucketGrantControllerApi.md#updateBucketGrantForAGroup) | **PUT** /buckets/{bucketName}/grant/group | Update the access type of an existing group bucket grant
*BucketGrantControllerApi* | [**updateBucketGrantForAUser**](docs/BucketGrantControllerApi.md#updateBucketGrantForAUser) | **PUT** /buckets/{bucketName}/grant/user | Update the access type of an existing user bucket grant
*CatalogObjectCallGraphControllerApi* | [**getCallGraph**](docs/CatalogObjectCallGraphControllerApi.md#getCallGraph) | **GET** /buckets/call-graph | Get a ZIP file containing a call graph report for each catalog objects matching the provided filters
*CatalogObjectCallGraphControllerApi* | [**getCallGraphForSelectedObjects**](docs/CatalogObjectCallGraphControllerApi.md#getCallGraphForSelectedObjects) | **GET** /buckets/call-graph/selected/{bucketName} | Get the call graph of selected catalog objects in a bucket
*CatalogObjectControllerApi* | [**create1**](docs/CatalogObjectControllerApi.md#create1) | **POST** /buckets/{bucketName}/resources | Creates a new catalog object
*CatalogObjectControllerApi* | [**delete1**](docs/CatalogObjectControllerApi.md#delete1) | **DELETE** /buckets/{bucketName}/resources/{name} | Delete a catalog object
*CatalogObjectControllerApi* | [**exportCatalogObjects**](docs/CatalogObjectControllerApi.md#exportCatalogObjects) | **POST** /buckets/{bucketName}/resources/export | Export catalog objects as a plain zip archive or a ProActive Catalog Package
*CatalogObjectControllerApi* | [**get**](docs/CatalogObjectControllerApi.md#get) | **GET** /buckets/{bucketName}/resources/{name} | Gets a catalog object&#39;s metadata by IDs
*CatalogObjectControllerApi* | [**getDependencies**](docs/CatalogObjectControllerApi.md#getDependencies) | **GET** /buckets/{bucketName}/resources/{name}/dependencies | Gets dependencies (dependsOn and calledBy) of a catalog object
*CatalogObjectControllerApi* | [**getRaw1**](docs/CatalogObjectControllerApi.md#getRaw1) | **GET** /buckets/{bucketName}/resources/{name}/raw | Gets the raw content of the last revision of a catalog object
*CatalogObjectControllerApi* | [**importCatalogObjects**](docs/CatalogObjectControllerApi.md#importCatalogObjects) | **POST** /buckets/{bucketName}/resources/import | Import an archive, either a plain zip or a ProActive Catalog package
*CatalogObjectControllerApi* | [**list1**](docs/CatalogObjectControllerApi.md#list1) | **GET** /buckets/{bucketName}/resources | Lists catalog objects metadata
*CatalogObjectControllerApi* | [**listCatalogObjectNameReference**](docs/CatalogObjectControllerApi.md#listCatalogObjectNameReference) | **GET** /buckets/references | Lists catalog object name references by kind and Content-Type
*CatalogObjectControllerApi* | [**listContentTypes**](docs/CatalogObjectControllerApi.md#listContentTypes) | **GET** /buckets/content-types | Lists all Content-Types for all objects
*CatalogObjectControllerApi* | [**listKinds**](docs/CatalogObjectControllerApi.md#listKinds) | **GET** /buckets/kinds | Lists all kinds for all objects
*CatalogObjectControllerApi* | [**listObjectTags**](docs/CatalogObjectControllerApi.md#listObjectTags) | **GET** /buckets/tags | Lists all tags values for all objects stored in the catalog
*CatalogObjectControllerApi* | [**updateObjectMetadata**](docs/CatalogObjectControllerApi.md#updateObjectMetadata) | **PUT** /buckets/{bucketName}/resources/{name} | Update a catalog object metadata, like kind, Content-Type, project name and tags
*CatalogObjectControllerApi* | [**updateObjectMetadataMulti**](docs/CatalogObjectControllerApi.md#updateObjectMetadataMulti) | **PUT** /buckets/resources/metadata | Updates metadata, like kind, Content-Type, project name and tags for multiple objects
*CatalogObjectGrantControllerApi* | [**createCatalogObjectGrantForAGroup**](docs/CatalogObjectGrantControllerApi.md#createCatalogObjectGrantForAGroup) | **POST** /buckets/{bucketName}/resources/{catalogObjectName}/grant/group | Create a new group grant for a catalog object
*CatalogObjectGrantControllerApi* | [**createCatalogObjectGrantForAUser**](docs/CatalogObjectGrantControllerApi.md#createCatalogObjectGrantForAUser) | **POST** /buckets/{bucketName}/resources/{catalogObjectName}/grant/user | Create a new user grant for a catalog object
*CatalogObjectGrantControllerApi* | [**deleteAllCatalogObjectGrants**](docs/CatalogObjectGrantControllerApi.md#deleteAllCatalogObjectGrants) | **DELETE** /buckets/{bucketName}/resources/{catalogObjectName}/grant | Delete all grant associated with a catalog object
*CatalogObjectGrantControllerApi* | [**deleteCatalogObjectGrantForAGroup**](docs/CatalogObjectGrantControllerApi.md#deleteCatalogObjectGrantForAGroup) | **DELETE** /buckets/{bucketName}/resources/{catalogObjectName}/grant/group | Delete a user group grant access for a catalog object
*CatalogObjectGrantControllerApi* | [**deleteCatalogObjectGrantForAUser**](docs/CatalogObjectGrantControllerApi.md#deleteCatalogObjectGrantForAUser) | **DELETE** /buckets/{bucketName}/resources/{catalogObjectName}/grant/user | Delete a user grant access for a catalog object
*CatalogObjectGrantControllerApi* | [**getAllCreatedCatalogObjectGrantsByAdmins**](docs/CatalogObjectGrantControllerApi.md#getAllCreatedCatalogObjectGrantsByAdmins) | **GET** /buckets/{bucketName}/resources/{catalogObjectName}/grant | Get all grants associated with a catalog object
*CatalogObjectGrantControllerApi* | [**updateCatalogObjectGrantForAGroup**](docs/CatalogObjectGrantControllerApi.md#updateCatalogObjectGrantForAGroup) | **PUT** /buckets/{bucketName}/resources/{catalogObjectName}/grant/group | Update a user group grant access for a catalog object
*CatalogObjectGrantControllerApi* | [**updateCatalogObjectGrantForAUser**](docs/CatalogObjectGrantControllerApi.md#updateCatalogObjectGrantForAUser) | **PUT** /buckets/{bucketName}/resources/{catalogObjectName}/grant/user | Update a user grant access for a catalog object
*CatalogObjectReportControllerApi* | [**getReport**](docs/CatalogObjectReportControllerApi.md#getReport) | **GET** /buckets/report | Get a ZIP file containing the PDF reports for each catalog objects matching the provided filters
*CatalogObjectReportControllerApi* | [**getReportForSelectedObjects**](docs/CatalogObjectReportControllerApi.md#getReportForSelectedObjects) | **POST** /buckets/report/selected/{bucketName} | Get a PDF report file for the selected catalog items
*CatalogObjectRevisionControllerApi* | [**create2**](docs/CatalogObjectRevisionControllerApi.md#create2) | **POST** /buckets/{bucketName}/resources/{name}/revisions | Creates a new catalog object revision
*CatalogObjectRevisionControllerApi* | [**get1**](docs/CatalogObjectRevisionControllerApi.md#get1) | **GET** /buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw} | Gets a specific revision
*CatalogObjectRevisionControllerApi* | [**getRaw**](docs/CatalogObjectRevisionControllerApi.md#getRaw) | **GET** /buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw}/raw | Gets the raw content of a specific revision
*CatalogObjectRevisionControllerApi* | [**list2**](docs/CatalogObjectRevisionControllerApi.md#list2) | **GET** /buckets/{bucketName}/resources/{name}/revisions | Lists a catalog object revisions
*CatalogObjectRevisionControllerApi* | [**restore**](docs/CatalogObjectRevisionControllerApi.md#restore) | **PUT** /buckets/{bucketName}/resources/{name}/revisions/{commitTimeRaw} | Restore a catalog object revision
*GraphqlControllerApi* | [**executeOperation**](docs/GraphqlControllerApi.md#executeOperation) | **POST** /graphql | 


## Documentation for Models

 - [AllBucketGrants](docs/AllBucketGrants.md)
 - [BucketGrantMetadata](docs/BucketGrantMetadata.md)
 - [BucketMetadata](docs/BucketMetadata.md)
 - [CatalogObjectDependencies](docs/CatalogObjectDependencies.md)
 - [CatalogObjectGrantMetadata](docs/CatalogObjectGrantMetadata.md)
 - [CatalogObjectID](docs/CatalogObjectID.md)
 - [CatalogObjectMetadata](docs/CatalogObjectMetadata.md)
 - [CatalogObjectMetadataList](docs/CatalogObjectMetadataList.md)
 - [CatalogObjectNameReference](docs/CatalogObjectNameReference.md)
 - [DependsOnCatalogObject](docs/DependsOnCatalogObject.md)
 - [JobVariable](docs/JobVariable.md)
 - [Link](docs/Link.md)
 - [Metadata](docs/Metadata.md)
 - [ModificationHistoryData](docs/ModificationHistoryData.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



