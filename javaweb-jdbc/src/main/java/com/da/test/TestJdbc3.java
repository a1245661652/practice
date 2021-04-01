package com.da.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author wu
 * @version 1.0
 * @date 2021/3/30
 */
public class TestJdbc3 {
    @Test
    public void test() {

        String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String username = "root";
        String password = "123456";
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(url,username,password);

            connection.setAutoCommit(false);//关闭自动提交，开启事务

            String sql = "update accountbank set money = money-500 where name='wu'";
            connection.prepareStatement(sql).executeUpdate();
            //int i = 1/0;
            String sql2 = "update accountbank set money = money+500 where name='da'";
            connection.prepareStatement(sql2).executeUpdate();

            connection.commit();
            System.out.println("success");
        } catch (Exception e) {
            try {
                connection.rollback();
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
    }
}
