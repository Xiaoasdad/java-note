package com.itheima.patterns.mediator;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/15:33
 * @ClassName Mediator
 * @Description 抽象中介者类
 */
public abstract class Mediator {

    public abstract void register(Person person);

    public abstract void contact(String msg, Colleague person);
}
