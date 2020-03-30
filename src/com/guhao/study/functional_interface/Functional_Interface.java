package com.guhao.study.functional_interface;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * @Author guhao
 * @DateTime 2019-10-16 14:05
 * @Description
 **/
public class Functional_Interface {
/*
 *   Lambda 表达式中的类型推断，实际上是 Java 7 就引入的目标类型推断的扩展。
 *   Java 7 中的菱形操作符，它可使 javac 推断出泛型参数的类型.
 *
 *   Java 7 中程序员可省略构造函数的泛型类型，Java 8 更进一步，程序员可省略 Lambda 表达
 *   式中的所有参数类型。再强调一次，这并不是魔法，javac 根据 Lambda 表达式上下文信息
 *   就能推断出参数的正确类型。
 */

    public static void main(String[] args) {
//        javac 还可检查Lambda 表达式的返回值是不是 boolean，这正是 Predicate 方法的返回类型


        //函数接口接收入参，出参为返回值，没有则返回空

        Predicate<Integer> atLeast5 = x -> x > 5;
        System.out.println(atLeast5.test(4));


        BinaryOperator<Long> add = (x,y) -> x + y;

        //报错，javac无法推断出类型
//        BinaryOperator add = (x,y) -> x + y;

        //再记一下：函数接口指仅具有单个抽象方法的接口，用来表示 Lambda 表达式的类型。

    }

}


