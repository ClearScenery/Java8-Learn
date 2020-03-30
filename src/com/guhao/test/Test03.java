package com.guhao.test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-12-24 10:50
 * @Description
 **/
public class Test03 {
    public static void main(String[] args) {
        int [] array = {1,2,4,5};
        Arrays.asList(array).stream().flatMapToInt(Arrays::stream).forEach(System.out::println);
    }
}
