package com.itheima.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/22:20
 * @ClassName YouTuber
 * @Description
 */
public class YouTuber implements Subject {

    private List<Observer> subscriberList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        subscriberList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        subscriberList.remove(observer);
    }

    @Override
    public void notify(String msg) {
        for (Observer observer : subscriberList) {
            observer.update(msg);
        }
    }
}
