package com.github.metair.jersey.exceptionmapper.mappers;

import com.github.metair.jersey.exceptionmapper.catcher.AllOtherExceptionsCatcher;

import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class AllOtherExceptionsMapper extends AllOtherExceptionsCatcher implements ExceptionMapper<Throwable> {
}
