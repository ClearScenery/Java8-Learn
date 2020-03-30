package com.guhao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author guhao
 * @DateTime 2019-12-30 11:06
 * @Description
 **/
public class Test04 {
    public static void main(String[] args) {
        String str = "20191122090031";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddHHmmss");
        Date source = null;
        try {
            source = sdf1.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss z");
        String target = sdf2.format(source);
        System.out.println(target);
    }
}
