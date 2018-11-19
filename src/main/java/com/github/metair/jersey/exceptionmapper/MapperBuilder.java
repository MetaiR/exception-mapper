package com.github.metair.jersey.exceptionmapper;

import com.github.metair.jersey.exceptionmapper.mappers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * this class is a tool for getting mappers with ease
 * it is highly recommend to read the <a href="http://github.com/metair/exception-mapper">documents</a>
 * @author Seyed Ali Roshan
 */
public class MapperBuilder {
    private List<Class> mapperClasses = new ArrayList<>();

    /**
     * remove the class from the list and if it is not, nothing would be happen
     * @param mapper which is an enum value from Mappers
     * @return this is the Builder design pattern so it will return the current instance of Class it self
     */
    public MapperBuilder except(Mappers mapper) {
        mapperClasses.remove(mapper.value());

        return this;
    }

    /**
     * this method will add a class to the result list.
     * it is good if you want to get just a few of mappers not all of them.
     * @param mapper which is an enum value from Mappers
     * @return this is the Builder design pattern so it will return the current instance of Class it self
     */
    public MapperBuilder add(Mappers mapper) {
        Class klass = mapper.value();

        if (!mapperClasses.contains(klass)) {
            mapperClasses.add(klass);
        }

        return this;
    }

    /**
     * this method will add all classes to the result list.
     * @param mappers which is a list of enum values from Mappers
     * @return this is the Builder design pattern so it will return the current instance of Class it self
     */
    public MapperBuilder addAll(List<Mappers> mappers) {
        Class<?> klass;

        for (Mappers mapper : mappers) {
            klass = mapper.value();
            if (!mapperClasses.contains(klass)) {
                mapperClasses.add(klass);
            }
        }

        return this;
    }

    /**
     * this one is creating a new list with all mapper classes except Mappers.ALL_EXCEPTIONS
     * which is AlreadyExistExceptionMapper.class; if you want that one too you should use {@link #add(Mappers)}
     * @return this is the Builder design pattern so it will return the current instance of Class it self
     */
    public MapperBuilder all() {
        mapperClasses = new ArrayList<>(
            Arrays.asList(
                AlreadyExistExceptionMapper.class,
                BadRequestExceptionMapper.class,
                ConstraintViolationExceptionMapper.class,
                EmptyExceptionMapper.class,
                ForbiddenExceptionMapper.class,
                GoneExceptionMapper.class,
                InvalidFormatExceptionMapper.class,
                JsonMappingExceptionMapper.class,
                ParamExceptionMapper.class,
                UnauthorizedExceptionMapper.class,
                UnavailableExceptionMapper.class,
                UnrecognizedPropertyExceptionMapper.class,
                WebApplicationExceptionMapper.class
            )
        );

        return this;
    }

    /**
     * this method will return the list of classes you've selected
     * if there there is no classes in list, it will run {@link #all()} and then return the result list
     * @return list of mapper classes
     */
    public List<Class> fetch() {
        if (mapperClasses.isEmpty()) {
            mapperClasses = all().fetch();
        }

        return this.mapperClasses;
    }
}
