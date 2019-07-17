package com.service;

import com.entity.UserEntity;
import com.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userSer")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserEntity userEntity;

    @Override
    public void GetUserName() {
        System.out.println(this.userEntity.getUserName());
    }

    @Override
    public void GetUserAge() {
        System.out.println(this.userEntity.getAge());
    }
}
