package com.itheima.patterns.builder.bike;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/7/16:38
 * @ClassName MobileBuilder
 * @Description
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
