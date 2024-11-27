package com.itheima.patterns.builder.bike;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/7/16:42
 * @ClassName Director
 * @Description 指挥者类
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车的功能
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
