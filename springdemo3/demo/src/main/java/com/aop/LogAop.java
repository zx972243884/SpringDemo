package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//开启AspectJ 自动代理模式,如果不填proxyTargetClass=true，默认为false，
@Component
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class LogAop {

    @Pointcut("execution(* com.service..*(..))")
    public void log(){

    }

    @Before("log()")
    public void Start(){
        System.out.println("开始记录日志。。。");
    }

    @After("log()")
    public void End(){
        System.out.println("结束记录日志。。。");
    }
}
