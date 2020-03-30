package com.guhao.study.parallel;

import com.guhao.study.stream.pojo.User;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

/**
 * @Author guhao
 * @DateTime 2019-10-31 11:16
 * @Description
 **/
public class Demo01 {
    public static void main(String[] args) {
        /*
         * 数据并行化
         * 影响性能的五要素是：数据大小、源数据结构、值是否装箱、可用的 CPU 核数量，以
         * 及处理每个元素所花的时间
         */
//        int sum = IntStream.rangeClosed(1, 100000)
//                .parallel()
//                .sum();
//        System.out.println(sum);
//
//
//        double [] doubles = new double[100000];
////        Arrays.parallelSetAll(doubles, i->i);
//        Arrays.setAll(doubles,i->i);
//        System.out.println(Arrays.toString(doubles));

//
//          int [] ints = new int[10];
//          Arrays.fill(ints,1);
//          System.out.println(Arrays.toString(ints));


//        int sum = IntStream.rangeClosed(1, 3)
////                .parallel()
//                .map(x -> x * x)
//                .sum();
//
//        System.out.println(sum);
//
//        int reduce = IntStream.rangeClosed(1, 3)
//                .parallel()
//                .reduce(1, (pre, cur) -> pre * cur);


//        User user = new User(){{
//           setName("zhangsan");
//        }};
//
//        List<User> list = new ArrayList<>();
//        list.add(user);
//
//        System.out.println("user:"+user.hashCode());
//
//        list.get(0).setName("lisi");
//
//        System.out.println("user:"+user.hashCode());


        String str ="aa";
//        System.out.println("str:"+str.hashCode());
        str = "bb";
//        System.out.println("str:"+str.hashCode());

//        Collections.copy();

    }
}
