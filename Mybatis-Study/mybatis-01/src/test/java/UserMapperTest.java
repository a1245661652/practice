import com.da.dao.UserMapper;
import com.da.pojo.User;
import com.da.utils.MybatisUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wu
 * @version 1.0
 * @date 2021/3/31
 */
public class UserMapperTest {
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

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("慢");
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();

    }

    @Test
    public void gerUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        User user = usermapper.getUserById(4);
        System.out.println(user);
        sqlSession.close();

    }
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("password","111111");
        map.put("username","慢坡");
        List<User> userList = mapper.getUserById2(map);
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
    //增删改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.addUser(new User(4, "新", "123789"));
        if (i>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("userid",9);
        map.put("username","慢坡");
        map.put("password","111111");
        mapper.addUser2(map);
        map.put("userid",8);
        map.put("username","慢坡2");
        map.put("password","222222");
        mapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        int i = usermapper.updateUser(new User(4, "二新", "123456"));
        if (i>0){
            System.out.println(i+",修改成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(4);
        if (i>0) {
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
