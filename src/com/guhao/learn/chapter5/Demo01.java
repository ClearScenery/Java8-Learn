package com.guhao.learn.chapter5;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author guhao
 * @DateTime 2019-11-22 14:12
 * @Description
 **/
public class Demo01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");

        List<String> collect = list.stream().map(word -> word.split("")).flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(collect);
//        List<String> list1 = Arrays.asList(list.get(0));
//        List<String> list2 = Arrays.asList(list.get(1));
//        list1.addAll(list2);
//        System.out.println(list1);
//        int min = Integer.min(1, 3);
//        System.out.println(min);
//
//        int sum = Integer.sum(1, 3);
//        System.out.println(sum);
//
//        int compare = Integer.compare(1, 2);
//        System.out.println(compare);
//
//        Byte decode = Byte.decode(String.valueOf(12));
//        System.out.println(decode);

    }
}
