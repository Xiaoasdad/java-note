package com.itheima.patterns.decorator;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/11/16:28
 * @ClassName FiredNoodles
 * @Description
 */
public class FiredNoodles extends FastFood{

    public FiredNoodles() {
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
