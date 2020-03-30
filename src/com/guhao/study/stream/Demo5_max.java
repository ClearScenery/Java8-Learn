package com.guhao.study.stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-10-16 17:23
 * @Description
 **/
public class Demo5_max {
    public static void main(String[] args) {
        Integer maxValue = Stream.of(1, 2, 3, 4, 5, 6)
                .max(Comparator.comparing(value -> value))
                .get();
        System.out.println(maxValue);
    }
}
