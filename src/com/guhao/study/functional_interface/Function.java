package com.guhao.study.functional_interface;

/**
 * @Author guhao
 * @DateTime 2019-10-16 14:24
 * @Description
 **/

public interface Function<T,R> {
    R apply(T t);
}
