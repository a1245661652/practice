package com.book5;

/**
 * @author wu
 * @date 2021/1/7 - 0:58
 */
public class LamadaDemo
{
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类的形式开启一个线程");

            }
        }).start();
        new Thread(() -> System.out.println("Lambada表达式创建匿名内部类开启一个线程")).start();

    }
}
