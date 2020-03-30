package com.guhao.learn.chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author guhao
 * @DateTime 2019-12-02 8:21
 * @Description
 **/
public class Demo04 {
    public static void main(String[] args) {
        List<Integer> collect = Arrays.asList(1, 4, 3, 5, 2,3).stream().sorted(Integer::compareTo).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = Arrays.asList(1, 4, 3, 5, 2,3).stream().distinct().sorted(Integer::compareTo).collect(Collectors.toList());
        System.out.println(collect1);

        Set<Integer> collect2 = Arrays.asList(1, 4, 3, 5, 2, 3).stream().collect(Collectors.toSet());
        System.out.println(collect2);

        String collect3 = Arrays.asList("1", "2", "3", "4", "5").stream().collect(Collectors.joining());
        System.out.println(collect3);
    }
}
