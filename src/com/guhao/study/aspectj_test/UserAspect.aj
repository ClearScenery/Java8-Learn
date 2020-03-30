package com.guhao.study.aspectj_test;

/**
 * @Author guhao
 * @DateTime 2019-10-25 14:48
 * @Description
 **/
public aspect UserAspect {
    pointcut test() : call(* UserService.*(..));

    Object around():test(){
        Object proceed = proceed();
        System.out.println("666");
        return proceed;
    }
}
