package com.prituladima.web.app;

import com.prituladima.web.bean.MyPrototypeBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.prituladima.web.bean")
public class AppConfig {

    public static void main(String... strings) {
//        System.out.println("---------- DIVIDER -----------");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Spring container started and is ready");
//        MyPrototypeBean bean = context.getBean(MyPrototypeBean.class);
//        bean.doSomething();
//
//        System.out.println("---------- DIVIDER -----------");
//
//        AnnotationConfigApplicationContext context1 =
//                new AnnotationConfigApplicationContext(AppConfig.class);
//        System.out.println("Spring container started and is ready");
//        MyPrototypeBean bean1 = context1.getBean(MyPrototypeBean.class);
//        bean1.doSomething();
//        System.out.println("---------- DIVIDER -----------");
    }
}
