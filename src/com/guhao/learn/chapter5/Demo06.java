package com.guhao.learn.chapter5;

import java.util.stream.IntStream;

/**
 * @Author guhao
 * @DateTime 2019-12-02 9:31
 * @Description
 **/
public class Demo06 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100)
                .flatMap(a -> IntStream.rangeClosed(a,100)
                        .filter(b -> Math.sqrt(a*a + b*b) % 1 ==0 ));
    }
}
