package com.aere.spring.all.restful.endpoints;

import java.util.concurrent.atomic.AtomicLong;

//@RestController
//@Component
//@Path("/main")
//@Component
//@Path("/greeting")
public class GreetingEndpoint {

    private static final String template = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
////    @Produces(MediaType.APPLICATION_XML)
//    public Greeting greeting() {
//        return new Greeting(counter.incrementAndGet(), String.format(template, "shit"));
//    }

//    @GET
////    @Path("/greeting2")
////    @Produces(MediaType.TEXT_PLAIN)
//    public String greeting2() {
//        return new Greeting(counter.incrementAndGet(), String.format(template, "shit")).toString();
//    }
}
