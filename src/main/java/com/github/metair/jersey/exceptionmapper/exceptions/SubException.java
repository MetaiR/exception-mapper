package com.github.metair.jersey.exceptionmapper.exceptions;


import com.github.metair.jersey.exceptionmapper.exceptions.error.ErrorModel;

/**
 *
 * @author seyedar
 */
public interface SubException {

    ErrorModel error();
}
