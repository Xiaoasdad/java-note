package com.itheima.patterns.proxy.cglib_proxy;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/8/19:50
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
