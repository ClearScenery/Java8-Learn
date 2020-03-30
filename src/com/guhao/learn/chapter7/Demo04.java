package com.guhao.learn.chapter7;

/**
 * @Author guhao
 * @DateTime 2019-12-27 14:24
 * @Description
 **/
public class Demo04 {
    public static void main(String[] args) {
        final int a = 1;
        new Thread(()->{
            System.out.println(a);
        }).start();
    }
}
