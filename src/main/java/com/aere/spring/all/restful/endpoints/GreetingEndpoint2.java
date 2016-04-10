package com.aere.spring.all.restful.endpoints;

import com.aere.spring.all.DAO.entity.Greeting;
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

    @RequestMapping(value = "/greeting2", method = RequestMethod.GET, produces = "application/xml; charset=UTF-8")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_XML)
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
