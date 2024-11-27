package com.itheima.patterns.adapter.object_adapter;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/9/22:21
 * @ClassName Computer
 * @Description
 */
public class Computer {

    String readSd(SdCard card) {
        if(card == null){
            throw new NullPointerException("null");
        }
        return card.readSd();
    }
}
