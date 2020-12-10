package com.ThreeDayPractice03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wu
 * @date 2020/12/9 - 23:19
 *
 *结论：
 * 1.对于文本文件(.txt,.java,.c,.cpp),使用字节流处理
 * 2.对于非文本文件(.jpg,.mp3.mp4,.avi,.doc,.ppt,....),使用字节流处理
 *
 *
 *
 *
 *
 */
public class FileInputOutputStreamTest {
        //  testFileInputStream
    public static void main (String[] args)  {
        //1.造文件
        FileInputStream fis = null;
        try {
            File file = new File("D:\\wu\\Moudle1\\src\\02.txt");
            //2.造流
            fis = new FileInputStream(file);

            //3.读数据
            byte[] buffer = new byte[5];
            //记录每次读取的字节的个数
            int len;
            while ((len = fis.read(buffer)) != -1 )
            {
                String str = new String(buffer,0,len);
                System.out.printf(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (fis != null)
            {
                fis.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
