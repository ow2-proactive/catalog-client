# catalog-client

Catalog-client is a library that is used as a client by micro-services to query Catalog.
That library will implement a logic that will replace each occurrence of PA:GET_FROM_URL in a catalog-object by the content returned by an http GET request on the given url.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.ow2.proactive</groupId>
    <artifactId>catalog-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.ow2.proactive:catalog-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/catalog-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BucketControllerApi;

import java.io.File;
import java.util.*;

public class BucketControllerApiExample {

    public static void main(String[] args) {

        BucketControllerApi apiInstance = new BucketControllerApi();
        try {
            apiInstance.cleanEmptyUsingDELETE();
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketControllerApi#cleanEmptyUsingDELETE");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://trydev.activeeon.com:8080/catalog*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BucketControllerApi* | [**cleanEmptyUsingDELETE**](docs/BucketControllerApi.md#cleanEmptyUsingDELETE) | **DELETE** /buckets | Delete the empty buckets
*BucketControllerApi* | [**createUsingPOST**](docs/BucketControllerApi.md#createUsingPOST) | **POST** /buckets | Creates a new bucket
*BucketControllerApi* | [**deleteUsingDELETE**](docs/BucketControllerApi.md#deleteUsingDELETE) | **DELETE** /buckets/{bucketId} | Delete an empty bucket
*BucketControllerApi* | [**getMetadataUsingGET**](docs/BucketControllerApi.md#getMetadataUsingGET) | **GET** /buckets/{bucketId} | Gets a bucket&#39;s metadata by ID
*BucketControllerApi* | [**listUsingGET**](docs/BucketControllerApi.md#listUsingGET) | **GET** /buckets | Lists the buckets
*CatalogObjectControllerApi* | [**createUsingPOST1**](docs/CatalogObjectControllerApi.md#createUsingPOST1) | **POST** /buckets/{bucketId}/resources | Creates a new catalog object
*CatalogObjectControllerApi* | [**deleteUsingDELETE1**](docs/CatalogObjectControllerApi.md#deleteUsingDELETE1) | **DELETE** /buckets/{bucketId}/resources/{name} | Delete a catalog object
*CatalogObjectControllerApi* | [**getRawUsingGET**](docs/CatalogObjectControllerApi.md#getRawUsingGET) | **GET** /buckets/{bucketId}/resources/{name}/raw | Gets the raw content of a last revision of a catalog object
*CatalogObjectControllerApi* | [**getUsingGET**](docs/CatalogObjectControllerApi.md#getUsingGET) | **GET** /buckets/{bucketId}/resources/{name} | Gets a catalog object&#39;s metadata by IDs
*CatalogObjectControllerApi* | [**listUsingGET1**](docs/CatalogObjectControllerApi.md#listUsingGET1) | **GET** /buckets/{bucketId}/resources | Lists catalog objects metadata
*CatalogObjectControllerApi* | [**restoreUsingPUT**](docs/CatalogObjectControllerApi.md#restoreUsingPUT) | **PUT** /buckets/{bucketId}/resources/{name} | Restore a catalog object revision
*CatalogObjectRevisionControllerApi* | [**createUsingPOST2**](docs/CatalogObjectRevisionControllerApi.md#createUsingPOST2) | **POST** /buckets/{bucketId}/resources/{name}/revisions | Creates a new catalog object revision
*CatalogObjectRevisionControllerApi* | [**getRawUsingGET1**](docs/CatalogObjectRevisionControllerApi.md#getRawUsingGET1) | **GET** /buckets/{bucketId}/resources/{name}/revisions/{commitTime}/raw | Gets the raw content of a specific revision
*CatalogObjectRevisionControllerApi* | [**getUsingGET1**](docs/CatalogObjectRevisionControllerApi.md#getUsingGET1) | **GET** /buckets/{bucketId}/resources/{name}/revisions/{commitTime} | Gets a specific revision
*CatalogObjectRevisionControllerApi* | [**listUsingGET2**](docs/CatalogObjectRevisionControllerApi.md#listUsingGET2) | **GET** /buckets/{bucketId}/resources/{name}/revisions | Lists a catalog object revisions


## Documentation for Models

 - [BucketMetadata](docs/BucketMetadata.md)
 - [CatalogObjectMetadata](docs/CatalogObjectMetadata.md)
 - [CatalogObjectMetadataList](docs/CatalogObjectMetadataList.md)
 - [InputStream](docs/InputStream.md)
 - [InputStreamResource](docs/InputStreamResource.md)
 - [Link](docs/Link.md)
 - [Metadata](docs/Metadata.md)
 - [URI](docs/URI.md)
 - [URL](docs/URL.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author
