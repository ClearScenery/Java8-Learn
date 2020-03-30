package com.guhao.test;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author guhao
 * @DateTime 2019-12-09 15:53
 * @Description
 **/
public class JsonAction {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(9999));
            Socket socket = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            StringBuffer result = new StringBuffer();
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                result.append(line);
            }
            System.out.println(result.toString());
            JSONObject json = new JSONObject(result.toString());
            System.out.println(json.get("fromLev"));
            Class<History> clazz = History.class;
            History history = clazz.newInstance();
            Field[] declaredFields = clazz.getDeclaredFields();
            Method[] declaredMethods = clazz.getDeclaredMethods();
            for (Field declaredField : declaredFields) {
                declaredField.setAccessible(true);
                String fieldName = declaredField.getName();
                String str = (String) json.get(fieldName);
                System.out.println(str);
                for (Method declaredMethod : declaredMethods) {
                    String lowerCaseMethodName = declaredMethod.getName().toLowerCase();
                    if(lowerCaseMethodName.equals("set"+fieldName.toLowerCase())){
                            declaredMethod.invoke(history,str);
                    }
                }
            }
            System.out.println("history:"+history);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
