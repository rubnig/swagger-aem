package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.KeystoreChainItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * KeystoreItems
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2021-09-03T15:25:27.791+10:00[Australia/Melbourne]")
public class KeystoreItems   {
  @JsonProperty("alias")
  private String alias;

  @JsonProperty("entryType")
  private String entryType;

  @JsonProperty("algorithm")
  private String algorithm;

  @JsonProperty("format")
  private String format;

  @JsonProperty("chain")
  
  private List<KeystoreChainItems> chain = null;

  public KeystoreItems alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Keystore alias name
   * @return alias
  **/
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
   * e.g. \"privateKey\"
   * @return entryType
  **/
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
   * e.g. \"RSA\"
   * @return algorithm
  **/
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
   * e.g. \"PKCS#8\"
   * @return format
  **/
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
      this.chain = new ArrayList<>();
    }
    this.chain.add(chainItem);
    return this;
  }

   /**
   * Get chain
   * @return chain
  **/
  @ApiModelProperty(value = "")
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

