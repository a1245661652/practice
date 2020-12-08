package com.OneDayPractice01;

import com.sun.jdi.PathSearchingVirtualMachine;
import com.wu.Customer;

import javax.print.StreamPrintServiceFactory;
import java.beans.PropertyVetoException;
import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wu
 * @date 2020/12/7 - 22:32
 */
public class Demo02 {
    //模板一 psvm
    public static void main(String[] args)
    {
        //模板二 sout
        System.out.println();
        //模板二 变形：soutp;soutm;soutv;xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));//args = []
        System.out.println("Demo02.main");
        System.out.println("args = " + args);//args = [Ljava.lang.String;@7b23ec81
        int num = 1;
        //num.sout
        System.out.println(num);
        //模板三：fori
        String[] arr = new String[]{"小明","小强","小花","小兰"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //模板三：变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //变形：lsit.forr 逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }
    public void test()
    {
        //模板五：ifn
        ArrayList list2 =new ArrayList();
        list2.add(123);
        list2.add(456);
        list2.add(789);
        if (list2 == null) {

        }
        //变形：inn
        if (list2 != null) {

        }
        //变形：xxx.nn / xxx.null
        if (list2 != null) {

        }
        /**
         if (list2 == null) {

         }
         *
         */


    }

        //模板六：prsf
        private static final Customer cust = new Customer();//需要添加依赖
        //变形：psf
        public static final int num2 = 1 ;
        //变形：psfi
        public static final int num3 = 1 ;
        //变形：psfs
        public static final String country = "china";



}
