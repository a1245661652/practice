package com.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author wu
 * @date 2021/2/3 - 0:50
 */
public class TalkReceive implements Runnable{


    DatagramSocket socket = null;
    private int port;
    private String msgfrom;

    public TalkReceive(int port,String msgfrom){
        this.msgfrom = msgfrom;
        this.port = port;
        try{
            socket = new DatagramSocket(port);
        }catch(Exception e){
            e.printStackTrace();

        }

    }
    @Override
    public void run() {

        //准备用容器接收包裹
        while(true) {
        try{

            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            socket.receive(packet);//阻塞式接受包裹

            byte[]data = packet.getData();
            String receiveData= new String(data,0,data.length);

            System.out.println(msgfrom+":"+receiveData);

            if (receiveData.equals("bye")){
                break;//断开连接 bye
            }
            }catch(Exception e){
                e.printStackTrace();
            }

        }
            socket.close();

    }
}
