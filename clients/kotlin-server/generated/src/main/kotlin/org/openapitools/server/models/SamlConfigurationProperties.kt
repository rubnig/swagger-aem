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

import org.openapitools.server.models.SamlConfigurationPropertyItemsArray
import org.openapitools.server.models.SamlConfigurationPropertyItemsBoolean
import org.openapitools.server.models.SamlConfigurationPropertyItemsLong
import org.openapitools.server.models.SamlConfigurationPropertyItemsString

/**
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
data class SamlConfigurationProperties(
    val path: SamlConfigurationPropertyItemsArray? = null,
    val serviceRanking: SamlConfigurationPropertyItemsLong? = null,
    val idpUrl: SamlConfigurationPropertyItemsString? = null,
    val idpCertAlias: SamlConfigurationPropertyItemsString? = null,
    val idpHttpRedirect: SamlConfigurationPropertyItemsBoolean? = null,
    val serviceProviderEntityId: SamlConfigurationPropertyItemsString? = null,
    val assertionConsumerServiceURL: SamlConfigurationPropertyItemsString? = null,
    val spPrivateKeyAlias: SamlConfigurationPropertyItemsString? = null,
    val keyStorePassword: SamlConfigurationPropertyItemsString? = null,
    val defaultRedirectUrl: SamlConfigurationPropertyItemsString? = null,
    val userIDAttribute: SamlConfigurationPropertyItemsString? = null,
    val useEncryption: SamlConfigurationPropertyItemsBoolean? = null,
    val createUser: SamlConfigurationPropertyItemsBoolean? = null,
    val addGroupMemberships: SamlConfigurationPropertyItemsBoolean? = null,
    val groupMembershipAttribute: SamlConfigurationPropertyItemsString? = null,
    val defaultGroups: SamlConfigurationPropertyItemsArray? = null,
    val nameIdFormat: SamlConfigurationPropertyItemsString? = null,
    val synchronizeAttributes: SamlConfigurationPropertyItemsArray? = null,
    val handleLogout: SamlConfigurationPropertyItemsBoolean? = null,
    val logoutUrl: SamlConfigurationPropertyItemsString? = null,
    val clockTolerance: SamlConfigurationPropertyItemsLong? = null,
    val digestMethod: SamlConfigurationPropertyItemsString? = null,
    val signatureMethod: SamlConfigurationPropertyItemsString? = null,
    val userIntermediatePath: SamlConfigurationPropertyItemsString? = null
) 

