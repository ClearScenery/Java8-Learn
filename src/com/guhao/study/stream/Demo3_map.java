package com.guhao.study.stream;

import java.util.Locale;

import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-10-16 16:18
 * @Description
 **/
public class Demo3_map {
    public static void main(String[] args) {

//         Lambda 表达式必须是 Function 接口的一个实例Function 接口是只包含一个参数的普通函数接口

        Stream.of("a","b","c")
                .map(str -> str.toUpperCase(Locale.ENGLISH))
                .collect(toList());

        /*
        任何时候
        想转化或替代代码，都该使用 map 操作
         */
    }
}
