package com.prituladima.web.interview;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        System.out.println("Spring container started and is ready");


        System.out.println(ConfigurableBeanFactory.SCOPE_PROTOTYPE + " check objectA !=");
        ObjectA objectA = context.getBean(ObjectA.class);
        ObjectA objectA1 = context.getBean(ObjectA.class);
        System.out.println(objectA != objectA1);


        System.out.println(ConfigurableBeanFactory.SCOPE_SINGLETON + " check objectB ==");
        ObjectB objectB = context.getBean(ObjectB.class);
        ObjectB objectB1 = context.getBean(ObjectB.class);
        System.out.println(objectB == objectB1);





    }

}
