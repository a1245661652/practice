package com.da.dao;

import com.da.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/7
 */
public interface TeacherMapper {
    //List<Teacher> getTeacher();
    Teacher getTeacher(@Param("tid") int id);
    Teacher getTeacher2(@Param("tid") int id);

    void getTeacher2();
}
