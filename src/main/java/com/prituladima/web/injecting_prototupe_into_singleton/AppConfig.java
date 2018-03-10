package com.prituladima.web.injecting_prototupe_into_singleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Created by prituladima on 3/9/18.
 */
@Configuration
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MyPrototypeBean prototypeBean() {
        return new MyPrototypeBean();
    }

    @Bean
    public MySingletonBean singletonBean() {
        return new MySingletonBean();
    }

//    @Bean
//    public ApplicationContext applicationContext(){
//        return  new AnnotationConfigApplicationContext(AppConfig.class);
//    }

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MySingletonBean bean = context.getBean(MySingletonBean.class);
        bean.showMessage();
        Thread.sleep(1000);
        bean = context.getBean(MySingletonBean.class);
        bean.showMessage();
    }
}