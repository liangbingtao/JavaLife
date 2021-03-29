package com.neo.structure.bridge;

/**
 * @Author : neo
 * @Date 2021/3/25 12:20
 * @Description : mac版本（扩展抽象化角色）
 */
public class Mac extends OperatingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        System.out.print("在mac上播放");
        videoFile.decode(fileName);
    }
}
