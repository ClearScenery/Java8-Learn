package com.guhao.learn.chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author guhao
 * @DateTime 2019-11-19 14:20
 * @Description
 **/
public class Demo01 {
    public static void main(String[] args) {
        try {
            String oneLine = processFile(br -> br.readLine());
            String twoLine = processFile(br -> br.readLine() +" "+ br.readLine());
            System.out.println("oneLine:"+oneLine);
            System.out.println("twoLine:"+twoLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String processFile(BufferedReaderProcesser p) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("a.txt"))){
            return p.process(br);
        }
    }
}

@FunctionalInterface
interface BufferedReaderProcesser{
    String process(BufferedReader br) throws IOException;
}

