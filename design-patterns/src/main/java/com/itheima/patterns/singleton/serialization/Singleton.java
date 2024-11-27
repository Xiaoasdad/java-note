package com.itheima.patterns.singleton.serialization;

import java.io.Serializable;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/17/11:03
 * @ClassName Singleton
 * @Description 懒汉式，静态工厂
 */
public class Singleton implements Serializable {

    private Singleton(){}

//    在静态内部类中声明并初始化外部类的对象
    private static class SingletonHolder {
//        静态属性，只会创建一次
        public static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
