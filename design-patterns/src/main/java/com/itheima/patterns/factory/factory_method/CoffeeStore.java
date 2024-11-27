package com.itheima.patterns.factory.factory_method;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/3/22:32
 * @ClassName CoffeeStore
 * @Description
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public void orderCoffee() {
        Coffee coffee = factory.createCoffee();
        if(coffee != null){
            System.out.println(coffee.getName());
            coffee.addSuger();
            coffee.addMilk();
        }
        else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }

    }
}
