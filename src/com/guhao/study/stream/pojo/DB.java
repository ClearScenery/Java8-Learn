package com.guhao.study.stream.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-10-22 10:39
 * @Description
 **/
public class DB {

    public static List<User> getData(){
        List<User> userList = new ArrayList<>();
        userList.add(new User(12,true,"zhangsan"));
        userList.add(new User(22,false,"lisi"));
        userList.add(new User(32,true,"wangwu"));

        return userList;
    }

}
