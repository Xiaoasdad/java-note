package com.itheima.patterns.factory.factory_method;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/3/21:24
 * @ClassName Coffee
 * @Description 抽象产品
 */
public abstract class Coffee {

    public abstract String getName();

    public void addSuger() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加牛奶");
    }
}
