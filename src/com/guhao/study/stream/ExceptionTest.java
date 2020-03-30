package com.guhao.study.stream;

import java.io.*;

/**
 * @Author guhao
 * @DateTime 2019-10-24 13:29
 * @Description
 **/
public class ExceptionTest {
  
    public static void main(String[] args) {

    }

    public void test(){
        try {
            FileInputStream aa = new FileInputStream("aa");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


class GlobalException extends Exception {
    public GlobalException(String msg){
        super(msg);
    }
}
