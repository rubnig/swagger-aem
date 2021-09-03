package org.openapitools.api;

import java.io.File;
import org.openapitools.model.InstallStatus;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Adobe Experience Manager (AEM) API
 *
 * <p>Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 */
@Path("/crx")
@Api(value = "/", description = "")
public interface CrxApi  {

    @GET
    @Path("/server/crx.default/jcr:root/.1.json")
    @Produces({ "plain/text" })
    @ApiOperation(value = "", tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "CRXDE is enabled", response = String.class),
        @ApiResponse(code = 404, message = "CRXDE is disabled", response = String.class) })
    public String getCrxdeStatus();

    @GET
    @Path("/packmgr/installstatus.jsp")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved CRX package manager install status", response = InstallStatus.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public InstallStatus getInstallStatus();

    @GET
    @Path("/packmgr/service/script.html")
    @Produces({ "text/html" })
    @ApiOperation(value = "", tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 404, message = "Package Manager Servlet is disabled", response = String.class),
        @ApiResponse(code = 405, message = "Package Manager Servlet is active", response = String.class) })
    public void getPackageManagerServlet();

    @POST
    @Path("/packmgr/service.jsp")
    @Produces({ "text/xml" })
    @ApiOperation(value = "", tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postPackageService(@QueryParam("cmd") @NotNull  String cmd);

    @POST
    @Path("/packmgr/service/.json/{path}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postPackageServiceJson(@PathParam("path") String path, @QueryParam("cmd") @NotNull  String cmd, @QueryParam("groupName")  String groupName, @QueryParam("packageName")  String packageName, @QueryParam("packageVersion")  String packageVersion, @QueryParam("_charset_")  String charset, @QueryParam("force")  Boolean force, @QueryParam("recursive")  Boolean recursive,  @Multipart(value = "package" , required = false) Attachment _packageDetail);

    @POST
    @Path("/packmgr/update.jsp")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postPackageUpdate(@QueryParam("groupName") @NotNull  String groupName, @QueryParam("packageName") @NotNull  String packageName, @QueryParam("version") @NotNull  String version, @QueryParam("path") @NotNull  String path, @QueryParam("filter")  String filter, @QueryParam("_charset_")  String charset);

    @POST
    @Path("/explorer/ui/setpassword.jsp")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postSetPassword(@QueryParam("old") @NotNull  String old, @QueryParam("plain") @NotNull  String plain, @QueryParam("verify") @NotNull  String verify);
}

