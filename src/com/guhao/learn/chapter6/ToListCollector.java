package com.guhao.learn.chapter6;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collector.Characteristics.CONCURRENT;
import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;

/**
 * @Author guhao
 * @DateTime 2019-12-19 9:08
 * @Description
 **/
public class ToListCollector<T> implements Collector<T, List<T>, List<T>> {


    @Override
    public Supplier<List<T>> supplier() {
        //累加器容器
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<T>, T> accumulator() {
        //执行归约操作的函数
        return List::add;
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        //并行情况下合并子结果集
        return (list1,list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        //将累加器转换为需要的结果类型，这里其实不需要转，因为累加器就是list，和结果集一致
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH, CONCURRENT));
    }
}
