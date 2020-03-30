package com.guhao.study.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author guhao
 * @DateTime 2019-10-19 22:05
 * @Description
 **/
public class Demo_intstream {
    public static void main(String[] args) {
        IntSummaryStatistics  summaryStatistics = IntStream.range(1, 10)
                .summaryStatistics();

        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getCount());

        System.out.println(Arrays.toString(IntStream.rangeClosed(1,10)
                .toArray()));

//        R collect = IntStream.rangeClosed(1, 10)
//                .collect(Collectors.joining(";"));
    }
}
