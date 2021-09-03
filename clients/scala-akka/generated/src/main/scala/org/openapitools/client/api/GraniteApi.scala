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
package org.openapitools.client.api

import java.io.File
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object GraniteApi {

  def apply(baseUrl: String = "http://localhost") = new GraniteApi(baseUrl)
}

class GraniteApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 0 : String (Default response)
   * 
   * Available security schemes:
   *   aemAuth (http)
   * 
   * @param keystorePassword 
   * @param keystorePasswordConfirm 
   * @param truststorePassword 
   * @param truststorePasswordConfirm 
   * @param httpsHostname 
   * @param httpsPort 
   * @param privatekeyFile 
   * @param certificateFile 
   */
  def sslSetup(keystorePassword: String, keystorePasswordConfirm: String, truststorePassword: String, truststorePasswordConfirm: String, httpsHostname: String, httpsPort: String, privatekeyFile: Option[File] = None, certificateFile: Option[File] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, baseUrl, "/libs/granite/security/post/sslSetup.html", "multipart/form-data")
      .withCredentials(basicAuth).withFormParam("privatekeyFile", privatekeyFile)
      .withFormParam("certificateFile", certificateFile)
      .withQueryParam("keystorePassword", keystorePassword)
      .withQueryParam("keystorePasswordConfirm", keystorePasswordConfirm)
      .withQueryParam("truststorePassword", truststorePassword)
      .withQueryParam("truststorePasswordConfirm", truststorePasswordConfirm)
      .withQueryParam("httpsHostname", httpsHostname)
      .withQueryParam("httpsPort", httpsPort)
      .withDefaultErrorResponse[String]
      



}
