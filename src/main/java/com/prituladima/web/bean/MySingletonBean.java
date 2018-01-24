package com.prituladima.web.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MySingletonBean {


    @Autowired
    @Qualifier("basic-service-b")
    private MyService myService;


    @PostConstruct
    public void init() {
        System.out.println("initializing " +
                this.getClass().getSimpleName() + "and bonus " + myService.getMessage());

    }
}