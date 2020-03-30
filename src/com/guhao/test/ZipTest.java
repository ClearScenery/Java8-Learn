package com.guhao.test;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @Author guhao
 * @DateTime 2019-11-20 13:29
 * @Description
 **/
public class ZipTest {
    public static void main(String[] args){
        File file = new File("a.txt");
        try(
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("a.zip"));
            ){

            zipOutputStream.putNextEntry(new ZipEntry(file.getName()));

            int len = 0;
            while((len = bufferedInputStream.read()) != -1){
                zipOutputStream.write(len);
            }

            zipOutputStream.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
