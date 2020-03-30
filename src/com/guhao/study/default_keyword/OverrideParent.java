package com.guhao.study.default_keyword;

/**
 * @Author guhao
 * @DateTime 2019-10-18 10:04
 * @Description
 **/
public class OverrideParent extends ParentImpl{
    @Override
    public void welcome(){
        System.out.println("hello overrideParent");
    }
}
