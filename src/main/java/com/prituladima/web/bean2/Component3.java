package com.prituladima.web.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Component3 extends BaseComponent{


    @Autowired
    Component4 component2;

    @PostConstruct
    public void onInit(){
        super.onInit();
    }


}
