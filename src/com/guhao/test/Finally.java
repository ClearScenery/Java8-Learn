package com.guhao.test;

/**
 * @Author guhao
 * @DateTime 2019-11-20 9:06
 * @Description
 **/
public class Finally {
    public static void main(String[] args) {
        try{
            throw  new RuntimeException();
        }catch (Exception e){
            System.out.println(1);
            return;
        }finally {
            System.out.println(2);
        }
//        System.out.println(3);   //编译不通过
    }
}
