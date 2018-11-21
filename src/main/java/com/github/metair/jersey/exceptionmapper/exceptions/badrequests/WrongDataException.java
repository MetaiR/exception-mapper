package com.github.metair.jersey.exceptionmapper.exceptions.badrequests;


import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author seyedar
 */
public class WrongDataException extends BadRequestException {

    /**
     *
     */
    private static final long serialVersionUID = 4519118399641545134L;
    private List<String> fields;

    public WrongDataException(List<String> fields) {
        this.fields = fields;
    }
    public WrongDataException(String... fields) {
        this.fields = fields != null ? Arrays.asList(fields) : null;
    }
    public WrongDataException(String field) {
        this.fields = field != null ? Collections.singletonList(field) : null;;
    }


    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.WRONG_DATA);
        error.setFields(fields);
        error.setText(
                "you sent some wrong data for us, please correct them and try again. you can also check our APIs documents"
        );

        return error;
    }
}
