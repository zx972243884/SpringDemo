package role;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTester {

    @Bean("testBean")
    public String Test()
    {
        return "测试@Bean注解";
    }
}
