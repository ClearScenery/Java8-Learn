package com.guhao.learn.chapter6;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-12-05 13:11
 * @Description
 **/
public class Demo02 {
    public static void main(String[] args) {
        Integer sum = Stream.of(1, 2, 3, 4).collect(Collectors.summingInt(Integer::valueOf));
        System.out.println(sum);

        Double average = Stream.of(1, 2, 3, 4).collect(Collectors.averagingInt(Integer::valueOf));
        System.out.println(average);

        Optional<Integer> max = Stream.of(1, 2, 3, 4).collect(Collectors.maxBy(Comparator.comparing(Integer::valueOf)));
        System.out.println(max.get());


        Optional<Integer> min = Stream.of(1, 2, 3, 4).collect(Collectors.maxBy(Comparator.comparing(Integer::valueOf)));
        System.out.println(min.get());

        Long cCount = Stream.of(1, 2, 3, 4).collect(Collectors.counting());
        System.out.println(cCount);

        long count = Stream.of(1, 2, 3, 4).count();
        System.out.println(count);

        //一次操作取到所有结果
        IntSummaryStatistics collect = Stream.of(1, 2, 3, 4).collect(Collectors.summarizingInt(Integer::valueOf));
        System.out.println(collect.getCount());
        System.out.println(collect.getAverage());
        System.out.println(collect.getMax());
        System.out.println(collect.getMin());
        System.out.println(collect.getSum());
    }
}
