package com.aere.spring.all.restful.endpoints;

import com.aere.spring.all.config.MQConfigAdmin;
import com.aere.spring.all.config.MQConfigProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AereXu on 2016/5/23.
 */
@RestController
public class MQController {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @RequestMapping(path = "/message/{name}", method = RequestMethod.GET)
    public String sendRabbitMQMessage(@PathVariable("name") String name){
        rabbitTemplate.convertAndSend(MQConfigAdmin.exchangeName,"test.done","Message from "+name);
        return "Success";
    }

}
