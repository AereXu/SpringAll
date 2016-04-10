//package com.aere.spring.all.config;
//
//import com.aere.spring.all.restful.endpoints.GreetingEndpoint;
//import org.glassfish.jersey.server.ResourceConfig;
//import org.springframework.stereotype.Component;
//
//import javax.ws.rs.ApplicationPath;
//
///**
// * Note: Do not use @Component for Restful resources, because we want Jersey to manage them.
// * Otherwise, Tomcat will complain that:
// * None or multiple beans found in Spring context for type class XXX, skipping the type
// */
////@ApplicationPath("/*")
//
//public class JerseyConfig extends ResourceConfig {
//
//
//    /**
//     * Register JAX-RS application components.
//     */
//
//    public JerseyConfig() {
////        register(GreetingEndpoint.class);
////        packages("com.aere.spring.all.restful");
//    }
//
//
//}
