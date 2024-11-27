package com.itheima.patterns.adapter.class_adapter;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/9/22:15
 * @ClassName TfCard
 * @Description 适配者类的接口
 */
public interface TfCard {

    String readTf();

    void writeTf(String msg);

}
