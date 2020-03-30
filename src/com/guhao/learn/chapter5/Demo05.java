package com.guhao.learn.chapter5;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-12-02 8:44
 * @Description
 **/
public class Demo05 {
    public static void main(String[] args) {
        IntStream intStream = Arrays.asList("1", "2", "3", "4", "5").stream().mapToInt(Integer::valueOf);
//        Stream<Integer> boxed = intStream.boxed();//加上此句，下面会报错，因为上面的流已经被boxed消耗了

        OptionalInt max = intStream.max();
        int i = max.orElse(1);
        System.out.println(i);
    }
}
