package com.itheima.patterns.bridge;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/12/21:58
 * @ClassName AviFile
 * @Description
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("AVI视频文件" + fileName);
    }
}
