package com.guhao.learn.chapter7;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-12-16 16:02
 * @Description
 **/
public class Demo02 {
    public static void main(String[] args) {
        Stream.of("a","b","1","2")
                .peek(v -> System.out.println(v+"--"+(byte)v.charAt(0)))
                .sorted(String::compareTo)
                .forEach(System.out::println);


        Set<String> collect = Stream.of("1", "2", "3", "4").unordered()
                .limit(3).collect(Collectors.toSet());

        System.out.println(collect);

    }
}
