package com.itheima.patterns.factory.static_factory;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/3/22:32
 * @ClassName CoffeeStore
 * @Description
 */
public class CoffeeStore {
    public void orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        if(coffee != null){
            coffee.getName();
            coffee.addSuger();
            coffee.addMilk();
        }
        else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }

    }
}
