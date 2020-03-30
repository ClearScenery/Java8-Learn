package com.guhao.study.test;

import com.guhao.study.stream.pojo.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @Author guhao
 * @DateTime 2019-10-31 15:55
 * @Description
 **/
public class Peak2 {
    public static void main(String[] args) {
//        List<User> collect = IntStream.rangeClosed(1, 10)
//                .mapToObj(i -> new User(){{setAge(i);}})
//                .collect(toList());
//
//        System.out.println(Arrays.toString(collect.toArray()));

        List<Integer> collect = IntStream.rangeClosed(1, 5)
                .boxed()
                .peek(i -> System.out.println(i))
                .collect(toList());

        System.out.println(Arrays.toString(collect.toArray()));
    }
}
