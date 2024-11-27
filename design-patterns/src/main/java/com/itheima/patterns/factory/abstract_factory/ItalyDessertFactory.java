package com.itheima.patterns.factory.abstract_factory;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/4/20:12
 * @ClassName ItalyDessertFactory
 * @Description 意大利风味的甜品工厂，生产拿铁咖啡和提拉米苏
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
