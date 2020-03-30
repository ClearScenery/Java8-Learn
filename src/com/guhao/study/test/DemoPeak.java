package com.guhao.study.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * @Author guhao
 * @DateTime 2019-10-31 15:43
 * @Description
 **/
public class DemoPeak {
    public static void main(String[] args) {
        String strs [] = new String[10];

        IntFunction<String> intFunction = v -> v+"";

        Arrays.setAll(strs,intFunction);
//        IntStream.rangeClosed(1,10)
//                .map(i -> i*2)
//                .filter(i -> i > 16)
//                .peek(value -> System.out.println("当前值："+value))
//                .collect();

        Set<String> collect = Arrays.stream(strs).map(i -> i + 2)
                .peek(value -> System.out.println("a:" + value))
                .collect(toSet());

        System.out.println(Arrays.toString(collect.toArray()));


        List<String> collect2 = Arrays.stream(strs).map(i -> i + 2)
                .peek(value -> System.out.println("a:" + value))
                .collect(toList());

        System.out.println(Arrays.toString(collect2.toArray()));


    }
}
