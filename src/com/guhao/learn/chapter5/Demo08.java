package com.guhao.learn.chapter5;

/**
 * @Author guhao
 * @DateTime 2019-12-03 18:43
 * @Description
 **/
public class Demo08 {
    public static void main(String[] args) {
        String str1 = "aba";
//        System.out.println(str1.equals(new StringBuffer(str1).reverse().toString()));
//
//        String str2 = "été";
//        System.out.println(str2.equals(new StringBuffer(str2).reverse().toString()));

        System.out.println(reverseThenEq(str1));
    }


    public static boolean reverseThenEq(String str){
        char[] chars = str.toCharArray();
        int mid = chars.length % 2;
        boolean result;
        if(mid == 0){
            result = String.copyValueOf(chars,0,mid-1)
                    .equals(String.copyValueOf(chars,mid,chars.length));
        }else{
            result = String.copyValueOf(chars,0,mid)
                    .equals(String.copyValueOf(chars,mid+1,chars.length));
        }
        System.out.println(result);
        return result;
    }
}
