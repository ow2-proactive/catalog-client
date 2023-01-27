/*
 * CatalogObjectEntity Catalog API
 * The purpose of the catalog is to store ProActive objects.  A catalog is subdivided into buckets.   Each bucket manages zero, one or more versioned ProActive objects.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.ow2.proactive.catalog.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.ow2.proactive.catalog.client.model.Link;

/**
 * CatalogObjectID
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-26T17:28:06.013+01:00")
public class CatalogObjectID {
  @JsonProperty("bucketId")
  private Long bucketId = null;

  @JsonProperty("catalogObjectName")
  private String catalogObjectName = null;

  @JsonProperty("links")
  private List<Link> links = null;

  public CatalogObjectID bucketId(Long bucketId) {
    this.bucketId = bucketId;
    return this;
  }

   /**
   * Get bucketId
   * @return bucketId
  **/
  @ApiModelProperty(value = "")
  public Long getBucketId() {
    return bucketId;
  }

  public void setBucketId(Long bucketId) {
    this.bucketId = bucketId;
  }

  public CatalogObjectID catalogObjectName(String catalogObjectName) {
    this.catalogObjectName = catalogObjectName;
    return this;
  }

   /**
   * Get catalogObjectName
   * @return catalogObjectName
  **/
  @ApiModelProperty(value = "")
  public String getCatalogObjectName() {
    return catalogObjectName;
  }

  public void setCatalogObjectName(String catalogObjectName) {
    this.catalogObjectName = catalogObjectName;
  }

  public CatalogObjectID links(List<Link> links) {
    this.links = links;
    return this;
  }

  public CatalogObjectID addLinksItem(Link linksItem) {
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
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogObjectID catalogObjectID = (CatalogObjectID) o;
    return Objects.equals(this.bucketId, catalogObjectID.bucketId) &&
        Objects.equals(this.catalogObjectName, catalogObjectID.catalogObjectName) &&
        Objects.equals(this.links, catalogObjectID.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketId, catalogObjectName, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogObjectID {\n");
    
    sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
    sb.append("    catalogObjectName: ").append(toIndentedString(catalogObjectName)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

