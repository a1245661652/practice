package com.da.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @author wu
 * @version 1.0
 * @date 2021/3/27
 */
public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //服务器，告诉你，你来的时间，把这个时间封装成一个信件，你带来，我就知道你来了

        //解决中文乱码
        resp.setContentType("text/html; charset=GBK");

        PrintWriter out = resp.getWriter();

        //Cookie 服务器端从客户端获取
        Cookie[] cookies = req.getCookies();

        //判断cookies 是否存在

        if(cookies!=null){
                out.write("你上一次访问的时间是");
                for (int i = 0; i < cookies.length; i++) {
                    Cookie cookie = cookies[i];
                if(cookie.getName().equals("lastLoginTime")){
                    long lastLoginTime = Long.parseLong(cookie.getValue());
                    Date date = new Date(lastLoginTime);
                    out.write(date.toLocaleString());
                }


            }
        }else{
            out.write("第一次来吧小哥");
        }
        Cookie cookie = new Cookie("lastLoginTime",System.currentTimeMillis()+"");
        cookie.setMaxAge(24*60*60);
        resp.addCookie(cookie);
        resp.setContentType("text/html; charset=GBK");



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
