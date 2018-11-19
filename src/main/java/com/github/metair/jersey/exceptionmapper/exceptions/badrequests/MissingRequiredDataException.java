package com.github.metair.jersey.exceptionmapper.exceptions.badrequests;



import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorTypes;

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
    private List<String> field;

    public MissingRequiredDataException(List<String> field) {
        this.field = field;
    }

    @Override
    public ErrorModel error() {
        ErrorModel error = new ErrorModel();
        error.setType(ErrorTypes.MISSING_REQUIRED_DATA);
        error.setText(
                "there are some missing values. we realy need them, please send them for us. check our APIs documents"
        );
        error.setFields(field);

        return error;
    }

}
