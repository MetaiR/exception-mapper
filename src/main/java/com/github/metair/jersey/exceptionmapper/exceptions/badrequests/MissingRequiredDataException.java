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
public class MissingRequiredDataException extends BadRequestException {

    /**
     *
     */
    private static final long serialVersionUID = 1382411461589444277L;
    private List<String> fields;

    public MissingRequiredDataException(List<String> fields) {
        this.fields = fields;
    }
    public MissingRequiredDataException(String... fields) {
        this.fields = fields != null ? Arrays.asList(fields) : null;
    }
    public MissingRequiredDataException(String field) {
        this.fields = field != null ? Collections.singletonList(field) : null;
    }

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.MISSING_REQUIRED_DATA);
        error.setText(
                "there are some missing values. we realy need them, please send them for us. check our APIs documents"
        );
        error.setFields(fields);

        return error;
    }

}
