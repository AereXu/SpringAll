package com.aere.spring.all.restful.endpoints;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping(path = "/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}

