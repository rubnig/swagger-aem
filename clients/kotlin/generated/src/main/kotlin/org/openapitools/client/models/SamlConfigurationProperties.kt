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

import org.openapitools.client.models.SamlConfigurationPropertyItemsArray
import org.openapitools.client.models.SamlConfigurationPropertyItemsBoolean
import org.openapitools.client.models.SamlConfigurationPropertyItemsLong
import org.openapitools.client.models.SamlConfigurationPropertyItemsString

import com.squareup.moshi.Json

/**
 * 
 *
 * @param path 
 * @param serviceRanking 
 * @param idpUrl 
 * @param idpCertAlias 
 * @param idpHttpRedirect 
 * @param serviceProviderEntityId 
 * @param assertionConsumerServiceURL 
 * @param spPrivateKeyAlias 
 * @param keyStorePassword 
 * @param defaultRedirectUrl 
 * @param userIDAttribute 
 * @param useEncryption 
 * @param createUser 
 * @param addGroupMemberships 
 * @param groupMembershipAttribute 
 * @param defaultGroups 
 * @param nameIdFormat 
 * @param synchronizeAttributes 
 * @param handleLogout 
 * @param logoutUrl 
 * @param clockTolerance 
 * @param digestMethod 
 * @param signatureMethod 
 * @param userIntermediatePath 
 */

data class SamlConfigurationProperties (

    @Json(name = "path")
    val path: SamlConfigurationPropertyItemsArray? = null,

    @Json(name = "service.ranking")
    val serviceRanking: SamlConfigurationPropertyItemsLong? = null,

    @Json(name = "idpUrl")
    val idpUrl: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "idpCertAlias")
    val idpCertAlias: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "idpHttpRedirect")
    val idpHttpRedirect: SamlConfigurationPropertyItemsBoolean? = null,

    @Json(name = "serviceProviderEntityId")
    val serviceProviderEntityId: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "assertionConsumerServiceURL")
    val assertionConsumerServiceURL: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "spPrivateKeyAlias")
    val spPrivateKeyAlias: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "keyStorePassword")
    val keyStorePassword: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "defaultRedirectUrl")
    val defaultRedirectUrl: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "userIDAttribute")
    val userIDAttribute: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "useEncryption")
    val useEncryption: SamlConfigurationPropertyItemsBoolean? = null,

    @Json(name = "createUser")
    val createUser: SamlConfigurationPropertyItemsBoolean? = null,

    @Json(name = "addGroupMemberships")
    val addGroupMemberships: SamlConfigurationPropertyItemsBoolean? = null,

    @Json(name = "groupMembershipAttribute")
    val groupMembershipAttribute: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "defaultGroups")
    val defaultGroups: SamlConfigurationPropertyItemsArray? = null,

    @Json(name = "nameIdFormat")
    val nameIdFormat: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "synchronizeAttributes")
    val synchronizeAttributes: SamlConfigurationPropertyItemsArray? = null,

    @Json(name = "handleLogout")
    val handleLogout: SamlConfigurationPropertyItemsBoolean? = null,

    @Json(name = "logoutUrl")
    val logoutUrl: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "clockTolerance")
    val clockTolerance: SamlConfigurationPropertyItemsLong? = null,

    @Json(name = "digestMethod")
    val digestMethod: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "signatureMethod")
    val signatureMethod: SamlConfigurationPropertyItemsString? = null,

    @Json(name = "userIntermediatePath")
    val userIntermediatePath: SamlConfigurationPropertyItemsString? = null

)

