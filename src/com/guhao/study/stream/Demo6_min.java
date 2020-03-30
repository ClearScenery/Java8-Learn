package com.guhao.study.stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-10-16 17:23
 * @Description
 **/
public class Demo6_min {
    public static void main(String[] args) {
        Integer num = Stream.of(1, 2, 3, 4, 5)
                .min(Comparator.comparing(value -> value)).get();

        System.out.println(num);


    }
}
