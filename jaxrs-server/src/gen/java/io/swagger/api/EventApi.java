package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.EventApiService;
import io.swagger.api.factories.EventApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/event")


@io.swagger.annotations.Api(description = "the event API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-05-02T02:45:15.118Z")
public class EventApi  {
   private final EventApiService delegate;

   public EventApi(@Context ServletConfig servletContext) {
      EventApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("EventApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (EventApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = EventApiServiceFactory.getEventApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "update seat database w/ selection", notes = "adds a user to a seat in the database", response = Void.class, tags={ "seat event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "failed to add user", response = Void.class) })
    public Response addUser(@ApiParam(value = "user email to add to seat",required=true) @QueryParam("email") String email
,@ApiParam(value = "seat number with location ID",required=true) @QueryParam("seatId") String seatId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addUser(email,seatId,securityContext);
    }
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "resets a seat to untaken", notes = "", response = Void.class, tags={ "seat event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "failed to add user", response = Void.class) })
    public Response eventGet(@ApiParam(value = "user email to add to seat",required=true) @QueryParam("email") String email
,@ApiParam(value = "seat number with location ID",required=true) @QueryParam("seatId") String seatId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.eventGet(email,seatId,securityContext);
    }
    @GET
    @Path("/{planId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "gets seating floor plan", notes = "gets an array of seating statuses for a given floorplan", response = Void.class, tags={ "seat event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "", response = Void.class) })
    public Response getFloor(@ApiParam(value = "floor plan ID",required=true) @PathParam("planId") String planId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFloor(planId,securityContext);
    }
    @GET
    @Path("/get/{seatId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "gets a JSON object for a specific seat", notes = "accesses the database to get a user specified seat and its data", response = Void.class, tags={ "seat event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "", response = Void.class) })
    public Response getSeat(@ApiParam(value = "individual seat ID",required=true) @PathParam("seatId") String seatId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSeat(seatId,securityContext);
    }
}
