package com.guhao.learn.chapter5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Author guhao
 * @DateTime 2019-12-03 10:19
 * @Description
 **/
public class Demo07 {
    public static void main(String[] args) {
        try {
            Path directory = Files.createDirectory(Paths.get("c"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
