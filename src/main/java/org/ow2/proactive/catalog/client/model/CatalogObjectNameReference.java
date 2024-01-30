/*
 * CatalogObjectEntity Catalog API
 * The purpose of the catalog is to store ProActive objects.  A catalog is subdivided into buckets.   Each bucket manages zero, one or more versioned ProActive objects.
 *
 * The version of the OpenAPI document: 1.0\"
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.ow2.proactive.catalog.client.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.ow2.proactive.catalog.client.JSON;


/**
 * CatalogObjectNameReference
 */
@JsonPropertyOrder({
  CatalogObjectNameReference.JSON_PROPERTY_BUCKET_NAME,
  CatalogObjectNameReference.JSON_PROPERTY_PROJECT_NAME,
  CatalogObjectNameReference.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-26T11:53:55.670648-05:00[America/New_York]")
public class CatalogObjectNameReference {
  public static final String JSON_PROPERTY_BUCKET_NAME = "bucket_name";
  private String bucketName;

  public static final String JSON_PROPERTY_PROJECT_NAME = "project_name";
  private String projectName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public CatalogObjectNameReference() { 
  }

  public CatalogObjectNameReference bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * Get bucketName
   * @return bucketName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBucketName() {
    return bucketName;
  }


  @JsonProperty(JSON_PROPERTY_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }


  public CatalogObjectNameReference projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProjectName() {
    return projectName;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public CatalogObjectNameReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this CatalogObjectNameReference object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogObjectNameReference catalogObjectNameReference = (CatalogObjectNameReference) o;
    return Objects.equals(this.bucketName, catalogObjectNameReference.bucketName) &&
        Objects.equals(this.projectName, catalogObjectNameReference.projectName) &&
        Objects.equals(this.name, catalogObjectNameReference.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, projectName, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogObjectNameReference {\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

