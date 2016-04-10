//package com.aere.spring.all.config.jpa;
//
//import org.hibernate.ejb.HibernatePersistence;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate5.HibernateExceptionTranslator;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.annotation.Resource;
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//@ComponentScan
//@EnableTransactionManagement
////@PropertySource("classpath:application.properties")
//@PropertySource("file:/C:\\Users\\AereXu\\OneDrive\\Workplace\\config\\SpringAll\\1")
//@EnableJpaRepositories("com.aere.spring.all.DAO.manager")
//public class PersistenceJPAConfig {
//    private static final String PROPERTY_NAME_DATABASE_DRIVER = "datasource.driver-class-name";
//    private static final String PROPERTY_NAME_DATABASE_URL = "datasource.url";
//    private static final String PROPERTY_NAME_DATABASE_USERNAME = "datasource.username";
//    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "datasource.password";
//
//    // These three names must be exactly right. More properties please refer to hibernate document
//    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
//    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show-sql";
//    private static final String PROPERTY_NAME_HIBERNATE_DDL_AUTO = "hibernate.hbm2ddl.auto";
////    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";
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
////    @Lazy
//    @Autowired
//    public LocalContainerEntityManagerFactoryBean  entityManagerFactory(DataSource dataSource) {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        entityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
//        entityManagerFactoryBean.setDataSource(dataSource);
////        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistence.class);
//        entityManagerFactoryBean.setPersistenceUnitName("Postgresql");
//        entityManagerFactoryBean.setPackagesToScan("com.aere.spring.all.DAO.entity");
//
//        entityManagerFactoryBean.setJpaProperties(hibProperties());
//        entityManagerFactoryBean.afterPropertiesSet();
//        return entityManagerFactoryBean;
//    }
//
//    private Properties hibProperties() {
//        Properties properties = new Properties();
//        properties.put(PROPERTY_NAME_HIBERNATE_DIALECT,	env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
//        properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
//        properties.put(PROPERTY_NAME_HIBERNATE_DDL_AUTO, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DDL_AUTO));
//        return properties;
//    }
//
//    @Bean
//    @Autowired
//    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory);
//        return transactionManager;
//    }
//
//    @Bean
//    public HibernateExceptionTranslator hibernateExceptionTranslator() {
//        return new HibernateExceptionTranslator();
//    }
//}
