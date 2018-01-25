package com.prituladima.web.circular_dependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@ComponentScan(basePackageClasses = ExampleMainFix1.class, useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                value = {ExampleMainFix1.BeanA.class, ExampleMainFix1.BeanB.class})})
@Configuration
public class ExampleMainFix1 {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        ExampleMainFix1.class);
//        BeanA beanA = context.getBean(BeanA.class);
//        beanA.doSomething();
    }

    @Component
    static class BeanB {
        private BeanA beanA;
        public BeanB() {
        }

        public void setBeanA(BeanA beanA) {
            this.beanA = beanA;
        }


        @PostConstruct
        public void postCon(){
            System.out.println("B");
        }
    }

    @Component
    static class BeanA {
        private BeanB beanB;
        public BeanA() {
        }

        public void setB(BeanB b) {
            this.beanB = b;
        }

        public void doSomething() {
            System.out.println("doing something");
        }

        @PostConstruct
        public void postCon(){
            System.out.println("A");
        }
    }


}