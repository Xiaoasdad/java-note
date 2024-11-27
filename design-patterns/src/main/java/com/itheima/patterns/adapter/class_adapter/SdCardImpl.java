package com.itheima.patterns.adapter.class_adapter;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/9/22:20
 * @ClassName SdCardImpl
 * @Description
 */
public class SdCardImpl implements SdCard{
    @Override
    public String readSd() {
        return "SdCard read msg: Hello World";
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("SdCard write msg: " + msg);
    }
}
