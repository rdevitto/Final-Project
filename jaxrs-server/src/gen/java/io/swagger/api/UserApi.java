package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.User;

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

@Path("/user")


@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-05-02T02:45:15.118Z")
public class UserApi  {
   private final UserApiService delegate;

   public UserApi(@Context ServletConfig servletContext) {
      UserApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UserApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UserApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UserApiServiceFactory.getUserApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createUser(@ApiParam(value = "Created user object" ,required=true) User body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUser(body,securityContext);
    }
    @DELETE
    @Path("/{username}")
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathParam("username") String username
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUser(username,securityContext);
    }
    @GET
    @Path("/{username}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user by user name", notes = "", response = User.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathParam("username") String username
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserByName(username,securityContext);
    }
    @POST
    @Path("/login")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Logs user into the system", notes = "", response = String.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username/password supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Error occured while checking user login", response = Void.class) })
    public Response loginUser(@ApiParam(value = "The user name for login",required=true) @QueryParam("username") String username
,@ApiParam(value = "The password for login in clear text",required=true) @QueryParam("password") String password
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loginUser(username,password,securityContext);
    }
    @GET
    @Path("/logout")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Logs out current logged in user session", notes = "", response = Void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response logoutUser(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.logoutUser(securityContext);
    }
    @PUT
    @Path("/{username}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Updated user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid user supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response updateUser(@ApiParam(value = "name that need to be updated",required=true) @PathParam("username") String username
,@ApiParam(value = "Updated user object" ,required=true) User body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUser(username,body,securityContext);
    }
}
