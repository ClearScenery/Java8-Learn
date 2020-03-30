package com.guhao.study.optional;

import java.util.Optional;

/**
 * @Author guhao
 * @DateTime 2019-10-18 13:08
 * @Description 测试optional
 **/
public class OptionalTest {
    public static void main(String[] args) {

        //工厂方法 empty
        Optional<Object> empty = Optional.empty();
//         isPresent 检查 Optional对象是否有值
        System.out.println(empty.isPresent());

        //工厂方法 ofNullable  将null值转换成Optional
        Optional<Object> optionalO = Optional.ofNullable(null);

        System.out.println(optionalO.isPresent());

        System.out.println(optionalO.orElse('b'));
    }
}
