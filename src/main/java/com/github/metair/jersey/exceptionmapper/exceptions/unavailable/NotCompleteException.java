package com.github.metair.jersey.exceptionmapper.exceptions.unavailable;


import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

/**
 *
 * @author Seyed
 */
public class NotCompleteException extends UnavailableException {

    private static final long serialVersionUID = -5356531647050379166L;

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.NOT_COMPLETE);
        error.setText("this api is not completed yet");

        return error;
    }

}
