package role;

import org.springframework.context.annotation.ComponentScan;

//代表进行扫描，默认是扫描当前包的路径，扫描所有带有 @Component 注解的 Role。
@ComponentScan(basePackageClasses = {role.RoleService.class})
public class RoleConfig {
}
