package role;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "roleModel")
public class RoleModel {

    @Value("管理员")
    public String RoleName;

    public void GetRoleInfo(){
        System.out.println("你好，您是超级管理员");
    }
}
