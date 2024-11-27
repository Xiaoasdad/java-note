package com.itheima.patterns.strategy;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/19/20:19
 * @ClassName SalesMan
 * @Description 环境类
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void show() {
        strategy.show();
    }
}
