package com.jamesonli.cftest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(value = "/api/v1/hello", produces = {APPLICATION_JSON_VALUE})
public class Hello {
    private static final Logger logger = LoggerFactory.getLogger(Hello.class);

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public HelloDto sayHello() {
        HelloDto response = new HelloDto();
        response.message = "Hello";

        return response;
    }
}
