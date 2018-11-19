package com.github.metair.jersey.exceptionmapper.catcher;

import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Seyed
 */
public abstract class AllOtherExceptionsCatcher {
    public Response toResponse(Throwable ex) {

        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.UNHANDLED_SERVER_ERROR);
        error.setText("OMG, you found a serious problem. please tell us about this so we'll be able to fix it soon");

        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(error)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
}
