import com.da.dao.TeacherMapper;
import com.da.pojo.Teacher;
import com.da.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/9
 */
public class MyTest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public  void getTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);
        System.out.println(teacher2);
        sqlSession.close();
    }
}
