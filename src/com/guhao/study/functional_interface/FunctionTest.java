package com.guhao.study.functional_interface;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;

/**
 * @Author guhao
 * @DateTime 2019-10-16 14:24
 * @Description
 **/
public class FunctionTest {
    public static void main(String[] args) {
        Function<Long,Long> funcTest = t -> t+1;
        System.out.println(funcTest.apply(2L));

        ThreadLocal<DateFormatter> dateFormatterThreadLocal
                = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("yyyy-MM-dd")));

    }
}
