package com.da.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wu
 * @version 1.0
 * @date 2021/3/26
 */
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setHeader("Location","F:\\work\\javaweb-10-servlet\\servlet-10\\target\\servlet-10\\WEB-INF\\classes\\com\\da\\servlet\\FileServlet.class");
        //resp.setStatus(302);
        resp.sendRedirect("/downfile");
        System.out.println("使用的重定向");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
