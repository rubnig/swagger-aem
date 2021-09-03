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

package io.swagger.client.model
import play.api.libs.json._

case class SamlConfigurationInfo (
            /* Persistent Identity (PID) */
                  pid: Option[String],
            /* Title */
                  title: Option[String],
            /* Title */
                  description: Option[String],
            /* needed for configuration binding */
                  bundleLocation: Option[String],
            /* needed for configuraiton binding */
                  serviceLocation: Option[String],
                  properties: Option[SamlConfigurationProperties]
)

object SamlConfigurationInfo {
implicit val format: Format[SamlConfigurationInfo] = Json.format
}

