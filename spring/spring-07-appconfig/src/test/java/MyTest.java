import com.neo.config.MyConfig;
import com.neo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description Author neo
 * Date 2021/1/25 15:30
 */
public class MyTest {
    public static void main(String[] args) {

        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfigApplicationContext来获取容器，通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
    }
}
