package role;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RoleTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(RoleConfig.class);

        IRoleService roleSer = (RoleService)context.getBean("roleSer",RoleService.class);
        roleSer.RoleName();

        System.out.println(context.getBean("testBean"));
    }
}
