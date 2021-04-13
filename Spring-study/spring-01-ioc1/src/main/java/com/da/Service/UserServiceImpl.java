package com.da.Service;

import com.da.dao.UserDao;
import com.da.dao.UserDaoImpl;
import com.da.dao.UserDaoMysqlImpl;
import com.da.dao.UserDaoOracleImpl;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/12
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao ;
    @Override
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser(){
        userDao.getUser();
    }
}
