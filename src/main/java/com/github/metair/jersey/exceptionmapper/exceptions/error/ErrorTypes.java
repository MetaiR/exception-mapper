package com.github.metair.jersey.exceptionmapper.exceptions.error;

/**
 *
 * @author seyedar
 */
public interface ErrorTypes {

    // bad requests
    short MORE_THAN_LIMITS = 101;
    short MISSING_REQUIRED_DATA = 102;
    short WRONG_DATA = 103;

    // bad requests related to json structure
    short UNRECOGNIZED_FIELD = 151;
    short INVALID_FORMAT_FIELD = 152;
    short JSON_STRUCTURE_ERROR = 153;

    // already exists
    short REPEATED_DATA = 301;
    short REPEATED_EVENT = 302;

    // authorization
    short FORGOT_TO_SEND_AUTHENTICATION = 401;
    short WRONG_AUTHENTICATION = 402;

    // forbidden
    short ACCESS_DENY = 501;

    // Gone
    short TOKEN_EXPIRED = 601;

    // Unavailable
    short NOT_COMPLETE = 702;
    short UNDER_MAINTENANCE = 701;

    // others
    short HTTP_DEFAULT_ERRORS = 999;
    short UNHANDLED_SERVER_ERROR = 1000;
}
