package com.guhao.study.stream;

import com.guhao.study.stream.pojo.DB;
import com.guhao.study.stream.pojo.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author guhao
 * @DateTime 2019-10-22 8:39
 * @Description
 **/
public class Demo_PartitioningBy {
    public static void main(String[] args) {
        /*
            收集器partitionBy接收一个流通过Predicate对象判断元素属于哪个部分
            结果是一个map，true或false为key，value为list
         */

        Map<Boolean, List<User>> collect = DB.getData().stream()
                .collect(Collectors.partitioningBy(User::isMale));

        System.out.println(collect);

        System.out.println(collect.get(true));

    }
}
