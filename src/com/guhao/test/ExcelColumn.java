package com.guhao.test;

import java.lang.annotation.*;

/**
 * @Author guhao
 * @DateTime 2019-11-18 14:01
 * @Description
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelColumn {
    String name() default "";
    double order();
    ExcelType [] types();
}
