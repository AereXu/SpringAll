//package com.aere.spring.all.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import javax.sql.DataSource;
//
///**
// * Created by AereXu on 2016/4/19.
// */
//@Configuration
//@MapperScan("com.concretepage.mapper")
//@PropertySource(value = {"classpath:/application.properties",
//        "file:/C:\\Users\\AereXu\\OneDrive\\Workplace\\config\\SpringAll\\daasource.properties"},
//        ignoreResourceNotFound = true)
//public class DAOConfig {
//    private static final String PROPERTY_NAME_DATABASE_DRIVER = "datasource.driver-class-name";
//    private static final String PROPERTY_NAME_DATABASE_URL = "datasource.url";
//    private static final String PROPERTY_NAME_DATABASE_USERNAME = "datasource.username";
//    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "datasource.password";
//
//    @Autowired
//    private Environment env;
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//        dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
//        dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
//        dataSource.setUsername(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
//        dataSource.setPassword(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
//
//        return dataSource;
//    }
//
//    @Bean
//    @Autowired
//    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean
//    @Autowired
//    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        return sessionFactory.getObject();
//    }
//}
