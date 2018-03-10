package com.prituladima.web.injecting_prototupe_into_singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by prituladima on 3/9/18.
 */
//@Component
public class MySingletonBean {

    @Autowired
    private ApplicationContext context;

    public void showMessage(){
        MyPrototypeBean myPrototypeBean  = context.getBean(MyPrototypeBean.class);
        System.out.println("Hi, the time is "+ myPrototypeBean.getDateTime());
    }

//    @Lookup
//    public MyPrototypeBean getPrototypeBean(){
//        spring will override this method
//        return null;
//    }
}