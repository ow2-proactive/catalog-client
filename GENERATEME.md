To generate the catalog client, download the last swagger-codegen release: https://github.com/swagger-api/swagger-codegen/releases

The client was generated using the following command:

java -jar ./swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i http://trydev.activeeon.com:8080/catalog/v2/api-docs?group=CatalogObjectEntity%20Catalog -l java -Dlibrary=jersey1 -DdateLibrary=java8 -DuseRuntimeException=true -o catalog-client/ --api-package org.ow2.proactive.catalog.client.api --model-package org.ow2.proactive.catalog.client.model

-i the url that will provide the swagger model
-l the language of the generated client
-Dlibrary the library that will be used for http request
-DdateLibrary the library that will be used for time
-DuseRuntimeException indicated if the exception will extends Exception or RuntimeException
-o indicates where the client will generated
--api-package indicates the package of the generated api
--model-package indicates the package of the generated model

In order to get more help about the java language the following command can be used:
java -jar ./swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar config-help -l java

The class src/main/java/org/ow2/proactive/catalog/client/api/CatalogResolveObjectControllerApi.java was not generated and the class ApiClient.java was modified manually. As a consequence both files are in .swagger-codegen-ignore. They must be modified with extreme caution. In order to regenerate them they must be removed from .swagger-coden-ignore file.