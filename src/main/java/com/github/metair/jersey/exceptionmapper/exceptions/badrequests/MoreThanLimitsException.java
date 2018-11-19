package com.github.metair.jersey.exceptionmapper.exceptions.badrequests;


import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

import java.util.List;

/**
 *
 * @author seyedar
 */
public class MoreThanLimitsException extends BadRequestException {

    /**
     *
     */
    private static final long serialVersionUID = -4263068045681917929L;
    private List<String> field;

    public MoreThanLimitsException(List<String> field) {
        this.field = field;
    }

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.MORE_THAN_LIMITS);
        error.setText(
                "there is at least one field in your data which contains more value than our limits. please check the api documents"
        );
        error.setFields(field);

        return error;
    }

}
