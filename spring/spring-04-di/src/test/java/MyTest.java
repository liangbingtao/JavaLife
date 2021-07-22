import com.neo.pojo.Student;
import com.neo.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description Author neo
 * Date 2021/1/24 20:57
 */
public class MyTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        /**
         * Student{
         * name='梁兵涛',
         * address=Address{address='西安'},
         * books=[红楼梦, 西游记, 三国演义, 水浒传],
         * hobbies=[听歌, 敲代码],
         * card={身份证=123456789, 学生证=19207205041},
         * games=[LOL, COC],
         * info={age=24, name=梁兵涛, gender=男},
         * wife='null'}
         */

    }


    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);

    }
}
