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
 * BucketMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-15T14:22:22.307+01:00")
public class BucketMetadata {
  @JsonProperty("links")
  private List<Link> links = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("objectCount")
  private Integer objectCount = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("rights")
  private String rights = null;

  public BucketMetadata links(List<Link> links) {
    this.links = links;
    return this;
  }

  public BucketMetadata addLinksItem(Link linksItem) {
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

  public BucketMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BucketMetadata objectCount(Integer objectCount) {
    this.objectCount = objectCount;
    return this;
  }

   /**
   * Get objectCount
   * @return objectCount
  **/
  @ApiModelProperty(value = "")
  public Integer getObjectCount() {
    return objectCount;
  }

  public void setObjectCount(Integer objectCount) {
    this.objectCount = objectCount;
  }

  public BucketMetadata owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public BucketMetadata rights(String rights) {
    this.rights = rights;
    return this;
  }

   /**
   * Get rights
   * @return rights
  **/
  @ApiModelProperty(value = "")
  public String getRights() {
    return rights;
  }

  public void setRights(String rights) {
    this.rights = rights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BucketMetadata bucketMetadata = (BucketMetadata) o;
    return Objects.equals(this.links, bucketMetadata.links) &&
        Objects.equals(this.name, bucketMetadata.name) &&
        Objects.equals(this.objectCount, bucketMetadata.objectCount) &&
        Objects.equals(this.owner, bucketMetadata.owner) &&
        Objects.equals(this.rights, bucketMetadata.rights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, name, objectCount, owner, rights);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BucketMetadata {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectCount: ").append(toIndentedString(objectCount)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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

