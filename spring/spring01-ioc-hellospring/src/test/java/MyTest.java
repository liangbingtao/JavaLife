import com.neo.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Description Author neo
 * Date 2021/1/23 15:58
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象都在Spring中管理了，我们要使用，直接去里边取出来就可以了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);

    }
}
