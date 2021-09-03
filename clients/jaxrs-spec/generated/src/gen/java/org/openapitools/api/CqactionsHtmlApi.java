package org.openapitools.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/.cqactions.html")
@Api(description = "the .cqactions.html API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-09-03T15:26:06.461+10:00[Australia/Melbourne]")public class CqactionsHtmlApi {

    @POST
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "cq" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postCqActions(@QueryParam("authorizableId") @NotNull    String authorizableId,@QueryParam("changelog") @NotNull    String changelog) {
        return Response.ok().entity("magic!").build();
    }
}
