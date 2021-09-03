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
package org.openapitools.server.models


/**
 * 
 * @param name property name
 * @param optional True if optional
 * @param isSet True if property is set
 * @param type Property type, 1=String, 3=long, 11=boolean, 12=Password
 * @param &#x60;value&#x60; Property value
 * @param description Property description
 */
data class SamlConfigurationPropertyItemsString(
    /* property name */
    val name: kotlin.String? = null,
    /* True if optional */
    val optional: kotlin.Boolean? = null,
    /* True if property is set */
    val isSet: kotlin.Boolean? = null,
    /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
    val type: kotlin.Int? = null,
    /* Property value */
    val `value`: kotlin.String? = null,
    /* Property description */
    val description: kotlin.String? = null
) 

