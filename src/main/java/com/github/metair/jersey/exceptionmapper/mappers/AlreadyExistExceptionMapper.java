package com.github.metair.jersey.exceptionmapper.mappers;

import com.github.metair.jersey.exceptionmapper.exceptions.alreadyexists.AlreadyExistException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Seyed Ali Roshan
 */
@Provider
public class AlreadyExistExceptionMapper implements ExceptionMapper<AlreadyExistException> {

    @Override
    public Response toResponse(AlreadyExistException exception) {
        return Response.status(208)
                    .entity(
                            exception.error()
                    )
                    .type(MediaType.APPLICATION_JSON)
                    .build();
    }

}
