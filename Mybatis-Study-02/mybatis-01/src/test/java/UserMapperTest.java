import com.da.dao.UserMapper;
import com.da.pojo.User;
import com.da.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 * @author wu
 * @version 1.0
 * @date 2021/3/31
 */
public class UserMapperTest {
    static  Logger logger = Logger.getLogger(UserMapperTest.class);
    @Test
    public void test(){

        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();



        for (User user:userList){
            System.out.println(user);
        }
        //关闭SqlSession
        sqlSession.close();
    }


}
