package com.github.metair.jersey.exceptionmapper.exceptions.unavailable;

import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

/**
 *
 * @author Seyed
 */
public class UnderMaintenanceException extends UnavailableException {

    private static final long serialVersionUID = -8955909912160162078L;

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType((ErrorTypes.UNDER_MAINTENANCE));
        error.setText("the api you are asking for is under maintenance, please come back some other times or contact server the developer");

        return error;
    }

}
