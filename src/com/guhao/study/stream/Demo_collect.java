package com.guhao.study.stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

/**
 * @Author guhao
 * @DateTime 2019-10-18 16:53
 * @Description
 **/
public class Demo_collect {
    public static void main(String[] args) {
        TreeSet treeSet = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);

//        Stream.of(1,2,3,4,5)
//                .forEach((Integer value) -> {
//                    System.out.println(value);
//                });

        Optional<Integer> collect1 = Stream.of(1, 2, 3, 4, 5)
                .collect(maxBy(Comparator.comparing(value -> value)));

        System.out.println(collect1.get());


        Optional<Integer> collect2 = Stream.of(1, 2, 3, 4, 5)
                .collect(minBy(Comparator.comparing(value -> value)));

        System.out.println(collect2.get());

    }
}
