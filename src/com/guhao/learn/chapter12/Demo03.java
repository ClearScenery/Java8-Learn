package com.guhao.learn.chapter12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author guhao
 * @DateTime 2020-03-01 18:06
 * @Description
 **/
public class Demo03 {
    public static void main(String[] args) {
        LocalDateTime of = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(of);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate localDate = now.toLocalDate();
        LocalTime localTime = now.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime localDateTime = localDate.atTime(13, 23);
        System.out.println(localDateTime);

        LocalDateTime parse = LocalDateTime.parse("2020-03-01 18:02:23", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(parse);
    }
}
