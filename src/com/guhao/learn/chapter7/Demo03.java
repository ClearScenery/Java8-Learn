package com.guhao.learn.chapter7;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-12-27 11:11
 * @Description 、
 **/
public class Demo03 {

    /**
     * 影响并行效率的点
     *  iterate生成的是装箱的对象，必须拆箱成数字才能求和；
     *  我们很难把iterate分成多个独立块来并行执行。
     * @param args
     */
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();

        System.out.println("Sequential sum done in:" +
                demo03.measureSumPerf(ParallelStreams::sequentialSum, 10_000_000) + " msecs");

        System.out.println("Parallel sum done in:" +
                demo03.measureSumPerf(ParallelStreams::parallelSum, 10_000_000) + " msecs");

        System.out.println("Iterative sum done in:" +
                demo03.measureSumPerf(ParallelStreams::iterativeSum, 10_000_000) + " msecs");
    }



    public long measureSumPerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result: " + sum);
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }
}

class ParallelStreams{
    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, Long::sum);
    }

    public static long iterativeSum(long n) {
        long result = 0;
        for (long i = 1L; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }
}