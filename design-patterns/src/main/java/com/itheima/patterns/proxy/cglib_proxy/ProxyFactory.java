package com.itheima.patterns.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/8/19:34
 * @ClassName ProxyFactory
 * @Description
 */
public class ProxyFactory implements MethodInterceptor {

    TrainStation station = new TrainStation();

    public TrainStation getProxyObject() {
        Enhancer enhancer = new Enhancer();
//        设置父类字节码对象
        enhancer.setSuperclass(TrainStation.class);
//        设置回调函数
        enhancer.setCallback(this);
//        返回代理对象
        return (TrainStation) enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("intercept回调方法执行");
        return method.invoke(station, objects);
    }
}
