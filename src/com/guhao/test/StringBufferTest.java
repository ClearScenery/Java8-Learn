package com.guhao.test;

/**
 * @Author guhao
 * @DateTime 2019-12-18 11:14
 * @Description
 **/
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc,");
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
