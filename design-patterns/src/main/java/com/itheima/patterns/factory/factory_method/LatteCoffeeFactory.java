package com.itheima.patterns.factory.factory_method;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/4/16:11
 * @ClassName LatteCoffeeFactory
 * @Description
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
