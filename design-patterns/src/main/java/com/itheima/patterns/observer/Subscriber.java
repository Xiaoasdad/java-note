package com.itheima.patterns.observer;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/22:25
 * @ClassName Subscriber
 * @Description 具体观察者角色
 */
public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "收到一条新的推送:" + msg);
    }
}
