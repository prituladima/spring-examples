package com.prituladima.web.qualifaer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    public OrderService orderService(@QualifA Dao dao) {
        return new OrderService(dao);
    }


    @QualifA
    @Bean
    public Dao daoA() {
        return new DaoA();
    }


    @QualifB
    @Bean
    public Dao daoB() {
        return new DaoB();
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder("122");

    }
}
