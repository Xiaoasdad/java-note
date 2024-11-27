package com.itheima.patterns.proxy.static_proxy;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/7/23:05
 * @ClassName ProxyPoint
 * @Description 代售点作为中介，同时对sell功能进行了增强（收取服务费用）
 */
public class ProxyPoint implements SellTickets{

    private TrainStation station = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取部分服务费用");
        station.sell();
    }
}
