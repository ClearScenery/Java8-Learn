package com.guhao.study.stream;

import java.util.function.BinaryOperator;

/**
 * @Author guhao
 * @DateTime 2019-10-21 15:58
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        /*
              设有n只鸭子
              经过村庄的次数为i，此时i=7
              出口是n = 2    x-(x/2+1) = n   x = (n+1)*2
         */

        int i = 0;
        int n = 2;
        while(i++ < 7){
           n = 2*(n+1);
           System.out.println("经过第"+(7-i+1)+"个村子卖出"+n+"只鸭子");
        }
        System.out.println("一共有"+n+"只鸭子");

    }

//    public void saleDuck(int n){
//
//    }
}
