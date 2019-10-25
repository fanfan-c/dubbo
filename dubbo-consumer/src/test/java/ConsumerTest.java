import com._51cto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.findById(1);
        System.out.println("comsumer消费结束。。。");

    }
}
