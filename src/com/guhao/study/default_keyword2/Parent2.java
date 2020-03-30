package com.guhao.study.default_keyword2;

/**
 * @Author guhao
 * @DateTime 2019-10-18 10:36
 * @Description
 **/
public interface Parent2 {
    default void hello(){
        System.out.println("hello parent2");
    }
}
