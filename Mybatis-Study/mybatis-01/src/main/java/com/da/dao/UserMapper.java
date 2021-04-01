package com.da.dao;

import com.da.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author wu
 * @version 1.0
 * @date 2021/3/31
 */
public interface UserMapper {
    List<User> getUserLike(String value);
    List<User> getUserList();
    //根据ID查询用户
    User getUserById(int id);
    List<User> getUserById2(Map<String,Object> map);
    //insert 一个用户
    int addUser(User user);
    int addUser2(Map<String,Object> map);
    //修改用户
    int updateUser(User user);
    //删除一个用户
    int deleteUser(int id);

}
