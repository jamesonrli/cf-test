package com.jamesonli.cftest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void sayHello() throws Exception {
        HelloDto body = this.restTemplate.getForObject("/api/v1/hello", HelloDto.class);
        assertThat(body.message, is("Hello"));
    }

}
