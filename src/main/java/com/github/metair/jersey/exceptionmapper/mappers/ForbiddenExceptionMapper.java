package com.github.metair.jersey.exceptionmapper.mappers;

import com.github.metair.jersey.exceptionmapper.exceptions.forbidden.ForbiddenException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author seyedar
 */
@Provider
public class ForbiddenExceptionMapper implements ExceptionMapper<ForbiddenException> {

    @Override
    public Response toResponse(ForbiddenException exception) {
        return Response.status(Response.Status.FORBIDDEN)
                    .entity(
                            exception.error()
                    )
                    .type(MediaType.APPLICATION_JSON)
                    .build();
    }

}
