import com.da.dao.UserMapper;
import com.da.pojo.User;
import com.da.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest{
    @Test
    public void selecttest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user:users) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public  void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userByID = mapper.getUserByID(2);
        System.out.println(userByID);
        sqlSession.close();
    }
    @Test
    public void addUser(){
       SqlSession sqlSession= MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int zhujie = mapper.addUser(new User(17, "zhujie","888888"));
        if (zhujie >0) {
            System.out.println("插入成功");
        }
        sqlSession.close();
    }
    @Test
    public  void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(17,"zhujieup","666666"));
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(17);
        if(i>0){
            System.out.println("删除成功");
        }
        sqlSession.close();

    }
}