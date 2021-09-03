package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CqactionsHtmlApiService;
import org.openapitools.api.factories.CqactionsHtmlApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/.cqactions.html")


@io.swagger.annotations.Api(description = "the .cqactions.html API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public class CqactionsHtmlApi  {
   private final CqactionsHtmlApiService delegate;

   public CqactionsHtmlApi(@Context ServletConfig servletContext) {
      CqactionsHtmlApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CqactionsHtmlApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CqactionsHtmlApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CqactionsHtmlApiServiceFactory.getCqactionsHtmlApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "cq", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postCqActions(@ApiParam(value = "", required = true) @QueryParam("authorizableId") @NotNull  String authorizableId,@ApiParam(value = "", required = true) @QueryParam("changelog") @NotNull  String changelog,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postCqActions(authorizableId, changelog, securityContext);
    }
}
