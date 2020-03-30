package com.guhao.study.stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-10-16 17:13
 * @Description
 **/
public class Demo5_flatMap {

    /*
     * 调用 stream 方法，将每个列表转换成 Stream 对象，其余部分由 flatMap 方法处理。
     * flatMap 方法的相关函数接口和 map 方法的一样，都是 Function 接口，只是方法的返回值
     * 限定为 Stream 类型罢了。
     *
     */

    public static void main(String[] args) {
        Stream.of(asList(1,2),asList(3,4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());
    }
}
