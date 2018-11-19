package com.github.metair.jersey.exceptionmapper.mappers;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
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
public class UnrecognizedPropertyExceptionMapper implements ExceptionMapper<UnrecognizedPropertyException> {

    @Override
    public Response toResponse(UnrecognizedPropertyException exception) {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.UNRECOGNIZED_FIELD);
        error.setText("I'm unabale to understand what you sent");

        error.setFields(
                Collections.singletonList(
                    ((UnrecognizedPropertyException) exception).getPropertyName()
                )
        );

        return Response.status(Response.Status.BAD_REQUEST)
                .entity(error)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

}
