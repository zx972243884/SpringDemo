package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import serivce.ProductService;

public class Test2 {

    @Test
    public void Test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductService prodSer = (ProductService)context.getBean("doSomeService");
        prodSer.doSomeService();

    }
}
