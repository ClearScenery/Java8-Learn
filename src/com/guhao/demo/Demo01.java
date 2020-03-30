package com.guhao.demo;


import sun.misc.Signal;
import sun.misc.SignalHandler;

/**
 * @Author guhao
 * @DateTime 2020-01-15 13:11
 * @Description
 **/
public class Demo01 {
    public static void main(String[] args) {
        Signal.handle(new Signal("INT"),new SignalHandler() {
            @Override
            public void handle(Signal signal) {
                System.out.println(signal.getName() + "catched");
            }
        });
        while(true){
            try {
                Thread.sleep(2000);
                System.out.println(123);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
