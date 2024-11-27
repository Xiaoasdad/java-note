package com.itheima.patterns.bridge;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/12/22:10
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        // 创造操作系统对象
        OperatingSystem system = new Mac(new AviFile());
        system.play("战狼");

    }
}
