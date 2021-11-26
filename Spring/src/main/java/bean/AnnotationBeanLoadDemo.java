package bean;

import annotation.Super;
import domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @Author yujt
 * @Date 2021/11/21 19:31
 * @Version 1.0
 */
@Configuration
public class AnnotationBeanLoadDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AnnotationBeanLoadDemo.class);
        // 启动上下文
        applicationContext.refresh();
        lookUp(applicationContext);
    }

    @Bean
    public User user() {
        User user = new User();
        user.setId(123L);
        user.setName("Yujt");
        return user;
    }

    private static void lookUp(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> userMap2 = (Map)listableBeanFactory.getBeansOfType(User.class);
            System.out.println("类型集合Super" + userMap2);
        }
    }
}
