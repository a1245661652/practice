package threadtest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author wu
 * @version 1.0
 * @date 2021/1/28
 * 回顾总结多线程的创建
 */
public class ThreadNew {
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRunnable()).start();
        FutureTask<Integer> ft = new FutureTask<Integer>(new MyCallable());
        new Thread(ft).start();
        try{
            Integer integer = ft.get();
        }catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }

    }
}


//1.继承Thread类
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("继承Thread");
    }
}



//2.实现Runnable接口
class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("实现Runnable");
    }
}


//3.实现Callable接口
class MyCallable implements Callable {
    @Override
    public Integer call() throws Exception{
        System.out.println("实现Callable");
        return 66;
    }
}