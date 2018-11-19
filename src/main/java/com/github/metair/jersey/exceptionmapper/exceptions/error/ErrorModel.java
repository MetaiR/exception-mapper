package com.github.metair.jersey.exceptionmapper.exceptions.error;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 *
 * @author seyedar
 */
public class ErrorModel {

    @JsonProperty(ErrorMapping.ERROR_TYPE)
    private Short type;
    @JsonProperty(ErrorMapping.ERROR_TEXT)
    private String text;
    @JsonProperty(ErrorMapping.ERROR_DATA)
    private List<String> fields;

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }
}
