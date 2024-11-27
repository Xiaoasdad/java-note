package com.itheima.patterns.bridge;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/12/22:07
 * @ClassName Windows
 * @Description 扩展抽象角色
 */
public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String fileName) {
        videoFile.decode(fileName);
    }
}
