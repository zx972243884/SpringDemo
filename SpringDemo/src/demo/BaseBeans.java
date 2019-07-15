package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseBeans {

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    ApplicationContext context;

    private String beanXmlName;

    public BaseBeans(){

    }

    public BaseBeans(String beanXmlName){
        this.beanXmlName = beanXmlName;
    }

    private void GetApplicationContext(){
        this.context = new ClassPathXmlApplicationContext(beanXmlName);
    }

//    public Object GetBean(String beanName){
//        Object bean = this.context.getBean(beanName);
//        return bean;
//    }

    public <T> T GetBean(String beanName){
        T t = (T)this.context.getBean(beanName);
        return t;
    }
}
