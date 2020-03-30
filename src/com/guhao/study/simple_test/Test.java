package com.guhao.study.simple_test;

/**
 * @Author guhao
 * @DateTime 2019-10-16 15:33
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        String name = "a";
//        name="";   //可以在这里修改那么的值吗？？
        Runnable multiStatement = () -> {
//            name="a";
            System.out.print("hello world"+name);
        };
    }
}
