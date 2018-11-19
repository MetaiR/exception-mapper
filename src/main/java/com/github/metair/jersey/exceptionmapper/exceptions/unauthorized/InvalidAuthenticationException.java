package com.github.metair.jersey.exceptionmapper.exceptions.unauthorized;

import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

/**
 *
 * @author seyedar
 */
public class InvalidAuthenticationException extends UnauthorizedException {

    private static final long serialVersionUID = -8622561186441800012L;

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setText("your authentication info is wrong. if you need help, please check authentication API in our documents");
        error.setType(ErrorTypes.WRONG_AUTHENTICATION);

        return error;
    }

}
