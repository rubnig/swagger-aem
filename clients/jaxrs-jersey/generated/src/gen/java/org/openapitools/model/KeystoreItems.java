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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeystoreChainItems;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * KeystoreItems
 */
@JsonPropertyOrder({
  KeystoreItems.JSON_PROPERTY_ALIAS,
  KeystoreItems.JSON_PROPERTY_ENTRY_TYPE,
  KeystoreItems.JSON_PROPERTY_ALGORITHM,
  KeystoreItems.JSON_PROPERTY_FORMAT,
  KeystoreItems.JSON_PROPERTY_CHAIN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public class KeystoreItems   {
  public static final String JSON_PROPERTY_ALIAS = "alias";
  @JsonProperty(JSON_PROPERTY_ALIAS)
  private String alias;

  public static final String JSON_PROPERTY_ENTRY_TYPE = "entryType";
  @JsonProperty(JSON_PROPERTY_ENTRY_TYPE)
  private String entryType;

  public static final String JSON_PROPERTY_ALGORITHM = "algorithm";
  @JsonProperty(JSON_PROPERTY_ALGORITHM)
  private String algorithm;

  public static final String JSON_PROPERTY_FORMAT = "format";
  @JsonProperty(JSON_PROPERTY_FORMAT)
  private String format;

  public static final String JSON_PROPERTY_CHAIN = "chain";
  @JsonProperty(JSON_PROPERTY_CHAIN)
  private List<KeystoreChainItems> chain = null;

  public KeystoreItems alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Keystore alias name
   * @return alias
   **/
  @JsonProperty(value = "alias")
  @ApiModelProperty(value = "Keystore alias name")
  
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public KeystoreItems entryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

  /**
   * e.g. \&quot;privateKey\&quot;
   * @return entryType
   **/
  @JsonProperty(value = "entryType")
  @ApiModelProperty(value = "e.g. \"privateKey\"")
  
  public String getEntryType() {
    return entryType;
  }

  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }

  public KeystoreItems algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * e.g. \&quot;RSA\&quot;
   * @return algorithm
   **/
  @JsonProperty(value = "algorithm")
  @ApiModelProperty(value = "e.g. \"RSA\"")
  
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public KeystoreItems format(String format) {
    this.format = format;
    return this;
  }

  /**
   * e.g. \&quot;PKCS#8\&quot;
   * @return format
   **/
  @JsonProperty(value = "format")
  @ApiModelProperty(value = "e.g. \"PKCS#8\"")
  
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public KeystoreItems chain(List<KeystoreChainItems> chain) {
    this.chain = chain;
    return this;
  }

  public KeystoreItems addChainItem(KeystoreChainItems chainItem) {
    if (this.chain == null) {
      this.chain = new ArrayList<KeystoreChainItems>();
    }
    this.chain.add(chainItem);
    return this;
  }

  /**
   * Get chain
   * @return chain
   **/
  @JsonProperty(value = "chain")
  @ApiModelProperty(value = "")
  @Valid 
  public List<KeystoreChainItems> getChain() {
    return chain;
  }

  public void setChain(List<KeystoreChainItems> chain) {
    this.chain = chain;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeystoreItems keystoreItems = (KeystoreItems) o;
    return Objects.equals(this.alias, keystoreItems.alias) &&
        Objects.equals(this.entryType, keystoreItems.entryType) &&
        Objects.equals(this.algorithm, keystoreItems.algorithm) &&
        Objects.equals(this.format, keystoreItems.format) &&
        Objects.equals(this.chain, keystoreItems.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, entryType, algorithm, format, chain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreItems {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
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

