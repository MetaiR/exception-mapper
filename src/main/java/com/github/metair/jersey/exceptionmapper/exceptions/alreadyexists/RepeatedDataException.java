package com.github.metair.jersey.exceptionmapper.exceptions.alreadyexists;

import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

import java.util.List;

/**
 *
 * @author seyedar
 */
public class RepeatedDataException extends AlreadyExistException {

    private static final long serialVersionUID = 1503367782874666972L;
    private List<String> field;

    public RepeatedDataException(List<String> field) {
        this.field = field;
    }

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.REPEATED_DATA);
        error.setFields(field);
        error.setText(
                "sorry but we already have some of data. if you need help, please check our APIs document"
        );

        return error;
    }

}
