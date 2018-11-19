package com.github.metair.jersey.exceptionmapper.mappers;

import com.github.metair.jersey.exceptionmapper.exceptions.unavailable.UnavailableException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author seyedar
 */
@Provider
public class UnavailableExceptionMapper implements ExceptionMapper<UnavailableException> {

    @Override
    public Response toResponse(UnavailableException exception) {
        return Response.status(Response.Status.SERVICE_UNAVAILABLE)
                .entity(exception.error())
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
}
