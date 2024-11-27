package com.itheima.patterns.command;

import java.util.Map;
import java.util.Set;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/20/18:58
 * @ClassName OrderCommand
 * @Description
 */
public class OrderCommand implements Command {

    private Chef receiver;
    private Order order;

    public OrderCommand(Chef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getOrderNum() + "号餐桌订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String> keys = foodDir.keySet();
        for (String name : keys) {
            receiver.makeFood(name, foodDir.get(name));
        }
        System.out.println(order.getOrderNum() + "号餐桌订单准备完毕");
    }
}
