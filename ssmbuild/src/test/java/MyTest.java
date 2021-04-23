import com.da.pojo.Books;
import com.da.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/23
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl =(BookService) Context.getBean("BookServiceImpl");
        for (Books books: bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }

    }
}
