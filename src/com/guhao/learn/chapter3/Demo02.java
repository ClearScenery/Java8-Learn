package com.guhao.learn.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-11-20 10:16
 * @Description
 **/
public class Demo02 {
    public static void main(String[] args) {
        AppleFunction<Integer,Integer,String,Apple> af = Apple::new;


        System.out.println();
    }

    public List<Apple> getAppleList(){
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(1,1,"red"));
        apples.add(new Apple(2,2,"green"));
        apples.add(new Apple(3,3,"yellow"));
        apples.add(new Apple(4,4,"red"));
        apples.add(new Apple(1,1,"green"));
        return apples;
    }
}

@FunctionalInterface
interface AppleFunction<T,U,S,R>{
    R apply(T t,U u,S s);
}

class Apple{
    private Integer weight;
    private Integer price;
    private String color;

    public Apple(Integer weight, Integer price, String color) {
        this.weight = weight;
        this.price = price;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
