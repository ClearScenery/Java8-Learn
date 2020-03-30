package com.guhao.learn.chapter5;


import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-12-05 10:35
 * @Description
 **/
public class Demo10 {
    public static void main(String[] args) {
        Supplier<int[]> arr = () -> new int[]{1,2,4};
        System.out.println(Arrays.toString(arr.get()));

        Stream.generate(() -> 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
