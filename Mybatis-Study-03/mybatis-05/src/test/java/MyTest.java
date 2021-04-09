import com.da.dao.BlogMapper;
import com.da.pojo.Blog;
import com.da.utils.IDutils;
import com.da.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;


/**
 * @author wu
 * @version 1.0
 * @date 2021/4/9
 */
public class MyTest {
    @Test
    public void addInitBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Java如此简单");
        mapper.addBook(blog);

        sqlSession.close();


    }
}
