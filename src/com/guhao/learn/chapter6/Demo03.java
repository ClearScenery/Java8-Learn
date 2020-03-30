package com.guhao.learn.chapter6;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-12-05 13:29
 * @Description
 **/
public class Demo03 {
    public static void main(String[] args) {
        String collect = Stream.of("a", "b", "c").collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
