package com.prituladima.web.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Component2 extends BaseComponent{


    @Autowired
    Component3 component2;

    @PostConstruct
    public void onInit(){
        super.onInit();
    }

}

