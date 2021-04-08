package com.da.dao;

import com.da.pojo.User;
import org.apache.ibatis.annotations.*;


import java.util.List;

public interface UserMapper{
    @Select("select * from user")
    List<User> getUsers();
    @Select("select * from user where id = #{id}")
    User getUserByID(@Param("id")int id);
    @Insert("insert into user(id,name,pwd)values(#{id},#{name},#{pwd})")
    int addUser(User user);
    @Update("Update user set name=#{name},pwd=#{pwd} where id=#{id}" )
    int updateUser(User user);
    @Delete("Delete from user where id = #{id}")
    int deleteUser(@Param("id") int id);
}