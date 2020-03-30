package com.guhao.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-10-16 16:08
 * @Description
 **/
public class Demo2_Collect {
    public static void main(String[] args) {

//        .collect(Collectors.toList());是及早求值，非惰性

        List<String> collected = Stream.of("a","b","c")
                .collect(Collectors.toList());

        /*
            Stream 的 of 方法使用一组初始值生成新的 Stream。
            其实就是产生一个stream

            然后collect相当于从stream中把所有值搜集起来，形成一个list
         */

    }
}
