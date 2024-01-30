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
 * DependsOnCatalogObject
 */
@JsonPropertyOrder({
  DependsOnCatalogObject.JSON_PROPERTY_BUCKET_AND_OBJECT_NAME,
  DependsOnCatalogObject.JSON_PROPERTY_KIND,
  DependsOnCatalogObject.JSON_PROPERTY_REVISION_COMMIT_TIME,
  DependsOnCatalogObject.JSON_PROPERTY_IS_IN_CATALOG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-26T11:53:55.670648-05:00[America/New_York]")
public class DependsOnCatalogObject {
  public static final String JSON_PROPERTY_BUCKET_AND_OBJECT_NAME = "bucket_and_object_name";
  private String bucketAndObjectName;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_REVISION_COMMIT_TIME = "revision_commit_time";
  private String revisionCommitTime;

  public static final String JSON_PROPERTY_IS_IN_CATALOG = "is_in_catalog";
  private Boolean isInCatalog;

  public DependsOnCatalogObject() { 
  }

  public DependsOnCatalogObject bucketAndObjectName(String bucketAndObjectName) {
    this.bucketAndObjectName = bucketAndObjectName;
    return this;
  }

   /**
   * Get bucketAndObjectName
   * @return bucketAndObjectName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUCKET_AND_OBJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBucketAndObjectName() {
    return bucketAndObjectName;
  }


  @JsonProperty(JSON_PROPERTY_BUCKET_AND_OBJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBucketAndObjectName(String bucketAndObjectName) {
    this.bucketAndObjectName = bucketAndObjectName;
  }


  public DependsOnCatalogObject kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKind(String kind) {
    this.kind = kind;
  }


  public DependsOnCatalogObject revisionCommitTime(String revisionCommitTime) {
    this.revisionCommitTime = revisionCommitTime;
    return this;
  }

   /**
   * Get revisionCommitTime
   * @return revisionCommitTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVISION_COMMIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRevisionCommitTime() {
    return revisionCommitTime;
  }


  @JsonProperty(JSON_PROPERTY_REVISION_COMMIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevisionCommitTime(String revisionCommitTime) {
    this.revisionCommitTime = revisionCommitTime;
  }


  public DependsOnCatalogObject isInCatalog(Boolean isInCatalog) {
    this.isInCatalog = isInCatalog;
    return this;
  }

   /**
   * Get isInCatalog
   * @return isInCatalog
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_IN_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsInCatalog() {
    return isInCatalog;
  }


  @JsonProperty(JSON_PROPERTY_IS_IN_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsInCatalog(Boolean isInCatalog) {
    this.isInCatalog = isInCatalog;
  }


  /**
   * Return true if this DependsOnCatalogObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependsOnCatalogObject dependsOnCatalogObject = (DependsOnCatalogObject) o;
    return Objects.equals(this.bucketAndObjectName, dependsOnCatalogObject.bucketAndObjectName) &&
        Objects.equals(this.kind, dependsOnCatalogObject.kind) &&
        Objects.equals(this.revisionCommitTime, dependsOnCatalogObject.revisionCommitTime) &&
        Objects.equals(this.isInCatalog, dependsOnCatalogObject.isInCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketAndObjectName, kind, revisionCommitTime, isInCatalog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependsOnCatalogObject {\n");
    sb.append("    bucketAndObjectName: ").append(toIndentedString(bucketAndObjectName)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    revisionCommitTime: ").append(toIndentedString(revisionCommitTime)).append("\n");
    sb.append("    isInCatalog: ").append(toIndentedString(isInCatalog)).append("\n");
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

