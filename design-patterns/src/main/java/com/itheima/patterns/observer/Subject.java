package com.itheima.patterns.observer;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/22:14
 * @ClassName Subject
 * @Description 抽象主题类
 */
public interface Subject {

    //    添加观察者
    void attach(Observer observer);
    //    移除观察者
    void detach(Observer observer);
    //    通知订阅者
    void notify(String msg);

}
