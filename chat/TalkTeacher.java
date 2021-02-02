package com.chat;

/**
 * @author wu
 * @date 2021/2/3 - 1:10
 */
public class TalkTeacher {
    public static void main(String[] args) {

        new Thread(new TalkSend(3456,"localhost",9877)).start();
        new Thread(new TalkReceive(6666,"学生")).start();
    }
}
