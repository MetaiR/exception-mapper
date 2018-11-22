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
public class MoreThanLimitsException extends BadRequestException {

    /**
     *
     */
    private static final long serialVersionUID = -4263068045681917929L;
    private List<String> fields;

    public MoreThanLimitsException(List<String> fields) {
        this.fields = fields;
    }
    public MoreThanLimitsException(String... fields) {
        this.fields = fields != null ? Arrays.asList(fields) : null;
    }
    public MoreThanLimitsException(String field) {
        this.fields = field != null ? Collections.singletonList(field) : null;
    }

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.MORE_THAN_LIMITS);
        error.setText(
                "there is at least one fields in your data which contains more value than our limits. please check the api documents"
        );
        error.setFields(fields);

        return error;
    }

}
