package com.itheima.patterns.singleton.reflection;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/17/11:03
 * @ClassName Singleton
 * @Description 懒汉式，静态工厂
 */
public class Singleton {

    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class) {
            // 判断flag是否为true，为真则已经创建对象
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

//    在静态内部类中声明并初始化外部类的对象
    private static class SingletonHolder {
//        静态属性，只会创建一次
        public static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
