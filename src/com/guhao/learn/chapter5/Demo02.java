package com.guhao.learn.chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-11-26 11:06
 * @Description
 **/
public class Demo02 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d","哈");
        Optional<String> first = strings.stream().findFirst();
        System.out.println(first.get());
        Optional<String> any = strings.stream().findAny();
        System.out.println(any.get());
        //是否所有元素是不是都为a
        System.out.println(strings.stream().allMatch(v -> v.equals("a")));
        //判断所有元素是不是都是字母--判断不了中文，其实是UNICODE
        System.out.println(strings.stream().allMatch(v -> Character.isLetter(v.charAt(0))));
        //判断所有元素是不是小写字母
        System.out.println(strings.stream().allMatch(v -> Character.isLowerCase(v.charAt(0))));
        //判断是否包含元素是不是小写字母
        System.out.println(strings.stream().anyMatch(v -> Character.isLowerCase(v.charAt(0))));
        //有则打印
        strings.stream().findAny().ifPresent(System.out::println);//并行流限制少
        strings.stream().findFirst().ifPresent(System.out::println);//并行流限制大
    }
}
