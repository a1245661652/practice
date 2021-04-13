import com.da.Service.UserServiceImpl;
import com.da.dao.UserDaoMysqlImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/12
 */
public class MyTest {
    public static void main(String[] args) {

        //获取ApplicationContext;
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //容器在手，天下我有，需要什么，就直接get什么！
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

    }
}
