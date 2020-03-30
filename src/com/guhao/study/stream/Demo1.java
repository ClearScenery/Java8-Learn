package com.guhao.study.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-10-16 15:44
 * @Description
 **/
public class Demo1 {

//    Stream 是用函数式编程方式在集合类上进行复杂操作的工具
    public static void main(String[] args) {
        List<Integer> strList = Arrays.asList(1,2,3);

        //及早求职
        long count = strList.stream().filter(a -> a < 2).count();

        System.out.println(count);

        //filter惰性求值
        strList.stream().filter(a -> {
            System.out.println(a);
            return a < 2;
        });

        /*
         * 这行代码并未做什么实际性的工作，filter 只刻画出了 Stream，但没有产生新的集合。像
         * filter 这样只描述 Stream，最终不产生新集合的方法叫作惰性求值方法；而像 count 这样
         * 最终会从 Stream 产生值的方法叫作及早求值方法。
         *
         * 判断一个操作是惰性求值还是及早求值很简单：只需看它的返回值。如果返回值是 Stream，
         * 那么是惰性求值；如果返回值是另一个值或为空，那么就是及早求值。使用这些操作的理
         * 想方式就是形成一个惰性求值的链，最后用一个及早求值的操作返回想要的结果，这正是
         * 它的合理之处。计数的示例也是这样运行的，但这只是最简单的情况：只含两步操作。
         */

        /*
          这样设计的好处是，可以在集合类上级联多种操作，但是整个过程我们只需要迭代一次。
         */




    }
}
