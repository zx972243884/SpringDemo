package com.service;

import com.MyApplicationContext;
import com.iservice.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    @Test
    public void getUserName() {
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(ServiceConfig.class);
//        IUserService userSer = (UserServiceImpl)context.getBean("userSer");
//        userSer.GetUserName();
//        userSer.GetUserAge();

        MyApplicationContext.createAnnotationConfigApplicationContext(ServiceConfig.class);
        IUserService userSer = MyApplicationContext.<UserServiceImpl>getBean("userSer");
        userSer.GetUserName();
        userSer.GetUserAge();
    }

    @Test
    public void getUserAge() {
    }
}