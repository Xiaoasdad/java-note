package com.itheima.patterns.factory.factory_method;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/4/16:14
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        AmericanCoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);

        store.orderCoffee();
    }
}
