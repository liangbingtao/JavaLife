package com.neo.study.test;

import java.io.File;
import java.io.IOException;

/**
 * @Description Author neo
 * Date 2020/11/24 9:00
 */

//IO测试
public class Test01 {
    public static void main(String[] args) {
//        String path="d:"+File.separator+"test.txt";//文件路径
        String path="d:"+File.separator+"export"+File.separator+"test";//创建文件夹路径，test为要创建的文件夹
        System.out.println(path);
        File file = new File(path);
//        try {
//            file.createNewFile(); //创建文件
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        file.delete();  //删除文件
        boolean mkdir = file.mkdir();//创建文件夹
        System.out.println(mkdir);
//        String[] list = file.list();//列出指定目录的全部名称
//        File[] files = file.listFiles();//列出完整的路径
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);
//        }
//        System.out.println("----------------------");
//        for (int i = 0; i < files.length; i++) {
//            System.out.println(files[i]);
//        }
    }
}
