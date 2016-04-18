package com.aere.spring.all.restful.endpoints;

import com.aere.spring.all.DAO.entity.Greeting;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//@RestController
//@Component
//@Path("/main")

@RestController
public class GreetingEndpoint2 {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

    public Greeting greeting() {
        return new Greeting(counter.incrementAndGet(), String.format(template, "shit"));
    }

//    @GET
////    @Path("/greeting2")
////    @Produces(MediaType.TEXT_PLAIN)
//    public String greeting2() {
//        return new Greeting(counter.incrementAndGet(), String.format(template, "shit")).toString();
//    }
}
