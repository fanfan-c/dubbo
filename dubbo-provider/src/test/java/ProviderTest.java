import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class ProviderTest {
    public static void main(String[] args) {
        System.out.println("provider开始服务了。。。");
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:provider.xml");


        new Scanner(System.in).next();
    }
}
