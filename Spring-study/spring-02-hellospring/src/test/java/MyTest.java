import com.da.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/12
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象！
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中的管理了，我们要使用，直接去里面取出来就可以！
        Hello hello = (Hello) Context.getBean("hello");
        System.out.println(hello.toString());
    }
}
