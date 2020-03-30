package com.guhao.study.stream;

import com.guhao.study.stream.pojo.User;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-10-17 13:47
 * @Description
 **/
public class Demo_reduce {
    public static void main(String[] args) {
        //类似递归累加的效果
        Integer result = Stream.of(1, 2, 3, 4, 5, 6)
                .reduce(0, (acc, element) -> acc + element);

        System.out.println(result);

        //定义一个操作函数，递归累加
        BinaryOperator<Integer> add = (a,b) -> a+b;
        Integer result2 = add.apply(6, add.apply(5, add.apply(4, add.apply(3, add.apply(2, 1)))));
        System.out.println(result2);

        /*
        在命令式编程方式下，每一次循环将集合中的元素和累加器相加，用相加后的结果更新累
        加器的值。对于集合来说，循环在外部，且需要手动更新变量。
         */

        Optional<User> emptyOpt = Optional.empty();
        System.out.println(emptyOpt.get());

    }
}
