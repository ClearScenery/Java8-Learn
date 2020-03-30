package com.guhao.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 * @Author guhao
 * @DateTime 2019-10-16 16:53
 * @Description
 **/
public class Demo4_filter {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");
        List<String> list = Stream.of("aa", "b12c", "c")
                .filter(value ->
                     pattern.matcher(value).find()
                )
                .collect(toList());

        System.out.println(Arrays.toString(list.toArray()));
    }
}
