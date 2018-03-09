package com.prituladima.web.interview;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.prituladima.web.interview"})
@PropertySource("application.properties")
public class AppConfiguration {


    @Bean
//    @Lazy
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ObjectA getObjectA(ObjectB objectB){
        return new ObjectA(objectB);
    }

    @Bean
    public ObjectB getObjectB(ObjectC objectC, ObjectD objectD){
        return new ObjectB(objectC, objectD);
    }

    @Bean
    public ObjectC getObjectC(ObjectE objectE){
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