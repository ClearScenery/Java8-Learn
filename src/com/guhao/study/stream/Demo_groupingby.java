package com.guhao.study.stream;

import com.guhao.study.stream.pojo.DB;
import com.guhao.study.stream.pojo.User;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-10-22 10:32
 * @Description
 **/
public class Demo_groupingby {
    public static void main(String[] args) {
        /*
            groupingBy收集器和partitionBy不同的是它可以使用任意值进行分组
         */
        Map<Integer, List<User>> collect = DB.getData().stream().collect(Collectors.groupingBy(User::getAge));
//        System.out.println(collect);

        String collect1 = DB.getData().stream()
                .map(User::getName)
                .collect(Collectors.joining(",", "[", "]"));

//        System.out.println(collect1);

        Map<Boolean, Long> collect2 = DB.getData().stream()
                .collect(Collectors.groupingBy(User::isMale, Collectors.counting()));

//        System.out.println(collect2);

        Map<Boolean, List<String>> collect3 = DB.getData().stream()
                .collect(Collectors.groupingBy(User::isMale, Collectors.mapping(User::getName, Collectors.toList())));

//        System.out.println(collect3);

        StringBuffer sb = new StringBuffer("abc");
//        System.out.println(sb.insert(0,1));


        int reduce = IntStream.rangeClosed(1,100).reduce(0,(pre, curr) -> pre + curr);
        System.out.println(reduce);
    }
}
