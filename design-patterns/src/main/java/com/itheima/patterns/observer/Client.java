package com.itheima.patterns.observer;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/22:27
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new YouTuber();
        subject.attach(new Subscriber("诡诈之龟"));
        subject.attach(new Subscriber("神棍老师麦迪文"));
        subject.attach(new Subscriber("异灵术"));

        subject.notify("深谙领域第二次平衡补丁");
    }
}
