import com.da.pojo.User;
import com.da.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.Beans;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/13
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml","applicationContext.xml");
        UserT user2 = Context.getBean("u3", UserT.class);
        user2.show();
    }
}
