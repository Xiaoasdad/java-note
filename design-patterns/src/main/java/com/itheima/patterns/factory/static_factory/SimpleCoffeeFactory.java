package com.itheima.patterns.factory.static_factory;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/3/21:37
 * @ClassName SimpleCoffeeFactory
 * @Description 与咖啡店解耦，但
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if(type.equals("latte")){
            coffee = new LatteCoffee();
        }
        else if(type.equals("American")){
            coffee = new AmericanCoffee();
        }
        return coffee;
    }
}
