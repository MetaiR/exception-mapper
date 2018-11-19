package com.github.metair.jersey.exceptionmapper;

import com.github.metair.jersey.exceptionmapper.mappers.*;

public enum Mappers {
    ALL_EXCEPTIONS {
        @Override
        Class<AllOtherExceptionsMapper> value() {
            return AllOtherExceptionsMapper.class;
        }
    },
    ALREADY_EXIST {
        @Override
        Class<AlreadyExistExceptionMapper> value() {
            return AlreadyExistExceptionMapper.class;
        }
    },
    BAD_REQUSETS {
        @Override
        Class<BadRequestExceptionMapper> value() {
            return BadRequestExceptionMapper.class;
        }
    },
    CONSTRAINT_VIOLATION {
        @Override
        Class<ConstraintViolationExceptionMapper> value() {
            return ConstraintViolationExceptionMapper.class;
        }
    },
    EMPTY {
        @Override
        Class<EmptyExceptionMapper> value() {
            return EmptyExceptionMapper.class;
        }
    },
    FORBIDDEN {
        @Override
        Class<ForbiddenExceptionMapper> value() {
            return ForbiddenExceptionMapper.class;
        }
    },
    GONE {
        @Override
        Class<GoneExceptionMapper> value() {
            return GoneExceptionMapper.class;
        }
    },
    INVALID_FORMAT {
        @Override
        Class<InvalidFormatExceptionMapper> value() {
            return InvalidFormatExceptionMapper.class;
        }
    },
    JSON_MAPPING {
        @Override
        Class<JsonMappingExceptionMapper> value() {
            return JsonMappingExceptionMapper.class;
        }
    },
    PARAM {
        @Override
        Class<ParamExceptionMapper> value() {
            return ParamExceptionMapper.class;
        }
    },
    UNAUTHORIZED {
        @Override
        Class<UnauthorizedExceptionMapper> value() {
            return UnauthorizedExceptionMapper.class;
        }
    },
    UNAVAILABLE {
        @Override
        Class<UnavailableExceptionMapper> value() {
            return UnavailableExceptionMapper.class;
        }
    },
    UNRECOGNIZED_PROPERTY {
        @Override
        Class<UnrecognizedPropertyExceptionMapper> value() {
            return UnrecognizedPropertyExceptionMapper.class;
        }
    },
    WEB_APPLICATION {
        @Override
        Class<WebApplicationExceptionMapper> value() {
            return WebApplicationExceptionMapper.class;
        }
    };

    abstract Class<?> value();
}
