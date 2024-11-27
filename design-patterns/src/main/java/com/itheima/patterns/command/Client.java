package com.itheima.patterns.command;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/20/19:29
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setOrderNum(1);
        order1.setFood("青菜面", 1);
        order1.setFood("可乐", 1);

        Order order2 = new Order();
        order2.setOrderNum(2);
        order2.setFood("扬州炒饭", 1);
        order2.setFood("雪碧", 1);

        Chef receiver = new Chef();
        Waiter invoker = new Waiter();
        invoker.addCommand(new OrderCommand(receiver, order1));
        invoker.addCommand(new OrderCommand(receiver, order2));
        invoker.orderUp();

    }
}
