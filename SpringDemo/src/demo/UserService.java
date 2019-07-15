package demo;

import org.springframework.stereotype.Component;

@Component(value = "userSer")
public class UserService implements IUserService {

    @Override
    public void Say(String str) {
        System.out.println("str = [" + str + "]");
    }
}
