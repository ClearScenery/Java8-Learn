package com.guhao.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-12-09 8:51
 * @Description
 **/
public class HistoryUtils {
    public static void main(String[] args) {
        List<History> list = new ArrayList<>();
        list.add(new History("李四","C1","",""));
        list.add(new History("张三","C0","",""));
        list.add(new History("李四","C1","",""));
        list.add(new History("张三","C0","",""));

        for (int i = 0,len = list.size() -1; i < len ; i++) {
            History h1 = list.get(i);
            History h2 = list.get(i+1);
            h2.setToLev(h1.getFromLev());
            h2.setToName(h1.getFromName());
        }

        list.forEach(System.out::println);

    }
}
