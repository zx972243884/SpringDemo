package aop;

import org.springframework.stereotype.Component;

@Component(value = "landlord")
public class Landlord {

    public void service(){
        // 仅仅只是实现了核心的业务功能
        System.out.println("签合同");
        System.out.println("收房租");
    }
}
