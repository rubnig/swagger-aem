package org.openapitools.api;

import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;
import org.openapitools.api.SystemApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/system")
@RequestScoped

@Api(description = "the system API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-09-03T15:25:48.597+10:00[Australia/Melbourne]")

public class SystemApi  {

  @Context SecurityContext securityContext;

  @Inject SystemApiService delegate;


    @GET
    @Path("/health")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "custom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getAemHealthCheck(@ApiParam(value = "")  @QueryParam("tags") String tags, @ApiParam(value = "")  @QueryParam("combineTagsOr") Boolean combineTagsOr) {
        return delegate.getAemHealthCheck(tags, combineTagsOr, securityContext);
    }

    @GET
    @Path("/console/status-productinfo.json")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class, responseContainer = "List") })
    public Response getAemProductInfo() {
        return delegate.getAemProductInfo(securityContext);
    }

    @GET
    @Path("/console/bundles/{name}.json")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = BundleInfo.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved bundle info", response = BundleInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getBundleInfo(@ApiParam(value = "",required=true) @PathParam("name") String name) {
        return delegate.getBundleInfo(name, securityContext);
    }

    @GET
    @Path("/console/configMgr")
    
    @Produces({ "text/xml" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 5XX, message = "Unexpected error.", response = Void.class) })
    public Response getConfigMgr() {
        return delegate.getConfigMgr(securityContext);
    }

    @POST
    @Path("/console/bundles/{name}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postBundle(@ApiParam(value = "",required=true) @PathParam("name") String name,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("action") String action) {
        return delegate.postBundle(name, action, securityContext);
    }

    @POST
    @Path("/console/jmx/com.adobe.granite:type=Repository/op/{action}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postJmxRepository(@ApiParam(value = "",required=true) @PathParam("action") String action) {
        return delegate.postJmxRepository(action, securityContext);
    }

    @POST
    @Path("/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")
    
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = SamlConfigurationInfo.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved AEM SAML Configuration", response = SamlConfigurationInfo.class),
        @ApiResponse(code = 302, message = "Default response", response = String.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postSamlConfiguration(@ApiParam(value = "")  @QueryParam("post") Boolean post, @ApiParam(value = "")  @QueryParam("apply") Boolean apply, @ApiParam(value = "")  @QueryParam("delete") Boolean delete, @ApiParam(value = "")  @QueryParam("action") String action, @ApiParam(value = "")  @QueryParam("$location") String $location, @ApiParam(value = "")  @QueryParam("path") List<String> path, @ApiParam(value = "")  @QueryParam("service.ranking") Integer serviceRanking, @ApiParam(value = "")  @QueryParam("idpUrl") String idpUrl, @ApiParam(value = "")  @QueryParam("idpCertAlias") String idpCertAlias, @ApiParam(value = "")  @QueryParam("idpHttpRedirect") Boolean idpHttpRedirect, @ApiParam(value = "")  @QueryParam("serviceProviderEntityId") String serviceProviderEntityId, @ApiParam(value = "")  @QueryParam("assertionConsumerServiceURL") String assertionConsumerServiceURL, @ApiParam(value = "")  @QueryParam("spPrivateKeyAlias") String spPrivateKeyAlias, @ApiParam(value = "")  @QueryParam("keyStorePassword") String keyStorePassword, @ApiParam(value = "")  @QueryParam("defaultRedirectUrl") String defaultRedirectUrl, @ApiParam(value = "")  @QueryParam("userIDAttribute") String userIDAttribute, @ApiParam(value = "")  @QueryParam("useEncryption") Boolean useEncryption, @ApiParam(value = "")  @QueryParam("createUser") Boolean createUser, @ApiParam(value = "")  @QueryParam("addGroupMemberships") Boolean addGroupMemberships, @ApiParam(value = "")  @QueryParam("groupMembershipAttribute") String groupMembershipAttribute, @ApiParam(value = "")  @QueryParam("defaultGroups") List<String> defaultGroups, @ApiParam(value = "")  @QueryParam("nameIdFormat") String nameIdFormat, @ApiParam(value = "")  @QueryParam("synchronizeAttributes") List<String> synchronizeAttributes, @ApiParam(value = "")  @QueryParam("handleLogout") Boolean handleLogout, @ApiParam(value = "")  @QueryParam("logoutUrl") String logoutUrl, @ApiParam(value = "")  @QueryParam("clockTolerance") Integer clockTolerance, @ApiParam(value = "")  @QueryParam("digestMethod") String digestMethod, @ApiParam(value = "")  @QueryParam("signatureMethod") String signatureMethod, @ApiParam(value = "")  @QueryParam("userIntermediatePath") String userIntermediatePath, @ApiParam(value = "")  @QueryParam("propertylist") List<String> propertylist) {
        return delegate.postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist, securityContext);
    }
}
