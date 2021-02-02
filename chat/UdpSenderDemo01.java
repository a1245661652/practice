
package com.chat;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.net.*;
        import java.nio.charset.StandardCharsets;

/**
 * @author wu
 * @date 2021/2/2 - 1:10
 */
public class UdpSenderDemo01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8765);
        //准备数据：控制台读取
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String data =reader.readLine();

            byte[] datas = data.getBytes();
            DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",6666));
            socket.send(packet);
            if (data.equals("bye")){
                break;
            }

        }
        socket.close();
    }
}
