package com.chat;

/**
 * @author wu
 * @date 2021/2/3 - 1:05
 */
public class TalkStudent {
    public static void main(String[] args) {
        //开启两个线程
        new Thread(new TalkSend(8765,"localhost",6666)).start();
        new Thread(new TalkReceive(9877,"老师")).start();
    }

}
