package com.itheima.patterns.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/8/13:44
 * @ClassName ProxyFactory
 * @Description
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject() {
        /*
        * Proxy.newProxyInstance参数说明
        *
        * ClassLoader loader, 当前对象的类加载器
        * Class<?>[] interfaces, 目标对象实现的接口类型，使用泛型方法确认类型
        * InvocationHandler h, 事件处理
        */
        return (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("执行invoke方法");
                        return method.invoke(station, args);
                    }
                }
        );
    }


}
