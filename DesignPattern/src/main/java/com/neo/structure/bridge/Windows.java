package com.neo.structure.bridge;

/**
 * @Author : neo
 * @Date 2021/3/25 12:16
 * @Description : windows版本（扩展抽象化角色）
 */
public class Windows extends OperatingSystem{


    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        System.out.print("在windows上播放");
        videoFile.decode(fileName);
    }
}
