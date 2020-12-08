package com.TowDayPractice02;

import java.io.*;

/**
 * @author wu
 * @date 2020/12/9 - 0:00
 */
public class FileWriter01 {
    public static void main(String[] args) throws IOException {
        /**
         * 1.输出操作，对应的File可以不存在的，并不会报异常.
         * 2.File对应的硬盘中的文件如果不存在，在输出的过程中，会自动创建此文件.
         *   如果存在：
         *   ①如果流使用的构造器是:FileWriter(file,false) /FileWrite(file):对原有文件的覆盖
         *   ②如果流使用的构造器是：FileWriter(file,true) 不会对原有文件覆盖，而是在原有文件基础上追加
         */FileWriter fw = null;
        try {
            //1.提供File类的对象，指明写出到的文件
            File file = new File("D:\\wu\\Moudle1\\src\\02.txt");
            //2.提供FileWriter的对象，用于数据的写出
            fw = new FileWriter(file,true);
            //3.写出的操作
            fw.write("I hava a dream");
            fw.write("you need to have a dream! fighting!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //4.流资源的关闭
        try {
            if (fw != null) {
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        testFileReaderFileWriter();
    }

    public static void testFileReaderFileWriter() throws IOException {
        FileReader fr = null;
        FileWriter fw2 = null;
        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("D:\\wu\\Moudle1\\src\\02.txt");
            File destFile = new File("D:\\wu\\Moudle1\\src\\03.txt");
            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw2 = new FileWriter(destFile);
            //3.数据的读入和写出操作
            char[] cbuf =new char[10];
            int len;//记录每次读入到cbuf数组中的字符的个数
            while((len = fr.read(cbuf)) != -1)
            {   //每次写出len个字符
                fw2.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //4.关闭流资源
        //方式一(流多了，从下往上找流)
        /**

        try {
            if (fw2 != null)
            {
                fw2.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fr != null)
        {
            fr.close();
        }
        }
         *
         */
        //方式二
        try {
            if(fw2!=null)
            {
                fw2.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if(fr!=null)
            {
                fr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
