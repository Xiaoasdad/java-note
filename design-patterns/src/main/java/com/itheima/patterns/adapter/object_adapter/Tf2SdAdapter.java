package com.itheima.patterns.adapter.object_adapter;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/9/22:29
 * @ClassName Tf2SdAdapter
 * @Description
 */
public class Tf2SdAdapter implements SdCard {

    // 声明适配者类
    private TfCard tfCard;

    public Tf2SdAdapter(TfCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readSd() {
        System.out.println("Adapter read TF card");
        return tfCard.readTf();
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("Adapter write TF card");
        tfCard.writeTf(msg);
    }
}
