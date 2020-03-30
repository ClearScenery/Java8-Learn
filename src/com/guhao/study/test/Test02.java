package com.guhao.study.test;

import com.guhao.study.stream.pojo.User;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-10-31 16:45
 * @Description
 **/
public class Test02 {
    public static void main(String[] args) {
//        User user = new User();
//        user.setName("zhangs");
//
//        List<User> list = new ArrayList<>();
//        list.add(user);
//
//        System.out.println(list.get(0));
//
//        user.setName("lisi");
//
//        System.out.println(list.get(0));


        //byte short int long float double char boolean
        //
        // 引用类型（不可变类型：String，Integer），String，[]


        //值传递，传递值拷贝
//        int a = 1;
//        System.out.println(a);
//        change(a);
//        System.out.println(a);


        //引用传递，地址值传递，arr在堆内存中的地址
//        int arr [] = {1};
//        System.out.println(Arrays.toString(arr));
//        change2(arr);
//        System.out.println(Arrays.toString(arr));

            String str = "12";
            System.out.println(str);
            change2(str);
            System.out.println(str);

            Integer i = 124;
            System.out.println(i);
            change(i);
            System.out.println(i);

    }


    public static void change(int a){
        a = 2;
    }

    public static void change2(int [] arr){
        arr[0] = 2;
    }

    public static void change2(String str){
        str = "aa";
    }
}
