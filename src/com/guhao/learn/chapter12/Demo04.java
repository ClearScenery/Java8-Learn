package com.guhao.learn.chapter12;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;

/**
 * @Author guhao
 * @DateTime 2020-03-01 19:42
 * @Description
 **/
public class Demo04 {
    public static void main(String[] args) {
        LocalDateTime with = LocalDateTime.now()
                .minusDays(1)
//                .minusYears(1)
//                .plusMonths(2)
                .with(ChronoField.YEAR, 2000);
        System.out.println(with);

        Duration duration = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(1));
        System.out.println(duration.getSeconds());
        System.out.println(duration.getUnits());
        //86400 = 24 * 3600

        Period period = Period.between(LocalDate.now(), LocalDate.now().plusDays(1));
        System.out.println(period.getDays());


    }
}
