package threadtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wu
 * @version 1.0
 * @date 2021/1/23
 * 线程不安全的集合
 */
public class UnsafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <5000 ; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();

        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
