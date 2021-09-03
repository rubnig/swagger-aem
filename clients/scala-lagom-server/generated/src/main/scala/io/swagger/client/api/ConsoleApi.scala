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

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.BundleInfo
import io.swagger.client.model.SamlConfigurationInfo

trait ConsoleApi extends Service {


  final override def descriptor = {
    import Service._
    named("ConsoleApi").withCalls(
      restCall(Method.GET, "/system/console/status-productinfo.json", getAemProductInfo _), 
      restCall(Method.GET, "/system/console/bundles/:name.json", getBundleInfo _), 
      restCall(Method.GET, "/system/console/configMgr", getConfigMgr _), 
      restCall(Method.POST, "/system/console/bundles/:name?action", postBundle _), 
      restCall(Method.POST, "/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/:action", postJmxRepository _), 
      restCall(Method.POST, "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler?post&apply&delete&action&location&`path`&serviceRanking&idpUrl&idpCertAlias&idpHttpRedirect&serviceProviderEntityId&assertionConsumerServiceURL&spPrivateKeyAlias&keyStorePassword&defaultRedirectUrl&userIDAttribute&useEncryption&createUser&addGroupMemberships&groupMembershipAttribute&defaultGroups&nameIdFormat&synchronizeAttributes&handleLogout&logoutUrl&clockTolerance&digestMethod&signatureMethod&userIntermediatePath&propertylist", postSamlConfiguration _)
    ).withAutoAcl(true)
  }


  /**
    * 
    * 
    * 
    * @return Seq[String]
    */
  def getAemProductInfo(): ServiceCall[NotUsed ,Seq[String]]
  
  /**
    * 
    * 
    *  
    * @param name  
    * @return BundleInfo
    */
  def getBundleInfo(name: String): ServiceCall[NotUsed ,BundleInfo]
  
  /**
    * 
    * 
    * 
    * @return String
    */
  def getConfigMgr(): ServiceCall[NotUsed ,String]
        
  /**
    * 
    * 
    *  
    * @param name   
    * @param action  
    * @return void
    */
  def postBundle(action:String          name: String): ServiceCall[NotUsed ,Done]
  
  /**
    * 
    * 
    *  
    * @param action  
    * @return void
    */
  def postJmxRepository(action: String): ServiceCall[NotUsed ,Done]
        
  // `path`:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  // defaultGroups:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  // synchronizeAttributes:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  // propertylist:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  /**
    * 
    * 
    *  
    * @param post  (optional) 
    * @param apply  (optional) 
    * @param delete  (optional) 
    * @param action  (optional) 
    * @param location  (optional) 
    * @param `path`  (optional, default to new ListBuffer[String]() ) 
    * @param serviceRanking  (optional) 
    * @param idpUrl  (optional) 
    * @param idpCertAlias  (optional) 
    * @param idpHttpRedirect  (optional) 
    * @param serviceProviderEntityId  (optional) 
    * @param assertionConsumerServiceURL  (optional) 
    * @param spPrivateKeyAlias  (optional) 
    * @param keyStorePassword  (optional) 
    * @param defaultRedirectUrl  (optional) 
    * @param userIDAttribute  (optional) 
    * @param useEncryption  (optional) 
    * @param createUser  (optional) 
    * @param addGroupMemberships  (optional) 
    * @param groupMembershipAttribute  (optional) 
    * @param defaultGroups  (optional, default to new ListBuffer[String]() ) 
    * @param nameIdFormat  (optional) 
    * @param synchronizeAttributes  (optional, default to new ListBuffer[String]() ) 
    * @param handleLogout  (optional) 
    * @param logoutUrl  (optional) 
    * @param clockTolerance  (optional) 
    * @param digestMethod  (optional) 
    * @param signatureMethod  (optional) 
    * @param userIntermediatePath  (optional) 
    * @param propertylist  (optional, default to new ListBuffer[String]() )
    * @return SamlConfigurationInfo
    */
  def postSamlConfiguration(post:           Option[Boolean] = None,apply:           Option[Boolean] = None,delete:           Option[Boolean] = None,action:           Option[String] = None,location:           Option[String] = None,serviceRanking:           Option[Int] = None,idpUrl:           Option[String] = None,idpCertAlias:           Option[String] = None,idpHttpRedirect:           Option[Boolean] = None,serviceProviderEntityId:           Option[String] = None,assertionConsumerServiceURL:           Option[String] = None,spPrivateKeyAlias:           Option[String] = None,keyStorePassword:           Option[String] = None,defaultRedirectUrl:           Option[String] = None,userIDAttribute:           Option[String] = None,useEncryption:           Option[Boolean] = None,createUser:           Option[Boolean] = None,addGroupMemberships:           Option[Boolean] = None,groupMembershipAttribute:           Option[String] = None,nameIdFormat:           Option[String] = None,handleLogout:           Option[Boolean] = None,logoutUrl:           Option[String] = None,clockTolerance:           Option[Int] = None,digestMethod:           Option[String] = None,signatureMethod:           Option[String] = None,userIntermediatePath:           Option[String] = None,): ServiceCall[NotUsed ,SamlConfigurationInfo]
  

  }

