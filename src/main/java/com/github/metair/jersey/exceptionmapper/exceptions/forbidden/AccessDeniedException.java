package com.github.metair.jersey.exceptionmapper.exceptions.forbidden;

import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

/**
 *
 * @author seyedar
 */
public class AccessDeniedException extends ForbiddenException {

    private static final long serialVersionUID = 2303359753285271400L;

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setText("you are not belong here");
        error.setType(ErrorTypes.ACCESS_DENY);

        return error;
    }

}
