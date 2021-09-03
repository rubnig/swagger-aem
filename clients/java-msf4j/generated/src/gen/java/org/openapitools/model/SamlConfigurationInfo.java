package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SamlConfigurationProperties;

/**
 * SamlConfigurationInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-09-03T15:25:23.467+10:00[Australia/Melbourne]")
public class SamlConfigurationInfo   {
  @JsonProperty("pid")
  private String pid;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("bundle_location")
  private String bundleLocation;

  @JsonProperty("service_location")
  private String serviceLocation;

  @JsonProperty("properties")
  private SamlConfigurationProperties properties;

  public SamlConfigurationInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Persistent Identity (PID)
   * @return pid
  **/
  @ApiModelProperty(value = "Persistent Identity (PID)")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public SamlConfigurationInfo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title
   * @return title
  **/
  @ApiModelProperty(value = "Title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SamlConfigurationInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Title
   * @return description
  **/
  @ApiModelProperty(value = "Title")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SamlConfigurationInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

   /**
   * needed for configuration binding
   * @return bundleLocation
  **/
  @ApiModelProperty(value = "needed for configuration binding")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public SamlConfigurationInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

   /**
   * needed for configuraiton binding
   * @return serviceLocation
  **/
  @ApiModelProperty(value = "needed for configuraiton binding")
  public String getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }

  public SamlConfigurationInfo properties(SamlConfigurationProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationProperties getProperties() {
    return properties;
  }

  public void setProperties(SamlConfigurationProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConfigurationInfo samlConfigurationInfo = (SamlConfigurationInfo) o;
    return Objects.equals(this.pid, samlConfigurationInfo.pid) &&
        Objects.equals(this.title, samlConfigurationInfo.title) &&
        Objects.equals(this.description, samlConfigurationInfo.description) &&
        Objects.equals(this.bundleLocation, samlConfigurationInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, samlConfigurationInfo.serviceLocation) &&
        Objects.equals(this.properties, samlConfigurationInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, bundleLocation, serviceLocation, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

