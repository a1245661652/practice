package com.da.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author wu
 * @version 1.0
 * @date 2021/3/26
 */
public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.要获取下载文件的路径
        String realPath  = "F:\\work\\javaweb-10-servlet\\servlet-10\\src\\main\\resources\\1.jpg";
        System.out.println("下载文件的路径："+realPath);
        //2.下载的文件名是啥
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        //3.设置想办法让浏览器能够支持（content-Disposition）下载我们需要的东西
        resp.setHeader("Content-Dispositon","attachment;filename="+fileName);
        //4.获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
        //5.创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
        //6.或者outputstream对象
        ServletOutputStream out = resp.getOutputStream();
        //7.将fileoutputStream 流 写入到buffer 缓冲区,使用outputStream将缓冲区中的数据输出到客户端！
        while((len =in.read(buffer))>0){
            out.write(buffer,0,len);
        }

        out.close();
        in.close();







    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
