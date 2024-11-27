package com.itheima.patterns.singleton.lazy_tst;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/16/18:53
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // 判断获取到的是否为同一个对象
        System.out.println(instance1 == instance2);

    }
}
