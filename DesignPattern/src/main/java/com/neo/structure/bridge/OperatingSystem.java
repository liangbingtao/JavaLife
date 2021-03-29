package com.neo.structure.bridge;

/**
 * @Author : neo
 * @Date 2021/3/25 10:08
 * @Description : 操作系统版本（抽象化角色）
 */
public abstract class OperatingSystem {

    //声明VidelFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    //定义抽象方法
    public abstract void play(String fileName);
}
