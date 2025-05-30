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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.ow2.proactive.catalog.client.model.CatalogObjectID;
import org.ow2.proactive.catalog.client.model.Link;
import org.ow2.proactive.catalog.client.model.ModificationHistoryData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.ow2.proactive.catalog.client.JSON;


/**
 * CatalogObjectGrantMetadata
 */
@JsonPropertyOrder({
  CatalogObjectGrantMetadata.JSON_PROPERTY_GRANTEE_TYPE,
  CatalogObjectGrantMetadata.JSON_PROPERTY_GRANTEE,
  CatalogObjectGrantMetadata.JSON_PROPERTY_ACCESS_TYPE,
  CatalogObjectGrantMetadata.JSON_PROPERTY_PRIORITY,
  CatalogObjectGrantMetadata.JSON_PROPERTY_BUCKET_NAME,
  CatalogObjectGrantMetadata.JSON_PROPERTY_CREATOR,
  CatalogObjectGrantMetadata.JSON_PROPERTY_CREATION_DATE,
  CatalogObjectGrantMetadata.JSON_PROPERTY_MODIFICATION_HISTORY,
  CatalogObjectGrantMetadata.JSON_PROPERTY_CATALOG_OBJECT_ID,
  CatalogObjectGrantMetadata.JSON_PROPERTY_CATALOG_OBJECT_NAME,
  CatalogObjectGrantMetadata.JSON_PROPERTY_CATALOG_OBJECT_BUCKET_ID,
  CatalogObjectGrantMetadata.JSON_PROPERTY_LINKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-27T12:13:03.112691600+01:00[Europe/Berlin]")
public class CatalogObjectGrantMetadata {
  public static final String JSON_PROPERTY_GRANTEE_TYPE = "granteeType";
  private String granteeType;

  public static final String JSON_PROPERTY_GRANTEE = "grantee";
  private String grantee;

  public static final String JSON_PROPERTY_ACCESS_TYPE = "accessType";
  private String accessType;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_BUCKET_NAME = "bucketName";
  private String bucketName;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private String creator;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private Long creationDate;

  public static final String JSON_PROPERTY_MODIFICATION_HISTORY = "modificationHistory";
  private List<ModificationHistoryData> modificationHistory;

  public static final String JSON_PROPERTY_CATALOG_OBJECT_ID = "catalogObjectId";
  private CatalogObjectID catalogObjectId;

  public static final String JSON_PROPERTY_CATALOG_OBJECT_NAME = "catalogObjectName";
  private String catalogObjectName;

  public static final String JSON_PROPERTY_CATALOG_OBJECT_BUCKET_ID = "catalogObjectBucketId";
  private Long catalogObjectBucketId;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<Link> links;

  public CatalogObjectGrantMetadata() { 
  }

  public CatalogObjectGrantMetadata granteeType(String granteeType) {
    this.granteeType = granteeType;
    return this;
  }

   /**
   * Get granteeType
   * @return granteeType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRANTEE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGranteeType() {
    return granteeType;
  }


  @JsonProperty(JSON_PROPERTY_GRANTEE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGranteeType(String granteeType) {
    this.granteeType = granteeType;
  }


  public CatalogObjectGrantMetadata grantee(String grantee) {
    this.grantee = grantee;
    return this;
  }

   /**
   * Get grantee
   * @return grantee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRANTEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGrantee() {
    return grantee;
  }


  @JsonProperty(JSON_PROPERTY_GRANTEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrantee(String grantee) {
    this.grantee = grantee;
  }


  public CatalogObjectGrantMetadata accessType(String accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessType() {
    return accessType;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }


  public CatalogObjectGrantMetadata priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public CatalogObjectGrantMetadata bucketName(String bucketName) {
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


  public CatalogObjectGrantMetadata creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreator() {
    return creator;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreator(String creator) {
    this.creator = creator;
  }


  public CatalogObjectGrantMetadata creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreationDate() {
    return creationDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }


  public CatalogObjectGrantMetadata modificationHistory(List<ModificationHistoryData> modificationHistory) {
    this.modificationHistory = modificationHistory;
    return this;
  }

  public CatalogObjectGrantMetadata addModificationHistoryItem(ModificationHistoryData modificationHistoryItem) {
    if (this.modificationHistory == null) {
      this.modificationHistory = new ArrayList<>();
    }
    this.modificationHistory.add(modificationHistoryItem);
    return this;
  }

   /**
   * Get modificationHistory
   * @return modificationHistory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFICATION_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ModificationHistoryData> getModificationHistory() {
    return modificationHistory;
  }


  @JsonProperty(JSON_PROPERTY_MODIFICATION_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModificationHistory(List<ModificationHistoryData> modificationHistory) {
    this.modificationHistory = modificationHistory;
  }


  public CatalogObjectGrantMetadata catalogObjectId(CatalogObjectID catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * Get catalogObjectId
   * @return catalogObjectId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATALOG_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CatalogObjectID getCatalogObjectId() {
    return catalogObjectId;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogObjectId(CatalogObjectID catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }


  public CatalogObjectGrantMetadata catalogObjectName(String catalogObjectName) {
    this.catalogObjectName = catalogObjectName;
    return this;
  }

   /**
   * Get catalogObjectName
   * @return catalogObjectName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATALOG_OBJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCatalogObjectName() {
    return catalogObjectName;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_OBJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogObjectName(String catalogObjectName) {
    this.catalogObjectName = catalogObjectName;
  }


  public CatalogObjectGrantMetadata catalogObjectBucketId(Long catalogObjectBucketId) {
    this.catalogObjectBucketId = catalogObjectBucketId;
    return this;
  }

   /**
   * Get catalogObjectBucketId
   * @return catalogObjectBucketId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATALOG_OBJECT_BUCKET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCatalogObjectBucketId() {
    return catalogObjectBucketId;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_OBJECT_BUCKET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogObjectBucketId(Long catalogObjectBucketId) {
    this.catalogObjectBucketId = catalogObjectBucketId;
  }


  public CatalogObjectGrantMetadata links(List<Link> links) {
    this.links = links;
    return this;
  }

  public CatalogObjectGrantMetadata addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Link> getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(List<Link> links) {
    this.links = links;
  }


  /**
   * Return true if this CatalogObjectGrantMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogObjectGrantMetadata catalogObjectGrantMetadata = (CatalogObjectGrantMetadata) o;
    return Objects.equals(this.granteeType, catalogObjectGrantMetadata.granteeType) &&
        Objects.equals(this.grantee, catalogObjectGrantMetadata.grantee) &&
        Objects.equals(this.accessType, catalogObjectGrantMetadata.accessType) &&
        Objects.equals(this.priority, catalogObjectGrantMetadata.priority) &&
        Objects.equals(this.bucketName, catalogObjectGrantMetadata.bucketName) &&
        Objects.equals(this.creator, catalogObjectGrantMetadata.creator) &&
        Objects.equals(this.creationDate, catalogObjectGrantMetadata.creationDate) &&
        Objects.equals(this.modificationHistory, catalogObjectGrantMetadata.modificationHistory) &&
        Objects.equals(this.catalogObjectId, catalogObjectGrantMetadata.catalogObjectId) &&
        Objects.equals(this.catalogObjectName, catalogObjectGrantMetadata.catalogObjectName) &&
        Objects.equals(this.catalogObjectBucketId, catalogObjectGrantMetadata.catalogObjectBucketId) &&
        Objects.equals(this.links, catalogObjectGrantMetadata.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granteeType, grantee, accessType, priority, bucketName, creator, creationDate, modificationHistory, catalogObjectId, catalogObjectName, catalogObjectBucketId, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogObjectGrantMetadata {\n");
    sb.append("    granteeType: ").append(toIndentedString(granteeType)).append("\n");
    sb.append("    grantee: ").append(toIndentedString(grantee)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationHistory: ").append(toIndentedString(modificationHistory)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    catalogObjectName: ").append(toIndentedString(catalogObjectName)).append("\n");
    sb.append("    catalogObjectBucketId: ").append(toIndentedString(catalogObjectBucketId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

