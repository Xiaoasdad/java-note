package com.itheima.patterns.factory.factory_method;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/4/16:10
 * @ClassName AmericanCoffeeFactory
 * @Description
 */
public class AmericanCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
