package com.guhao.study.default_keyword2;

import com.guhao.study.default_keyword.Parent;

/**
 * @Author guhao
 * @DateTime 2019-10-18 10:37
 * @Description
 **/
public class Child implements Parent1,Parent2 {
    @Override
    public void hello(){
//      使用 super 关键字是指向父类，现在使用类似 InterfaceName.super 这样的语法指的是继承自父接口的方法。
        Parent1.super.hello();
    }
}
