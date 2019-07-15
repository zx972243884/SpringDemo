package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
//启动AspectJ自动代理
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan(basePackages = {"demo"})
public class UserConfig {
}
