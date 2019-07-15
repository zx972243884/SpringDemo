package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect //切面
public class Broker {

//    @Pointcut("execution(* aop.Landlord.service())")
//    public void imain()
//    {
//
//    }
//
//    @Before("imain()")
//    public void before(){
//        System.out.println("带租客看房");
//        System.out.println("谈价格");
//    }
//
//    @After("imain()")
//    public void after(){
//        System.out.println("交钥匙");
//    }

    @Around("execution(* aop.Landlord.service())")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("带租客看房");
        System.out.println("谈价格");

        joinPoint.proceed();

        System.out.println("交钥匙");
    }
}
