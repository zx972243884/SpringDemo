package role;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="roleSer")
public class RoleService implements IRoleService {

    //自动装配
    @Autowired
    private RoleModel roleModel = null;

    public void getRoleModel(RoleModel roleModel){
        this.roleModel = roleModel;
    }

    @Override
    public void RoleName() {
        System.out.println("测试注解装配");
        System.out.println("RoleName:"+this.roleModel.RoleName);
        this.roleModel.GetRoleInfo();
    }
}
