package com.guhao.test;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @Author guhao
 * @DateTime 2019-11-18 13:54
 * @Description
 **/
public class Test01 {
    public static void main(String[] args) {
        String dqs[] = {"RSD1","RSD2","RSD3","RSD4"};
        System.out.println(Arrays.toString(dqs).replaceAll("^|$","'").replaceAll("]|\\[","").replaceAll(",","|"));
    }
}
