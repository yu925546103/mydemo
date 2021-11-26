package bean;

import annotation.Super;
import domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @Author yujt
 * @Date 2021/11/13 10:49
 * @Version 1.0
 */
public class DependencyDemo {
    public static void main(String[] args) {
        // 配置xml文件，启动应用上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/MEAT-INF/dependency-lookup-context.xml");
        // case 1. 实时查找
        User user = (User) beanFactory.getBean("user");
        System.out.println("实时查找" + user.toString());
        // case 2. 延时查找
        ObjectFactory<User> objectFactory = (ObjectFactory<User>) beanFactory.getBean("objectFactory");
        User user2 = objectFactory.getObject();
        System.out.println("延迟查找" + user2.toString());
        // case 3. 按类型查找
        User user3 = beanFactory.getBean(User.class);
        System.out.println("类型查找" + user3.toString());
        // case 4. 集合类型
        ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
        Map<String, User> userMap = listableBeanFactory.getBeansOfType(User.class);
        System.out.println("类型集合" + userMap.toString());
        // case 5. 注解类型
        ListableBeanFactory listableBeanFactory2 = (ListableBeanFactory) beanFactory;
        Map<String, User> userMap2 = (Map)listableBeanFactory2.getBeansWithAnnotation(Super.class);
        System.out.println("类型集合Super" + userMap2.toString());

        System.out.println();
    }


}
