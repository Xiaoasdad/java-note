package com.itheima.patterns.proxy.static_proxy;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/7/23:10
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
