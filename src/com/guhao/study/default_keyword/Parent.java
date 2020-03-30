package com.guhao.study.default_keyword;

/**
 * @Author guhao
 * @DateTime 2019-10-18 10:00
 * @Description 顶层接口
 **/
public interface Parent {
    default void welcome(){
        System.out.println("hello parent");
    }
}
