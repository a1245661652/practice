import com.da.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/13
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());

    }
}
