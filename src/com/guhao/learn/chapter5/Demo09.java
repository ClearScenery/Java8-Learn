package com.guhao.learn.chapter5;

import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-12-05 10:10
 * @Description
 **/
public class Demo09 {
    public static void main(String[] args) {
        System.out.println(fibonaciiSum(56));
    }

    public static long fibonaciiSum(long n){
        return Stream.iterate(new long[]{0,1},arr -> new long[]{ arr[1],arr[0]+arr[1] })
                .limit(n)
//                .parallel()
                .map(arr -> arr[0])
                .collect(Collectors.toList())
                .stream()
                .reduce(0L,Long::sum);
    }
}
