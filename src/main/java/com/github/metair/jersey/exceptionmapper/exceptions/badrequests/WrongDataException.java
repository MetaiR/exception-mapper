package com.github.metair.jersey.exceptionmapper.exceptions.badrequests;


import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

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
    private List<String> field;

    public WrongDataException(List<String> field) {
        this.field = field;
    }

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.WRONG_DATA);
        error.setFields(field);
        error.setText(
                "you sent some wrong data for us, please correct them and try again. you can also check our APIs documents"
        );

        return error;
    }
}
