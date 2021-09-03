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

import java.util.*;
import org.openapitools.client.model.BundleData;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BundleInfo {
  
  @SerializedName("status")
  private String status = null;
  @SerializedName("s")
  private List<Integer> s = null;
  @SerializedName("data")
  private List<BundleData> data = null;

  /**
   * Status description of all bundles
   **/
  @ApiModelProperty(value = "Status description of all bundles")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getS() {
    return s;
  }
  public void setS(List<Integer> s) {
    this.s = s;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<BundleData> getData() {
    return data;
  }
  public void setData(List<BundleData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleInfo bundleInfo = (BundleInfo) o;
    return (this.status == null ? bundleInfo.status == null : this.status.equals(bundleInfo.status)) &&
        (this.s == null ? bundleInfo.s == null : this.s.equals(bundleInfo.s)) &&
        (this.data == null ? bundleInfo.data == null : this.data.equals(bundleInfo.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.s == null ? 0: this.s.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleInfo {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  s: ").append(s).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
