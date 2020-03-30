package com.guhao.study.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

/**
 * @Author guhao
 * @DateTime 2019-10-18 15:20
 * @Description
 **/
public class Demo_order {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(asList(4, 3, 2, 1));
        List<Integer> sameOrder = numbers.stream()
                .collect(toList());
        // 该断言有时会失败

        System.out.println(Arrays.toString(sameOrder.toArray()));

    }
}
