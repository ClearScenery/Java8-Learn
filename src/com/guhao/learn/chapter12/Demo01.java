package com.guhao.learn.chapter12;

import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/**
 * @Author guhao
 * @DateTime 2020-03-01 13:58
 * @Description Java 8 在java.time包中整合了很多Joda-Time的特性
 * LocalDate、LocalTime、Instant、Duration 以及 Period
 **/
public class Demo01 {
    public static void main(String[] args) {

        //LocalDate

        LocalDate now = LocalDate.now();
        System.out.println(now);

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        LocalDate of = LocalDate.of(2020, 12, 12);
        System.out.println(of);

        Month month = of.getMonth();
        System.out.println(month);
        System.out.println(month.getValue());

        System.out.println("isLeapYear "+of.isLeapYear());

        System.out.println("getDayOfMonth "+of.getDayOfMonth());
        System.out.println("getDayOfYear "+of.getDayOfYear());
        System.out.println("getEra "+of.getEra());
        System.out.println("getMonthValue "+of.getMonthValue());
        System.out.println("getChronology "+of.getChronology());
        System.out.println("getDayOfWeek "+of.getDayOfWeek().getValue());


        LocalDate date = LocalDate.now();
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date.range(ChronoField.DAY_OF_MONTH));

        LocalDate date1 = LocalDate.parse("2020-02-02");
        System.out.println(date1);

        LocalDate localDate = date1.plusDays(20);
        System.out.println(localDate);

    }
}
