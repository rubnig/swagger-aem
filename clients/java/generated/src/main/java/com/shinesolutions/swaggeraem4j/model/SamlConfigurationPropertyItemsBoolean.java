/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraem4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SamlConfigurationPropertyItemsBoolean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T15:25:08.476+10:00[Australia/Melbourne]")
public class SamlConfigurationPropertyItemsBoolean {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_IS_SET = "is_set";
  @SerializedName(SERIALIZED_NAME_IS_SET)
  private Boolean isSet;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Boolean value;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public SamlConfigurationPropertyItemsBoolean name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * property name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "property name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SamlConfigurationPropertyItemsBoolean optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * True if optional
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if optional")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public SamlConfigurationPropertyItemsBoolean isSet(Boolean isSet) {
    
    this.isSet = isSet;
    return this;
  }

   /**
   * True if property is set
   * @return isSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if property is set")

  public Boolean getIsSet() {
    return isSet;
  }


  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }


  public SamlConfigurationPropertyItemsBoolean type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Property type, 1=String, 3=long, 11=boolean, 12=Password")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public SamlConfigurationPropertyItemsBoolean value(Boolean value) {
    
    this.value = value;
    return this;
  }

   /**
   * Property value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Property value")

  public Boolean getValue() {
    return value;
  }


  public void setValue(Boolean value) {
    this.value = value;
  }


  public SamlConfigurationPropertyItemsBoolean description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Property description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Property description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConfigurationPropertyItemsBoolean samlConfigurationPropertyItemsBoolean = (SamlConfigurationPropertyItemsBoolean) o;
    return Objects.equals(this.name, samlConfigurationPropertyItemsBoolean.name) &&
        Objects.equals(this.optional, samlConfigurationPropertyItemsBoolean.optional) &&
        Objects.equals(this.isSet, samlConfigurationPropertyItemsBoolean.isSet) &&
        Objects.equals(this.type, samlConfigurationPropertyItemsBoolean.type) &&
        Objects.equals(this.value, samlConfigurationPropertyItemsBoolean.value) &&
        Objects.equals(this.description, samlConfigurationPropertyItemsBoolean.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, isSet, type, value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationPropertyItemsBoolean {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

