package com.da.dao;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/12
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public  void getUser(){
        System.out.println("Mysql获取用户数据");
    }
}
