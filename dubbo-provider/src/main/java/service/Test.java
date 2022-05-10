package service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author yujt
 * @Date 2022/1/19 17:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println("生产者启动成功");
        // 加载spring配置
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo.xml");
        // 启动spring环境
        applicationContext.start();

        // 使程序hang住  不退出
        System.in.read();
    }
}
