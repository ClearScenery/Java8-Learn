package com.guhao.learn.chapter1;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author guhao
 * @DateTime 2019-11-13 14:50
 * @Description
 **/
public class FPDemo01 {
    public static void main(String[] args) {
        File[] hidenFiles = new File(".").listFiles(File::isHidden);
//        Arrays.asList(hidenFiles).stream().forEach(file -> System.out.println(file.getName()));
        List<File> list = filter(Arrays.asList(hidenFiles), (File file) -> file.getName().equals(".gitigore"));
        System.out.println(list);
    }


    public static  <T> List<T> filter(List<T> list , Predicate<T> predicate){
        return list.stream().peek(value -> System.out.println(value)).filter(value -> predicate.test(value)).collect(Collectors.toList());
    }
}
