package com.prituladima.web.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.prituladima.web.bean2")
public class AppConfig2 {

    public static void main(String[] args) {
        System.out.println("---- Spring DI is starting!!! ----");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig2.class);
        System.out.println("---- Spring DI has done!!! ----");
    }

}
