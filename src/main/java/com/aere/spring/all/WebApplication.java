package com.aere.spring.all;

import com.aere.spring.all.DAO.entity.Phone;
import com.aere.spring.all.DAO.manager.PhoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
//@ComponentScan// It will auto scan package where this file is
public class WebApplication {
//        extends SpringBootServletInitializer {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
//        return applicationBuilder.sources(JerseyWebApplication.class);
//    }

    public static void main(String[] args) {
//        new JerseyWebApplication().configure(new SpringApplicationBuilder(JerseyWebApplication.class)).run(args);
        SpringApplication.run(WebApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(PhoneRepository phoneManager) {
        return (args) ->{
            Phone onePlusePhone = new Phone();
            onePlusePhone.setName("OnePlus");
            onePlusePhone.setStock(1000);
            onePlusePhone.setReleaseDate(new Date());
            phoneManager.save(onePlusePhone);
        };
    }

    // Below is the key registration function
//    @Bean
//    public ServletRegistrationBean jerseyServlet() {
//        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/*");
//        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
//        return registration;
//    }
}
