package com.itheima.patterns.strategy;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/19/20:17
 * @ClassName StrategyA
 * @Description 具体策略类
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("策略b：满200减50");
    }
}
