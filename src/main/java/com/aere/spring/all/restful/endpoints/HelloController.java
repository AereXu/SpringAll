package com.aere.spring.all.restful.endpoints;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping(path = "/hello",produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.put("title", "Spring");
        model.put("msg", "Hello!");

        return "index";
    }

    @RequestMapping(path = "/hello/{name:.+}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {

        ModelAndView model = new ModelAndView();
        model.setViewName("index");

        model.addObject("title", name);
        model.addObject("msg", "msg" + name);

        return model;
    }
}

