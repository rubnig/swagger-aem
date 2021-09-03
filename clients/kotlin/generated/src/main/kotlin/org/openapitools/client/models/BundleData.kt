/**
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.BundleDataProp

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id Bundle ID
 * @param name Bundle name
 * @param fragment Is bundle a fragment
 * @param stateRaw Numeric raw bundle state value
 * @param state Bundle state value
 * @param version Bundle version
 * @param symbolicName Bundle symbolic name
 * @param category Bundle category
 * @param props 
 */

data class BundleData (

    /* Bundle ID */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    /* Bundle name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Is bundle a fragment */
    @Json(name = "fragment")
    val fragment: kotlin.Boolean? = null,

    /* Numeric raw bundle state value */
    @Json(name = "stateRaw")
    val stateRaw: kotlin.Int? = null,

    /* Bundle state value */
    @Json(name = "state")
    val state: kotlin.String? = null,

    /* Bundle version */
    @Json(name = "version")
    val version: kotlin.String? = null,

    /* Bundle symbolic name */
    @Json(name = "symbolicName")
    val symbolicName: kotlin.String? = null,

    /* Bundle category */
    @Json(name = "category")
    val category: kotlin.String? = null,

    @Json(name = "props")
    val props: kotlin.collections.List<BundleDataProp>? = null

)

