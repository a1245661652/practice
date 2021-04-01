package com.da.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

/**
 * @author wu
 * @version 1.0
 * @date 2021/3/27
 */
public class CookieDemo03 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=GBK");

        PrintWriter out = resp.getWriter();
        //Cookie 服务器端从客户端获取
        Cookie[] cookies = req.getCookies();

        //判断cookies 是否存在

        if(cookies!=null){
            out.write("你上一次访问的时间是");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if(cookie.getName().equals("name")){
                    out.write(URLDecoder.decode(cookie.getValue(),"utf-8"));
                }


            }
        }else{
            out.write("第一次来吧小哥");
        }
        Cookie cookie = new Cookie("name", URLEncoder.encode("吴","utf-8"));
        resp.addCookie(cookie);
        resp.setContentType("text/html; charset=GBK");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
