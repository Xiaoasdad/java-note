package com.itheima.patterns.adapter.class_adapter;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/9/22:29
 * @ClassName Tf2SdAdapter
 * @Description
 */
public class Tf2SdAdapter extends TfCardImpl implements SdCard{
    @Override
    public String readSd() {
        System.out.println("Adapter read TF card");
        return readTf();
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("Adapter write TF card");
        writeTf(msg);
    }
}
