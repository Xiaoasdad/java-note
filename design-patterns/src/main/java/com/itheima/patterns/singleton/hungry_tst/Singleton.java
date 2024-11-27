package com.itheima.patterns.singleton.hungry_tst;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/16/0:23
 * @ClassName Singleton01
 * @Description 饿汉式，静态成员变量 / 静态代码块
 */
public class Singleton {

//    1. 私有构造方法
    private Singleton() {}

//    2.1 静态成员变量方式，创建本类对象
    private static Singleton instance = new Singleton();

//    2.2 声明对象 + 静态代码块赋值
    private static Singleton instance2;
    static {
        instance2 = new Singleton();
    }

//    3. 提供一个公共的访问方式，让外界访问对象
    public static Singleton getInstance() {
        return instance;
    }

}
