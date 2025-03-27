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
 * ModificationHistoryData
 */
@JsonPropertyOrder({
  ModificationHistoryData.JSON_PROPERTY_MODIFICATION_DATE,
  ModificationHistoryData.JSON_PROPERTY_USERNAME,
  ModificationHistoryData.JSON_PROPERTY_OLD_VALUES,
  ModificationHistoryData.JSON_PROPERTY_NEW_VALUES,
  ModificationHistoryData.JSON_PROPERTY_CHANGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-27T12:13:03.112691600+01:00[Europe/Berlin]")
public class ModificationHistoryData {
  public static final String JSON_PROPERTY_MODIFICATION_DATE = "modificationDate";
  private Long modificationDate;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_OLD_VALUES = "oldValues";
  private String oldValues;

  public static final String JSON_PROPERTY_NEW_VALUES = "newValues";
  private String newValues;

  public static final String JSON_PROPERTY_CHANGES = "changes";
  private String changes;

  public ModificationHistoryData() { 
  }

  public ModificationHistoryData modificationDate(Long modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Get modificationDate
   * @return modificationDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getModificationDate() {
    return modificationDate;
  }


  @JsonProperty(JSON_PROPERTY_MODIFICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModificationDate(Long modificationDate) {
    this.modificationDate = modificationDate;
  }


  public ModificationHistoryData username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public ModificationHistoryData oldValues(String oldValues) {
    this.oldValues = oldValues;
    return this;
  }

   /**
   * Get oldValues
   * @return oldValues
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OLD_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOldValues() {
    return oldValues;
  }


  @JsonProperty(JSON_PROPERTY_OLD_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldValues(String oldValues) {
    this.oldValues = oldValues;
  }


  public ModificationHistoryData newValues(String newValues) {
    this.newValues = newValues;
    return this;
  }

   /**
   * Get newValues
   * @return newValues
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewValues() {
    return newValues;
  }


  @JsonProperty(JSON_PROPERTY_NEW_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewValues(String newValues) {
    this.newValues = newValues;
  }


  public ModificationHistoryData changes(String changes) {
    this.changes = changes;
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChanges() {
    return changes;
  }


  @JsonProperty(JSON_PROPERTY_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChanges(String changes) {
    this.changes = changes;
  }


  /**
   * Return true if this ModificationHistoryData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModificationHistoryData modificationHistoryData = (ModificationHistoryData) o;
    return Objects.equals(this.modificationDate, modificationHistoryData.modificationDate) &&
        Objects.equals(this.username, modificationHistoryData.username) &&
        Objects.equals(this.oldValues, modificationHistoryData.oldValues) &&
        Objects.equals(this.newValues, modificationHistoryData.newValues) &&
        Objects.equals(this.changes, modificationHistoryData.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modificationDate, username, oldValues, newValues, changes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationHistoryData {\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    oldValues: ").append(toIndentedString(oldValues)).append("\n");
    sb.append("    newValues: ").append(toIndentedString(newValues)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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

