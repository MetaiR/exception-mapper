package com.github.metair.jersey.exceptionmapper.exceptions.alreadyexists;


import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

/**
 *
 * @author seyedar
 */
public class AlreadyDoneException extends AlreadyExistException {

    private static final long serialVersionUID = -7928236548467288359L;

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.REPEATED_EVENT);
        error.setText(
                "take it easy, the job has been done already :D"
        );

        return error;
    }

}
