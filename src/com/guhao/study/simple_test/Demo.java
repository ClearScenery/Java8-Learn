package com.guhao.study.simple_test;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * @Author guhao
 * @DateTime 2019-10-16 13:28
 * @Description
 **/
public class Demo {
    public static void main(String[] args) {
//        没有参数，且返回类型为 void
        Runnable noArguments = () -> System.out.println("hello world");

//         Lambda 表达式包含且只包含一个参数，可省略参数的括号
        ActionListener oneArgument = event -> System.out.println("button cliced");

//        Lambda 表达式的主体不仅可以是一个表达式，而且也可以是一段代码块，使用大括号{}将代码块括起来
        /**
         * 如果你曾使用过匿名内部类，也许遇到过这样的情况：需要引用它所在方法里的变量。这
         * 时，需要将变量声明为 final
         *
         * 将变量声明为 final，意味着不能为其重复赋
         * 值。同时也意味着在使用 final 变量时，实际上是在使用赋给该变量的一个特定的值。
         *
         * Java 8 虽然放松了这一限制，可以引用非 final 变量，但是该变量在既成事实上必须是
         * final。虽然无需将变量声明为 final，但在 Lambda 表达式中，也无法用作非终态变量。如
         * 果坚持用作非终态变量，编译器就会报错。
         * 既成事实上的 final 是指只能给该变量赋值一次。换句话说，Lambda 表达式引用的是值，
         * 而不是变量
         */
        String name = getUserName();
//        name="";   //此处无法再修改name，lambda引用的值是值，也就是既定事实上的final变量
        Runnable multiStatement = () -> {
            //        name="";//同样不能修改
            System.out.print("hello world"+name);
        };


//        重点结论！！！！ Lambda 表达式中引用的局部变量必须是 final 或既成事实上的 final 变量。
//        Lambda 表达式本身的类型：函数接口。








//        这行代码并不是将两个数字相加，而是创建了一个函数，用来计算两个数字相加的结果
        BinaryOperator<Long> add = (x,y) -> x=y;

//        有时最好也可以显式声明参数类型，此时就需要使用小括号将参数括起来，多个参数的情况也是如此
        BinaryOperator<Long> addExplicit = (Long x,Long y) -> { return x+y; };



//        Lambda 表达式的类型依赖于上下文环境，是由编译器推断出来的
    }

    public static String getUserName(){
        return "a";
    }
}
