import com.neo.service.UserService;
import com.neo.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description Author neo
 * Date 2021/3/5 11:40
 */
public class MyText {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是接口，
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();

    }
}
