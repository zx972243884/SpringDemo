package aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("AopApplicationContext.xml");
        Landlord landlord = (Landlord)context.getBean("landlord",Landlord.class);
        landlord.service();
    }
}
