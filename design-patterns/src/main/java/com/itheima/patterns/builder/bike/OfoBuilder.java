package com.itheima.patterns.builder.bike;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/7/16:41
 * @ClassName OfoBuilder
 * @Description
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
