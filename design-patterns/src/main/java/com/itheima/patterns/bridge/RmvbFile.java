package com.itheima.patterns.bridge;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/12/22:00
 * @ClassName RmvbFile
 * @Description
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("RMVB视频文件" + fileName);
    }
}
