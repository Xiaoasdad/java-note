package com.itheima.patterns.singleton.reflection;

import java.lang.reflect.Constructor;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/17/16:25
 * @ClassName Client
 * @Description 反射破坏单例
 */
public class Client {
    public static void main(String[] args) throws Exception {
//        获取Singleton字节码对象
        Class<Singleton> singletonClass = Singleton.class;
//        获取无参构造方法对象
        Constructor<Singleton> cons = singletonClass.getDeclaredConstructor();
//        取消访问检查
        cons.setAccessible(true);
//        通过反射创建对象
        Singleton s1 = cons.newInstance();
        Singleton s2 = cons.newInstance();

        System.out.println(s1 == s2);
    }
}
