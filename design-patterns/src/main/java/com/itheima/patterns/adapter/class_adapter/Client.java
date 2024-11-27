package com.itheima.patterns.adapter.class_adapter;

import java.io.InputStreamReader;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/9/22:26
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        String msg = computer.readSd(new Tf2SdAdapter());
        System.out.println(msg);

    }
}
