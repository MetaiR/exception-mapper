package com.github.metair.jersey.exceptionmapper.mappers;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.Collections;

/**
 *
 * @author seyedar
 */
@Provider
public class InvalidFormatExceptionMapper implements ExceptionMapper<InvalidFormatException> {

    @Override
    public Response toResponse(InvalidFormatException exception) {
        ErrorModel error = new ErrorModel();
            error.setType(ErrorTypes.INVALID_FORMAT_FIELD);
            error.setText("the type of the Object you sent for me is not what did I expect");

            error.setFields(
                Collections.singletonList(
                    ((InvalidFormatException) exception).getPath().get(0).getFieldName()
                )
            );

            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(error)
                    .type(MediaType.APPLICATION_JSON)
                    .build();
    }

}
