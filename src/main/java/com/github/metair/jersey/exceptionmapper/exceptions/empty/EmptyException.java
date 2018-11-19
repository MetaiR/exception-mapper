package com.github.metair.jersey.exceptionmapper.exceptions.empty;


import com.github.metair.jersey.exceptionmapper.exceptions.SystemException;
import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;

/**
 *
 * @author Seyed
 */
public class EmptyException extends SystemException {

    private static final long serialVersionUID = -3047780242546468435L;

    @Override
    public ErrorModel error() {
        return null;
    }

}
