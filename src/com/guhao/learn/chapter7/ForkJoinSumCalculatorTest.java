package com.guhao.learn.chapter7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * @Author guhao
 * @DateTime 2019-12-30 9:21
 * @Description
 **/
public class ForkJoinSumCalculatorTest {

    public static void main(String[] args) {
        long result = forkJoinSum(100000);
        System.out.println(result);
    }

    public static long forkJoinSum(long n) {
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        return new ForkJoinPool().invoke(task);
    }

}
