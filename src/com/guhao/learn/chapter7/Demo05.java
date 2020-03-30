package com.guhao.learn.chapter7;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-12-27 14:55
 * @Description
 **/
public class Demo05 {
    public static void main(String[] args) {
        fibonacci(10);
    }

    public static void fibonacci(int n){
        Stream.iterate(new long[]{0,1},v -> new long[]{v[1],v[0]+v[1]})
                .limit(n)
                .map(v->v[0])
                .forEach(System.out::println);
    }
}
