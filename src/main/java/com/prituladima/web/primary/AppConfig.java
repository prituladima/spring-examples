package com.prituladima.web.primary;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
public class AppConfig {

    @Bean
    public OrderService orderService(Dao dao) {
        return new OrderService(dao);
    }

    @Primary
    @Bean
    public Dao daoA() {
        return new DaoA();
    }


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
