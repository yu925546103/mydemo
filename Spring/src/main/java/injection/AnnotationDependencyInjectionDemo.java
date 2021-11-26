package injection;

import bean.AnnotationBeanLoadDemo;
import domain.SuperUser;
import domain.User;
import domain.UserHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author yujt
 * @Date 2021/11/21 22:32
 * @Version 1.0
 */

public class AnnotationDependencyInjectionDemo {

    @Autowired
    private UserHolder userHolder;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AnnotationDependencyInjectionDemo.class);

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(applicationContext);

        String location = "MEAT-INF/dependency-lookup-context.xml";
        reader.loadBeanDefinitions(location);

        // 启动上下文
        applicationContext.refresh();

        AnnotationDependencyInjectionDemo demo = applicationContext.getBean(AnnotationDependencyInjectionDemo.class);

        UserHolder userHolder = demo.userHolder;
        System.out.println(userHolder);

        // 显示关闭
        applicationContext.close();
    }

    @Bean
    public UserHolder userHolder(SuperUser user) {
        return new UserHolder(user);
    }
}
