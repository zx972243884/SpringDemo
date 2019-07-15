package demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest extends BaseBeans {

    public UserTest(){

    }

    @Test
    public void Test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(LogAop.class);
        IUserService userSer = (UserService)context.getBean("userSer",UserService.class);

        userSer.Say("asdfasdf");
    }
}
