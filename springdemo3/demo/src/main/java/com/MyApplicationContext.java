package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplicationContext {

    private static ApplicationContext context;

    public static ApplicationContext createAnnotationConfigApplicationContext(Class<?>... annotatedClasses){
        context = new AnnotationConfigApplicationContext(annotatedClasses);
        return context;
    }

    public static <T> T getBean(String beanName){
        return (T) context.getBean(beanName);
    }
}
