package com.itheima.patterns.decorator;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/11/16:22
 * @ClassName FastFood
 * @Description 快餐类（抽象构件）
 */
public abstract class FastFood {
    private float price;
    protected String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();
}
