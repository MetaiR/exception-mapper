package com.github.metair.jersey.exceptionmapper.exceptions.alreadyexists;

import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author seyedar
 */
public class RepeatedDataException extends AlreadyExistException {

    private static final long serialVersionUID = 1503367782874666972L;
    private List<String> fields;

    public RepeatedDataException(List<String> fields) {
        this.fields = fields;
    }
    public RepeatedDataException(String... fields) {
        this.fields = fields != null ? Arrays.asList(fields) : null;
    }
    public RepeatedDataException(String field) {
        this.fields = field != null ? Collections.singletonList(field) : null;
    }

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.REPEATED_DATA);
        error.setFields(fields);
        error.setText(
                "sorry but we already have some of data. if you need help, please check our APIs document"
        );

        return error;
    }

}
