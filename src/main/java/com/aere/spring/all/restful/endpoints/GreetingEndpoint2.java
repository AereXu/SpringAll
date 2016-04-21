package com.aere.spring.all.restful.endpoints;

import com.aere.spring.all.DAO.entity.Greeting;
import com.aere.spring.all.DAO.entity.Phone;
import com.aere.spring.all.DAO.manager.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.DependsOn;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

//@RestController
//@Component
//@Path("/main")

@RestController
public class GreetingEndpoint2 {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private PhoneRepository phoneRepository;

    @RequestMapping(value = "/greeting2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Greeting greeting() {
        return new Greeting(counter.incrementAndGet(), String.format(template, "shit"));
    }

    @RequestMapping(path = "/persist/{name}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Phone persistPhone(@PathVariable("name") String name) {
        Phone phone = new Phone();
        phone.setName(name);
        phone.setReleaseDate(new Date());
        phone.setStock(new Random().nextInt(1000));
        return phoneRepository.save(phone);
    }
//    @GET
////    @Path("/greeting2")
////    @Produces(MediaType.TEXT_PLAIN)
//    public String greeting2() {
//        return new Greeting(counter.incrementAndGet(), String.format(template, "shit")).toString();
//    }
}
