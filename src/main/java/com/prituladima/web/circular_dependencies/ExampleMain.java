package com.prituladima.web.circular_dependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@ComponentScan(basePackageClasses = ExampleMain.class, useDefaultFilters = false,
        //scan only the nested beans of this class
        includeFilters = {@ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                value = {ExampleMain.BeanB.class, ExampleMain.BeanA.class})})
@Configuration
public class ExampleMain {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ExampleMain.class);
    }

    @Component
    public static class BeanA {
        private final BeanB beanB;
        public BeanA(BeanB b) {
            this.beanB = b;
        }
    }

    @Component
    public static class BeanB {
        private final BeanA beanA;
        public BeanB(BeanA beanA) {
            this.beanA = beanA;
        }
    }
}