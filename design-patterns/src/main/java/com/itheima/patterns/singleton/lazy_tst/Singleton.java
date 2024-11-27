package com.itheima.patterns.singleton.lazy_tst;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/16/18:43
 * @ClassName Singleton
 * @Description 懒汉式，双重检查锁
 */
public class Singleton {

    private Singleton() {}

//    只是声明，并没有创建对象
    private static volatile Singleton instance;

//    提供一个公共的访问方式，让外界访问对象
//    获取对象时才创建，后续调用时直接返回对象
    public static Singleton getInstance() {
        // 第一次检查，判断是否已经存在对象
        if(instance == null){
            // 首次创建对象，此时加锁
            synchronized (Singleton.class){
                // 在同步块内判断是否为空，确保单例
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
