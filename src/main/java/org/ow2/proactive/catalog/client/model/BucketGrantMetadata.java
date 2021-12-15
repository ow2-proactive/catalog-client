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
 * BucketGrantMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-15T14:22:22.307+01:00")
public class BucketGrantMetadata {
  @JsonProperty("accessType")
  private String accessType = null;

  @JsonProperty("bucketId")
  private Long bucketId = null;

  @JsonProperty("bucketName")
  private String bucketName = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("grantee")
  private String grantee = null;

  @JsonProperty("granteeType")
  private String granteeType = null;

  @JsonProperty("links")
  private List<Link> links = null;

  public BucketGrantMetadata accessType(String accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @ApiModelProperty(value = "")
  public String getAccessType() {
    return accessType;
  }

  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }

  public BucketGrantMetadata bucketId(Long bucketId) {
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

  public BucketGrantMetadata bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * Get bucketName
   * @return bucketName
  **/
  @ApiModelProperty(value = "")
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public BucketGrantMetadata creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(value = "")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public BucketGrantMetadata grantee(String grantee) {
    this.grantee = grantee;
    return this;
  }

   /**
   * Get grantee
   * @return grantee
  **/
  @ApiModelProperty(value = "")
  public String getGrantee() {
    return grantee;
  }

  public void setGrantee(String grantee) {
    this.grantee = grantee;
  }

  public BucketGrantMetadata granteeType(String granteeType) {
    this.granteeType = granteeType;
    return this;
  }

   /**
   * Get granteeType
   * @return granteeType
  **/
  @ApiModelProperty(value = "")
  public String getGranteeType() {
    return granteeType;
  }

  public void setGranteeType(String granteeType) {
    this.granteeType = granteeType;
  }

  public BucketGrantMetadata links(List<Link> links) {
    this.links = links;
    return this;
  }

  public BucketGrantMetadata addLinksItem(Link linksItem) {
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
    BucketGrantMetadata bucketGrantMetadata = (BucketGrantMetadata) o;
    return Objects.equals(this.accessType, bucketGrantMetadata.accessType) &&
        Objects.equals(this.bucketId, bucketGrantMetadata.bucketId) &&
        Objects.equals(this.bucketName, bucketGrantMetadata.bucketName) &&
        Objects.equals(this.creator, bucketGrantMetadata.creator) &&
        Objects.equals(this.grantee, bucketGrantMetadata.grantee) &&
        Objects.equals(this.granteeType, bucketGrantMetadata.granteeType) &&
        Objects.equals(this.links, bucketGrantMetadata.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, bucketId, bucketName, creator, grantee, granteeType, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BucketGrantMetadata {\n");
    
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    grantee: ").append(toIndentedString(grantee)).append("\n");
    sb.append("    granteeType: ").append(toIndentedString(granteeType)).append("\n");
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

