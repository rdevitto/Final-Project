package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-05-02T02:45:15.118Z")
public abstract class EventApiService {
    public abstract Response addUser( @NotNull String email, @NotNull String seatId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response eventGet( @NotNull String email, @NotNull String seatId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getFloor(String planId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSeat(String seatId,SecurityContext securityContext) throws NotFoundException;
}
