package com.github.metair.jersey.exceptionmapper.mappers;


import com.github.metair.jersey.exceptionmapper.exceptions.empty.EmptyException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author seyedar
 */
@Provider
public class EmptyExceptionMapper implements ExceptionMapper<EmptyException> {

    @Override
    public Response toResponse(EmptyException exception) {
        return Response.status(Response.Status.NO_CONTENT)
                    .type(MediaType.APPLICATION_JSON)
                    .build();
    }

}
