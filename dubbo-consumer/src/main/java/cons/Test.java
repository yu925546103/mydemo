package cons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author yujt
 * @Date 2022/1/19 18:28
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println("消费者开始启动");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");

        // 启动spring环境
        applicationContext.start();

        // 拿到orderService这个bean
        Consumer bean = applicationContext.getBean(Consumer.class);

        // 调用 测试是否调用了远程接口
        System.out.println(bean.result("111"));
    }
}
