package com.ioc.demo;

import org.apache.ibatis.annotations.ConstructorArgs;

public class Demo1 {

    public Demo1(){
        System.out.println("构造方法");
    }

    public void Say(){
        System.out.println("你好");
    }
}
