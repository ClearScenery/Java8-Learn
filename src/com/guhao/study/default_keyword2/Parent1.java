package com.guhao.study.default_keyword2;

/**
 * @Author guhao
 * @DateTime 2019-10-18 10:33
 * @Description 接口1
 **/
public interface Parent1 {
    default void hello(){
        System.out.println("hello parent2");
    }
}
