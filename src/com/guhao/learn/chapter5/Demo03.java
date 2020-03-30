package com.guhao.learn.chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-11-26 11:29
 * @Description
 **/
public class Demo03 {
    public static void main(String[] args) {
        List<String> str1 = Arrays.asList("1", "2", "3");
        List<String> str2 = new ArrayList<>(Arrays.asList(new String[str1.size()]));
        Collections.copy(str2,str1);
        System.out.println(str2);
    }
}
