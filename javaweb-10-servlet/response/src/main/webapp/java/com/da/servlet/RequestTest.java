package com.da.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author wu
 * @version 1.0
 * @date 2021/3/26
 */
public class RequestTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbys =req.getParameterValues("hobbys");
        System.out.println("用户名"+username+";"+"密码"+password+"爱好"+ Arrays.toString(hobbys));
        System.out.println(req.getContextPath());
        req.getRequestDispatcher("/success.jsp").forward(req,resp);
        resp.setCharacterEncoding("utf-8");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
