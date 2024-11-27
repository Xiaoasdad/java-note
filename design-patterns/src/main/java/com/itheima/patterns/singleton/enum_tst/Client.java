package com.itheima.patterns.singleton.enum_tst;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/17/14:11
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1 == instance2);
    }
}
