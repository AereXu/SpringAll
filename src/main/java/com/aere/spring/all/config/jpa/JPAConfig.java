package com.aere.spring.all.config.jpa;

//import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
@ComponentScan
@PropertySource(value = {"classpath:/application.properties",
        "file:/C:\\Users\\AereXu\\OneDrive\\Workplace\\config\\SpringAll\\daasource.properties"},
        ignoreResourceNotFound = true)
public class JPAConfig {
    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    @ConfigurationProperties
    public DataSource dataSource() {
        return new DriverManagerDataSource();
    }
}
