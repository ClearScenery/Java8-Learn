package com.guhao.test;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @Author guhao
 * @DateTime 2019-12-09 16:13
 * @Description
 **/
public class JsonAction2 {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1",9999);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
            History history = new History("张三","C0","李四","C1");
            JSONObject json = new JSONObject(history);
            bufferedWriter.write(json.toString());
            bufferedWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
