package com.github.metair.jersey.exceptionmapper.exceptions;

/**
 *
 * @author seyedar
 */
public abstract class SystemException extends RuntimeException implements SubException {

    /**
     */
    private static final long serialVersionUID = 2524267871717212972L;

    public SystemException() {
        super();
    }

}
