package com.guhao.learn.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @Author guhao
 * @DateTime 2019-11-22 10:08
 * @Description
 **/
public class Demo01 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("1","2","3","3","4");
        List<Integer> collect = str.stream().mapToInt(Integer::valueOf).boxed().limit(2).collect(toList());
        System.out.println(collect);

        long count = str.stream().mapToInt(Integer::valueOf).boxed().limit(2).count();
        System.out.println(count);

        List<Integer> collect1 = str.stream().mapToInt(Integer::valueOf).boxed().skip(2).collect(toList());
        System.out.println(collect1);

        List<Integer> collect2 = str.stream().map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(collect2);

        List<Integer> collect3 = str.stream().map(Integer::valueOf).distinct().collect(Collectors.toList());
        System.out.println(collect3);
    }
}
