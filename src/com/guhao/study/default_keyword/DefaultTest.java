package com.guhao.study.default_keyword;

/**
 * @Author guhao
 * @DateTime 2019-10-18 10:10
 * @Description
 **/
public class DefaultTest {
    public static void main(String[] args) {
        Parent child = new OverrideChild();
        child.welcome();
    }
}
