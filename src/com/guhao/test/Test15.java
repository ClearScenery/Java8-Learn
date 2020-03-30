package com.guhao.test;

/**
 * 斐波那锲数列 计算前N项和
 */
public class Test15 {
    public static void main(String[] args) {
        int i = getNSumValue(55);
        System.out.println(i);
    }


    public static int getNSumValue(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += getNValue(i);
        }
        return sum;
    }


    public static int getNValue(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else
            return getNValue(n - 1) + getNValue(n - 2);
    }
}