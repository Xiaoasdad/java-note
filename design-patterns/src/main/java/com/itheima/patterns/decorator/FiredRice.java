package com.itheima.patterns.decorator;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/11/16:25
 * @ClassName FiredRice
 * @Description 具体构件
 */
public class FiredRice extends FastFood{

    public FiredRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
