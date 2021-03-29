package com.neo.structure.bridge;

/**
 * @Author : neo
 * @Date 2021/3/25 10:05
 * @Description : AVI文件（具体实现化）
 */
public class AVIFile implements VideoFile {


    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
