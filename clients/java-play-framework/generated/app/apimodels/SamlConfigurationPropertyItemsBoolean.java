package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * SamlConfigurationPropertyItemsBoolean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-09-03T15:25:32.040+10:00[Australia/Melbourne]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SamlConfigurationPropertyItemsBoolean   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("optional")
  
  private Boolean optional;

  @JsonProperty("is_set")
  
  private Boolean isSet;

  @JsonProperty("type")
  
  private Integer type;

  @JsonProperty("value")
  
  private Boolean value;

  @JsonProperty("description")
  
  private String description;

  public SamlConfigurationPropertyItemsBoolean name(String name) {
    this.name = name;
    return this;
  }

   /**
   * property name
   * @return name
  **/
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
   * Property type, 1=String, 3=long, 11=boolean, 12=Password
   * @return type
  **/
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
    return Objects.equals(name, samlConfigurationPropertyItemsBoolean.name) &&
        Objects.equals(optional, samlConfigurationPropertyItemsBoolean.optional) &&
        Objects.equals(isSet, samlConfigurationPropertyItemsBoolean.isSet) &&
        Objects.equals(type, samlConfigurationPropertyItemsBoolean.type) &&
        Objects.equals(value, samlConfigurationPropertyItemsBoolean.value) &&
        Objects.equals(description, samlConfigurationPropertyItemsBoolean.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, isSet, type, value, description);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

