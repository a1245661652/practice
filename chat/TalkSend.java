package com.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * @author wu
 * @date 2021/2/3 - 0:26
 */
public class TalkSend implements Runnable {
        DatagramSocket socket = null;
        BufferedReader reader = null;
        private int fromPort;
        private String toip;
        private int toport;



        public TalkSend(int fromPort, String toip, int toport) {
        this.fromPort = fromPort;
        this.toip = toip;
        this.toport = toport;

        try {
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        }catch (Exception e){
            e.printStackTrace();

        }

       }

    @Override
        public void run(){

            //准备数据：控制台读取
        try {
            while (true){
                String data =reader.readLine();
                byte[] datas = data.getBytes();
                DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress(this.toip,this.toport));
                socket.send(packet);
                if (data.equals("bye")){
                    break;
                }

            }

        }catch(Exception e){
            e.printStackTrace();

        }


            socket.close();



    }
}
