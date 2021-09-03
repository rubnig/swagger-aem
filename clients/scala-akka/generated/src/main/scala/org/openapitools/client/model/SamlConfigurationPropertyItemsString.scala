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
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class SamlConfigurationPropertyItemsString (
  /* property name */
  name: Option[String] = None,
  /* True if optional */
  optional: Option[Boolean] = None,
  /* True if property is set */
  isSet: Option[Boolean] = None,
  /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
  `type`: Option[Int] = None,
  /* Property value */
  value: Option[String] = None,
  /* Property description */
  description: Option[String] = None
) extends ApiModel


