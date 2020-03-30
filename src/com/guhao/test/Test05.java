package com.guhao.test;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Author guhao
 * @DateTime 2020-03-23 14:35
 * @Description
 **/
public class Test05 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.useLambda(shop::print,"hello world");
    }

    static class Shop {

        /**
         * lambda方法引用
         * @param value
         */
        void print(String value){
            System.out.println(value);
        }

       void useLambda(Consumer<String> consumer,String str){
            consumer.accept(str);
       }

    }
}
