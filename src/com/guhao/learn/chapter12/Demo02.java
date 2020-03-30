package com.guhao.learn.chapter12;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @Author guhao
 * @DateTime 2020-03-01 17:51
 * @Description
 **/
public class Demo02 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);


        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        LocalTime of = LocalTime.of(18, 03);
        System.out.println(of);

        int i = now.get(ChronoField.HOUR_OF_DAY);
        System.out.println(i);
    }
}
