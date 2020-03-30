package com.guhao.study.aspectj_test;

public aspect Test {
    pointcut test() : execution(* HelloWorld.*(..));

    before() : test() {
        System.out.println("从前面插入。。。");
    }
    after(): test(){
        System.out.println("从后面插入。。。");
    }
}
