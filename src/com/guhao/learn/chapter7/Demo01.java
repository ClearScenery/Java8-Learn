package com.guhao.learn.chapter7;

import com.guhao.study.functional_interface.Function;

/**
 * @Author guhao
 * @DateTime 2019-12-16 13:41
 * @Description
 **/
public class Demo01 {
    public static void main(String[] args) {
        Function<Integer,Integer> add = a -> {
            System.out.println(a);
            System.out.println("lambda:"+Thread.currentThread().getName());
            return a*2;
        };
        System.out.println("main:"+Thread.currentThread().getName());

        Integer result = add.apply(2);

        System.out.println(result);

        System.out.println(System.nanoTime() / 1_000_000);

    }
}
