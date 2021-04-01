package com.da.test;

import java.sql.*;
import java.util.Date;

/**
 * @author wu
 * @version 1.0
 * @date 2021/3/30
 */
public class TestJdbc2 {

        public static void main(String[] args) throws Exception {
            //配置信息
            String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=utf-8&useSSL=false";
            String username = "root";
            String password = "123456";
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.连接数据库，代表数据库
            Connection connection = DriverManager.getConnection(url,username,password);


            String sql ="insert into users(id,name,password,email,birthday)values(?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,4);
            preparedStatement.setString(2,"赵六");
            preparedStatement.setString(3,"666666");
            preparedStatement.setString(4,"666666@qq.com");
            preparedStatement.setDate(5,new java.sql.Date(new java.util.Date().getTime()));


            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println("插入成功");
            }


            //6.关闭连接，释放资源（先开后关）
            preparedStatement.close();
            connection.close();
        }
    }


