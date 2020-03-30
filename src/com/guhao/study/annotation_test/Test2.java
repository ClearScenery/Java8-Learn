package com.guhao.study.annotation_test;

import java.util.Arrays;

/**
 * @Author guhao
 * @DateTime 2019-10-25 13:21
 * @Description
 **/
public class Test2 {
    public static void main(String[] args) {
        String str = "ssss";
        System.out.println(Arrays.toString(str.split(",")));


        StringBuffer str2 = new StringBuffer("abc,挂号,");
        str2.insert(0,"(").deleteCharAt(str2.length()-1).append(")");

        System.out.println(str2.toString());
     }
}
