package com.github.metair.jersey.exceptionmapper.mappers;

import com.github.metair.jersey.exceptionmapper.exceptions.badrequests.WrongDataException;
import org.glassfish.jersey.server.ParamException;

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
public class ParamExceptionMapper implements ExceptionMapper<ParamException> {

    @Override
    public Response toResponse(ParamException exception) {
            String paramName = ((ParamException) exception).getParameterName();

            WrongDataException ex = new WrongDataException(Collections.singletonList(paramName));

            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(ex.error())
                    .type(MediaType.APPLICATION_JSON)
                    .build();
    }

}
