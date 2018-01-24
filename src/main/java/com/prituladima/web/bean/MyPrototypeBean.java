package com.prituladima.web.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyPrototypeBean {

    @Autowired
    @Qualifier("basic-service")
    private MyService myService;

    @PostConstruct
    public void init() {
        System.out.println("initializing " +
                this.getClass().getSimpleName() + "and bonus " + myService.getMessage());

    }

    public void doSomething(){
        System.out.println(myService.getMessage());
    }
}
