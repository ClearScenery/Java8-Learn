package com.guhao.test;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Author guhao
 * @DateTime 2020-02-12 17:16
 * @Description
 **/
public class Test5 {
    public static void main(String[] args) {
        Supplier<String> send = new Supplier<String>() {
            @Override
            public String get() {
                return "zhangsan";
            }
        };

        Consumer<String> reciv = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };


        reciv.andThen(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("渣男"+s);
            }
        }).accept(send.get());


    }
}
