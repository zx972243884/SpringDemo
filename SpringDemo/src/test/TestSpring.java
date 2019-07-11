package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.IUserService;
import pojo.JuiceMaker;
import pojo.Source;
import pojo.UserService;

public class TestSpring {

    private Object UserService;

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Source source = (Source)context.getBean("source");
//        System.out.println("Fruit:" + source.getFruit());
//        System.out.println("Sugar:" + source.getSugar());
//        System.out.println("Size:" + source.getSize());
//
//        JuiceMaker maker = (JuiceMaker)context.getBean("juiceMaker");
//        System.out.println(maker.makeJuice());

        IUserService userSer = (UserService)context.getBean("userSer");
        System.out.println("你好，我叫"+userSer.UserName());
    }

}
