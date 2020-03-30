package com.guhao.learn.chapter6;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

/**
 * @Author guhao
 * @DateTime 2019-12-06 8:58
 * @Description
 **/
public class Demo04 {

private static final List<Student> list = new ArrayList<>();

    static {
        //true未毕业，false毕业
        list.add(new Student("酱",23,"male",99.0,true));
        list.add(new Student("航",23,"male",99.0,true));
        list.add(new Student("兔",23,"male",99.0,true));
        list.add(new Student("汁",23,"male",99.0,true));
        list.add(new Student("彬",23,"male",99.0,true));
        list.add(new Student("马",23,"male",99.0,true));
        list.add(new Student("虎",23,"male",99.0,true));
        list.add(new Student("菜",23,"male",99.0,true));
        list.add(new Student("峰",23,"male",99.0,true));
        list.add(new Student("猫",23,"male",99.0,true));
        list.add(new Student("狗",18,"male",100.0,false));
        list.add(new Student("白",23,"male",99.0,true));
        list.add(new Student("夜",23,"male",99.0,true));
        list.add(new Student("风",23,"male",99.0,true));
    }

    public static void main(String[] args) {
        //毕业，未毕业人数
        Map<Boolean, Long> collect = list.stream()
                .collect(partitioningBy(Student::getStatus, counting()));
        System.out.println(collect);

        //毕业，未毕业
        Map<Boolean, Map<String, List<Student>>> collect1 = list.stream()
                .collect(partitioningBy(Student::getStatus, groupingBy(Student::getName)));
        System.out.println(collect1);

        //毕业，未毕业
//        list.stream().collect(partitioningBy(Student::getStatus, collectingAndThen(maxBy(Student::getAge),Optional::get)));
    }

}
