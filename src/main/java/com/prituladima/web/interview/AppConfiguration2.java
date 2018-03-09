package com.prituladima.web.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by prituladima on 3/9/18.
 */
@Configuration
@ComponentScan({"com.prituladima.web.interview"})
@PropertySource("application.properties")
public class AppConfiguration2 {

    @Autowired
    ObjectB objectB;

    @Autowired
    ObjectC objectC;

    @Autowired
    ObjectD objectD;

    @Autowired
    ObjectE objectE;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ObjectA getObjectA(){
        return new ObjectA(objectB);
    }

    @Bean
    public ObjectB getObjectB(){
        return new ObjectB(objectC, objectD);
    }

    @Bean
    public ObjectC getObjectC(){
        return new ObjectC(objectE);
    }

    @Bean
    public ObjectD getObjectD(){
        return new ObjectD();
    }

    @Bean
    public ObjectE getObjectE(){
        return new ObjectE();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}