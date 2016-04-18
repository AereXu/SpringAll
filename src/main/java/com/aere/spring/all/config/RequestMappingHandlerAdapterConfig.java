package com.aere.spring.all.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

/**
 * Created by AereXu on 2016/4/17.
 */
@Configuration
public class RequestMappingHandlerAdapterConfig{

    @Autowired
    RequestMappingHandlerAdapter  requestMappingHandlerAdapter;

    @Bean
    public MappingJackson2HttpMessageConverter jsonConverter(){ // Fix get application/json will response 406
        MappingJackson2HttpMessageConverter json2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        requestMappingHandlerAdapter.getMessageConverters().add(json2HttpMessageConverter);
        return json2HttpMessageConverter;
    }

}

//<bean class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter">
//<property name="messageConverters">
//<list>
//<bean class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter"/>
//<bean class="org.springframework.http.converter.ByteArrayHttpMessageConverter"/>
//<bean class="org.springframework.http.converter.xml.SourceHttpMessageConverter"/>
//<bean class="org.springframework.http.converter.FormHttpMessageConverter"/>
//<bean class="org.springframework.http.converter.StringHttpMessageConverter"/>
//</list>
//</property>
//
//</bean>
