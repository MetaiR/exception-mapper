package com.github.metair.jersey.exceptionmapper.mappers;

import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author seyedar
 */
@Provider
public class WebApplicationExceptionMapper implements ExceptionMapper<WebApplicationException> {

    @Override
    public Response toResponse(WebApplicationException exception) {
        Response response = ((WebApplicationException) exception).getResponse();

        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.HTTP_DEFAULT_ERRORS);
        error.setText("this is a default http error. you probably did something wrong");

        return Response.status(response.getStatus())
                .entity(error)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

}
