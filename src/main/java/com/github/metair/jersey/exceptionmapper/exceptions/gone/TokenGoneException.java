package com.github.metair.jersey.exceptionmapper.exceptions.gone;


import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

/**
 *
 * @author seyedar
 */
public class TokenGoneException extends GoneException {

    private static final long serialVersionUID = 5777028115731429518L;

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.TOKEN_EXPIRED);
        error.setText("your token has beein expired. please refresh it and try again.");

        return error;
    }
}
