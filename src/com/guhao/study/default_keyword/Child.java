package com.guhao.study.default_keyword;

/**
 * @Author guhao
 * @DateTime 2019-10-18 10:01
 * @Description 重写顶层接口的默认方法
 **/
public interface Child extends Parent{
    @Override
    default void welcome(){
        System.out.println("hello child");
    }
}
