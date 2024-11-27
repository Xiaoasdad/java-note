package com.itheima.patterns.proxy.jdk_proxy;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/8/16:51
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
