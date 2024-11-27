package com.itheima.patterns.strategy;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/19/20:20
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.show();

        salesMan = new SalesMan(new StrategyB());
        salesMan.show();
    }
}
