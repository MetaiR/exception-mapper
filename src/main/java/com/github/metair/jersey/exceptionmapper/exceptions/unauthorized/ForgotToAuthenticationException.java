package com.github.metair.jersey.exceptionmapper.exceptions.unauthorized;

import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

/**
 *
 * @author seyedar
 */
public class ForgotToAuthenticationException extends UnauthorizedException {

    private static final long serialVersionUID = 2487622378351291821L;

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setText("you forgot to send authentication info or maybe your values are empty. please check our documents for authentication API");
        error.setType(ErrorTypes.FORGOT_TO_SEND_AUTHENTICATION);

        return error;
    }

}
