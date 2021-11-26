package injection;

import domain.User;
import domain.UserHolder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Author yujt
 * @Date 2021/11/21 22:18
 * @Version 1.0
 */
public class XmlDependencyInjectionDemo {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);

        String location = "MEAT-INF/dependency-injection-context.xml";
        reader.loadBeanDefinitions(location);

        UserHolder user = defaultListableBeanFactory.getBean(UserHolder.class);
        System.out.println(user);
    }
}
