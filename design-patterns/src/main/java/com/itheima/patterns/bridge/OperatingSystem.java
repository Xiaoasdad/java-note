package com.itheima.patterns.bridge;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/12/22:05
 * @ClassName OperatingSystem
 * @Description 抽象角色
 */
public abstract class OperatingSystem {

    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    abstract void play(String fileName);
}
