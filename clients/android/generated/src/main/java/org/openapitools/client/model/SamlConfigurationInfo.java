/**
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

package org.openapitools.client.model;

import org.openapitools.client.model.SamlConfigurationProperties;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SamlConfigurationInfo {
  
  @SerializedName("pid")
  private String pid = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("bundle_location")
  private String bundleLocation = null;
  @SerializedName("service_location")
  private String serviceLocation = null;
  @SerializedName("properties")
  private SamlConfigurationProperties properties = null;

  /**
   * Persistent Identity (PID)
   **/
  @ApiModelProperty(value = "Persistent Identity (PID)")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   * Title
   **/
  @ApiModelProperty(value = "Title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Title
   **/
  @ApiModelProperty(value = "Title")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * needed for configuration binding
   **/
  @ApiModelProperty(value = "needed for configuration binding")
  public String getBundleLocation() {
    return bundleLocation;
  }
  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  /**
   * needed for configuraiton binding
   **/
  @ApiModelProperty(value = "needed for configuraiton binding")
  public String getServiceLocation() {
    return serviceLocation;
  }
  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }

  /**
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
    return (this.pid == null ? samlConfigurationInfo.pid == null : this.pid.equals(samlConfigurationInfo.pid)) &&
        (this.title == null ? samlConfigurationInfo.title == null : this.title.equals(samlConfigurationInfo.title)) &&
        (this.description == null ? samlConfigurationInfo.description == null : this.description.equals(samlConfigurationInfo.description)) &&
        (this.bundleLocation == null ? samlConfigurationInfo.bundleLocation == null : this.bundleLocation.equals(samlConfigurationInfo.bundleLocation)) &&
        (this.serviceLocation == null ? samlConfigurationInfo.serviceLocation == null : this.serviceLocation.equals(samlConfigurationInfo.serviceLocation)) &&
        (this.properties == null ? samlConfigurationInfo.properties == null : this.properties.equals(samlConfigurationInfo.properties));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pid == null ? 0: this.pid.hashCode());
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.bundleLocation == null ? 0: this.bundleLocation.hashCode());
    result = 31 * result + (this.serviceLocation == null ? 0: this.serviceLocation.hashCode());
    result = 31 * result + (this.properties == null ? 0: this.properties.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationInfo {\n");
    
    sb.append("  pid: ").append(pid).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  bundleLocation: ").append(bundleLocation).append("\n");
    sb.append("  serviceLocation: ").append(serviceLocation).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
