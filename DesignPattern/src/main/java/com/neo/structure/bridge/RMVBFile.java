package com.neo.structure.bridge;

/**
 * @Author : neo
 * @Date 2021/3/25 10:06
 * @Description : RMVBFile（具体实现化角色）
 */
public class RMVBFile implements VideoFile {
    public void decode(String fileName) {
        System.out.println("RMVB文件：" + fileName);
    }
}
