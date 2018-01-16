package com.jamesonli.cftest;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@JsonInclude(JsonInclude.Include.ALWAYS)
public class HelloDto {
    public String message;
}
