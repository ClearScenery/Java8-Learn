package com.guhao.study.stream;

/**
 * @Author guhao
 * @DateTime 2019-10-23 10:08
 * @Description
 **/
public class ThreadTest {
    public static void main(String[] args) {
        int arr [] = {30,40,120,50,10,5,20,100,200,500,800,2,80,300};

        Thread tA = new Thread(()->{
            for(int i :arr){
                System.out.println("抽奖箱A 又产生了一个"+i+"元大奖");
            }
            System.out.println("抽奖箱A 抽奖结束");
        },"抽奖箱A");
        tA.start();

        Thread tB = new Thread(()->{
            for(int i :arr){
                System.out.println("抽奖箱B 又产生了一个"+i+"元大奖");
            }
            System.out.println("抽奖箱B 抽奖结束");
        },"抽奖箱B");
        tB.start();
    }
}
