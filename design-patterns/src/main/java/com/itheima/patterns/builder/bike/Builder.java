package com.itheima.patterns.builder.bike;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/7/16:35
 * @ClassName Builder
 * @Description
 */
public abstract class Builder {

    // 声明 bike 变量并赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
