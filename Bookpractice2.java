package com.Book2;

import java.time.LocalDate;

/**
 * @author wu
 * @date 2020/12/18 - 23:29
 */
public class Bookpractice2 {
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];
        //大坑：无法从静态上下文引用非静态变量方法，解决方法一：将被调用的方法设置为静态，解决办法二：创建对应方法类的对象，通过实例调用.
        staff[0] = new Employee("小白", 45000, 2017, 10, 15);
        staff[1] = new Employee("小蓝", 55000, 2018, 11, 15);
        staff[2] = new Employee("小红", 35000, 2019, 12, 15);
        for (Employee e : staff)
        {
            e.raiseSalary(100.5168461);
        }
        for (Employee e : staff)
        {
            System.out.println("姓名：" + e.getName()+",薪水:"+e.getsalary()+",入职时间"+e.getHireday());
        }
    }
}
     class Employee{
        private String name ;
        private double salary;
        private LocalDate hireday;
         public Employee(String n,double s,int year,int month,int day)
         {
             name = n;
             salary = s;
             hireday = LocalDate.of(year,month,day);

         }
         public String getName()
         {
             return name;
         }

         public LocalDate getHireday()
         {
             return hireday;
         }
         public void raiseSalary(double  x)
         {
             salary =  salary+((x/100)*salary);
         }
         public Double getsalary()
         {
             return salary;
         }
     }


