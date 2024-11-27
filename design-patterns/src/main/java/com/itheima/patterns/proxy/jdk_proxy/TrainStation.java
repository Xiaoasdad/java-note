package com.itheima.patterns.proxy.jdk_proxy;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/7/23:03
 * @ClassName TrainStation
 * @Description
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
