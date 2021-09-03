package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CrxApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.InstallStatus;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/crx")


@io.swagger.annotations.Api(description = "the crx API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-09-03T15:25:57.989+10:00[Australia/Melbourne]")
public class CrxApi  {

    @Inject CrxApiService service;

    @GET
    @Path("/server/crx.default/jcr:root/.1.json")
    
    @Produces({ "plain/text" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "CRXDE is enabled", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "CRXDE is disabled", response = String.class) })
    public Response getCrxdeStatus(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCrxdeStatus(securityContext);
    }
    @GET
    @Path("/packmgr/installstatus.jsp")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = InstallStatus.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved CRX package manager install status", response = InstallStatus.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getInstallStatus(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getInstallStatus(securityContext);
    }
    @GET
    @Path("/packmgr/service/script.html")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 404, message = "Package Manager Servlet is disabled", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Package Manager Servlet is active", response = String.class) })
    public Response getPackageManagerServlet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPackageManagerServlet(securityContext);
    }
    @POST
    @Path("/packmgr/service.jsp")
    
    @Produces({ "text/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageService( @NotNull  @QueryParam("cmd") String cmd,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postPackageService(cmd,securityContext);
    }
    @POST
    @Path("/packmgr/service/.json/{path}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageServiceJson(MultipartFormDataInput input, @PathParam("path") String path, @NotNull  @QueryParam("cmd") String cmd,  @QueryParam("groupName") String groupName,  @QueryParam("packageName") String packageName,  @QueryParam("packageVersion") String packageVersion,  @QueryParam("_charset_") String charset,  @QueryParam("force") Boolean force,  @QueryParam("recursive") Boolean recursive,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postPackageServiceJson(input,path,cmd,groupName,packageName,packageVersion,charset,force,recursive,securityContext);
    }
    @POST
    @Path("/packmgr/update.jsp")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageUpdate( @NotNull  @QueryParam("groupName") String groupName, @NotNull  @QueryParam("packageName") String packageName, @NotNull  @QueryParam("version") String version, @NotNull  @QueryParam("path") String path,  @QueryParam("filter") String filter,  @QueryParam("_charset_") String charset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postPackageUpdate(groupName,packageName,version,path,filter,charset,securityContext);
    }
    @POST
    @Path("/explorer/ui/setpassword.jsp")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postSetPassword( @NotNull  @QueryParam("old") String old, @NotNull  @QueryParam("plain") String plain, @NotNull  @QueryParam("verify") String verify,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postSetPassword(old,plain,verify,securityContext);
    }
}
