package com.github.metair.jersey.exceptionmapper.mappers;

import com.github.metair.jersey.exceptionmapper.exceptions.gone.GoneException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author seyedar
 */
@Provider
public class GoneExceptionMapper implements ExceptionMapper<GoneException> {

    @Override
    public Response toResponse(GoneException exception) {
        return Response.status(Response.Status.GONE)
                    .entity(
                            exception.error()
                    )
                    .type(MediaType.APPLICATION_JSON)
                    .build();
    }

}
