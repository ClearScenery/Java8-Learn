package com.guhao.study.stream;

import com.guhao.study.stream.pojo.DB;
import com.guhao.study.stream.pojo.User;

import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Author guhao
 * @DateTime 2019-10-28 8:35
 * @Description
 **/
public class Demo_reduce2 {
    public static void main(String[] args) {
//        StringCombiner combiner = DB.getData().stream()
//                .map(User::getName)
//                .reduce(new StringCombiner(",", "[", "]"),
//                        StringCombiner::add,
//                        StringCombiner::merge);
//
//        String result = combiner.toString();
//        System.out.println(result);


        String result2 = DB.getData().stream()
                .map(User::getName)
                .collect(new StringCollector(",", "[", "]"));

        System.out.println(result2);
    }
}

class StringCombiner{

    private String delimiter;
    private String prefix;
    private String suffix;

    private StringBuilder builder;

    public StringCombiner(String delimiter, String prefix, String suffix) {
        builder = new StringBuilder();
        this.delimiter = delimiter;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public StringCombiner add(String element){
        if(areAtStart()){
            builder.append(prefix);
        }else{
            builder.append(delimiter);
        }
        builder.append(element);
        return this;
    }

    public StringCombiner merge(StringCombiner other){
        builder.append(other.builder);
        return this;
    }

    private boolean areAtStart(){
        return this.builder.length() == 0;
    }

    public String toString(){
        if(builder!=null){
            return this.builder.append(suffix).toString();
        }else{
            return null;
        }
    }
}


class StringCollector implements Collector<String,StringCombiner,String>{

    private String delimiter;
    private String prefix;
    private String suffix;

    public StringCollector(String delimiter, String prefix, String suffix) {
        this.delimiter = delimiter;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    /**
     * 工厂方法，创建容器
     * @return
     */
    @Override
    public Supplier<StringCombiner> supplier() {
        return () -> new StringCombiner(delimiter,prefix,suffix);
    }

    /**
     * 函数：叠加当前元素到收集器, 用来将流中的值叠加入容器
     * @return
     */
    @Override
    public BiConsumer<StringCombiner, String> accumulator() {
        return StringCombiner::add;
    }

    /**
     *
     * @return
     */
    @Override
    public BinaryOperator<StringCombiner> combiner() {
        return StringCombiner::merge;
    }

    @Override
    public Function<StringCombiner, String> finisher() {
        return StringCombiner::toString;
    }

    @Override
    public Set<Characteristics> characteristics() {
        Set<Characteristics> set = new HashSet<>();
        set.add(Characteristics.IDENTITY_FINISH);
        return set;
    }
}
