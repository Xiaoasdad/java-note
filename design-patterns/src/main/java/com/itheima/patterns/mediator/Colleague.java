package com.itheima.patterns.mediator;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/15:37
 * @ClassName Colleague
 * @Description 抽象同事类
 */
public abstract class Colleague {

    protected String name;
    protected String type;
    protected Mediator mediator;

    public Colleague(String name, String type, Mediator mediator) {
        this.name = name;
        this.type = type;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    //    和中介沟通
    public void sendMsg(String msg) {
        mediator.contact(msg, this);
    }

    public void receiveMsg(String msg) {
        System.out.println(type + name + "收到消息" + msg);
    }

}
