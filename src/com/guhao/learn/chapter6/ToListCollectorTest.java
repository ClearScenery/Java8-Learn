package com.guhao.learn.chapter6;

import java.util.List;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-12-27 9:40
 * @Description
 **/
public class ToListCollectorTest {
    public static void main(String[] args) {
        List<String> collect = Stream.of("A", "B", "C", "D")
                .collect(new ToListCollector<>());
        System.out.println(collect);
    }
}
