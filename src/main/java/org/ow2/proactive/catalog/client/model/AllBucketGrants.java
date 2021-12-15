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
import org.ow2.proactive.catalog.client.model.BucketGrantMetadata;
import org.ow2.proactive.catalog.client.model.CatalogObjectGrantMetadata;

/**
 * AllBucketGrants
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-15T14:22:22.307+01:00")
public class AllBucketGrants {
  @JsonProperty("bucketGrants")
  private List<BucketGrantMetadata> bucketGrants = null;

  @JsonProperty("objectGrants")
  private List<CatalogObjectGrantMetadata> objectGrants = null;

  public AllBucketGrants bucketGrants(List<BucketGrantMetadata> bucketGrants) {
    this.bucketGrants = bucketGrants;
    return this;
  }

  public AllBucketGrants addBucketGrantsItem(BucketGrantMetadata bucketGrantsItem) {
    if (this.bucketGrants == null) {
      this.bucketGrants = new ArrayList<>();
    }
    this.bucketGrants.add(bucketGrantsItem);
    return this;
  }

   /**
   * Get bucketGrants
   * @return bucketGrants
  **/
  @ApiModelProperty(value = "")
  public List<BucketGrantMetadata> getBucketGrants() {
    return bucketGrants;
  }

  public void setBucketGrants(List<BucketGrantMetadata> bucketGrants) {
    this.bucketGrants = bucketGrants;
  }

  public AllBucketGrants objectGrants(List<CatalogObjectGrantMetadata> objectGrants) {
    this.objectGrants = objectGrants;
    return this;
  }

  public AllBucketGrants addObjectGrantsItem(CatalogObjectGrantMetadata objectGrantsItem) {
    if (this.objectGrants == null) {
      this.objectGrants = new ArrayList<>();
    }
    this.objectGrants.add(objectGrantsItem);
    return this;
  }

   /**
   * Get objectGrants
   * @return objectGrants
  **/
  @ApiModelProperty(value = "")
  public List<CatalogObjectGrantMetadata> getObjectGrants() {
    return objectGrants;
  }

  public void setObjectGrants(List<CatalogObjectGrantMetadata> objectGrants) {
    this.objectGrants = objectGrants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllBucketGrants allBucketGrants = (AllBucketGrants) o;
    return Objects.equals(this.bucketGrants, allBucketGrants.bucketGrants) &&
        Objects.equals(this.objectGrants, allBucketGrants.objectGrants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketGrants, objectGrants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllBucketGrants {\n");
    
    sb.append("    bucketGrants: ").append(toIndentedString(bucketGrants)).append("\n");
    sb.append("    objectGrants: ").append(toIndentedString(objectGrants)).append("\n");
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

