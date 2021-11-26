package bean;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Author yujt
 * @Date 2021/11/21 19:18
 * @Version 1.0
 */
public class IocContainerDemo {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);

        String location = "MEAT-INF/dependency-lookup-context.xml";
        int beanNumber = reader.loadBeanDefinitions(location);
        System.out.println(beanNumber);
    }
}
