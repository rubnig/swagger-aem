/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class SamlConfigurationPropertyItemsArray(
  /* property name */
  name: Option[String],

  /* True if optional */
  optional: Option[Boolean],

  /* True if property is set */
  isSet: Option[Boolean],

  /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
  `type`: Option[Int],

  /* Property value */
  values: Option[List[String]],

  /* Property description */
  description: Option[String]

 )
