package com.ioc.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class Demo1Test {

    @Test
    public void say() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
//        Demo1 demo1 = (Demo1) context.getBean("demo1");
//        demo1.Say();

        Demo2 demo2 = (Demo2) context.getBean("demo2");
        System.out.println(demo2);
    }
}