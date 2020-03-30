package com.guhao.learn.chapter6;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-12-05 10:39
 * @Description
 **/
public class Demo01 {
    public static void main(String[] args) {
//        Stream.concat()
        Stream.Builder<String> builder = Stream.builder();
        builder.add("1a").add("2b").add("3c").accept("4d");

        List<String> collect = builder.build().collect(Collectors.toList());
        System.out.println(collect);

        Set<String> collect1 = builder.build().collect(Collectors.toSet());
        System.out.println(collect1);
//                .build().collect(Collectors.counting());
//        System.out.println(collect);



    }
}
