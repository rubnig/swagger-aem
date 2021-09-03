package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TruststoreItems  {
  
  @ApiModelProperty(value = "Truststore alias name")
 /**
   * Truststore alias name
  **/
  private String alias;

  @ApiModelProperty(value = "")
  private String entryType;

  @ApiModelProperty(value = "e.g. \"CN=localhost\"")
 /**
   * e.g. \"CN=localhost\"
  **/
  private String subject;

  @ApiModelProperty(value = "e.g. \"CN=Admin\"")
 /**
   * e.g. \"CN=Admin\"
  **/
  private String issuer;

  @ApiModelProperty(value = "e.g. \"Sun Jul 01 12:00:00 AEST 2018\"")
 /**
   * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
  **/
  private String notBefore;

  @ApiModelProperty(value = "e.g. \"Sun Jun 30 23:59:50 AEST 2019\"")
 /**
   * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
  **/
  private String notAfter;

  @ApiModelProperty(value = "18165099476682912368")
 /**
   * 18165099476682912368
  **/
  private Integer serialNumber;
 /**
   * Truststore alias name
   * @return alias
  **/
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public TruststoreItems alias(String alias) {
    this.alias = alias;
    return this;
  }

 /**
   * Get entryType
   * @return entryType
  **/
  @JsonProperty("entryType")
  public String getEntryType() {
    return entryType;
  }

  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }

  public TruststoreItems entryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

 /**
   * e.g. \&quot;CN&#x3D;localhost\&quot;
   * @return subject
  **/
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public TruststoreItems subject(String subject) {
    this.subject = subject;
    return this;
  }

 /**
   * e.g. \&quot;CN&#x3D;Admin\&quot;
   * @return issuer
  **/
  @JsonProperty("issuer")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public TruststoreItems issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

 /**
   * e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
   * @return notBefore
  **/
  @JsonProperty("notBefore")
  public String getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }

  public TruststoreItems notBefore(String notBefore) {
    this.notBefore = notBefore;
    return this;
  }

 /**
   * e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
   * @return notAfter
  **/
  @JsonProperty("notAfter")
  public String getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }

  public TruststoreItems notAfter(String notAfter) {
    this.notAfter = notAfter;
    return this;
  }

 /**
   * 18165099476682912368
   * @return serialNumber
  **/
  @JsonProperty("serialNumber")
  public Integer getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
  }

  public TruststoreItems serialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TruststoreItems {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

