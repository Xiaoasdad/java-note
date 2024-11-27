package com.itheima.patterns.adapter.object_adapter;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/9/22:17
 * @ClassName TfCardImpl
 * @Description
 */
public class TfCardImpl implements TfCard {
    @Override
    public String readTf() {
        return "TfCard read msg: Hello Word";
    }

    @Override
    public void writeTf(String msg) {
        System.out.println("TfCard write msg: " + msg);
    }
}
