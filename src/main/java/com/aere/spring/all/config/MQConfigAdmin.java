package com.aere.spring.all.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by epxpxpx on 5/25/2016.
 */
@Configuration
public class MQConfigAdmin {
    public static final String queueName = "aerexu.queue";
    public static final String exchangeName = "aerexu.exchange";

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("golden-kangaroo.rmq.cloudamqp.com");
        connectionFactory.setUsername("qzovjtxd");
        connectionFactory.setPassword("CPNfRH-JHNGdsdJsU1fb8qncYUMO6X7V");
        connectionFactory.setVirtualHost("qzovjtxd");
        return connectionFactory;
    }

    @Bean
    public RabbitAdmin rabbitAdmin() {
        RabbitAdmin admin =  new RabbitAdmin(connectionFactory());
//        admin.declareQueue(queue());
//        admin.declareExchange(topicExchange());
//        admin.declareBinding(BindingBuilder.bind(queue()).to(topicExchange()).with("test.*"));
//        admin.afterPropertiesSet();
        return admin;
    }


    @Bean
    public Queue queue() {
        return new Queue(queueName);
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(exchangeName);
    }

    @Bean
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(topicExchange()).with("test.*");
    }


}
