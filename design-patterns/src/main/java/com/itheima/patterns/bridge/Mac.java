package com.itheima.patterns.bridge;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/12/22:08
 * @ClassName Mac
 * @Description 扩展抽象角色
 */
public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String fileName) {
        videoFile.decode(fileName);
    }
}
