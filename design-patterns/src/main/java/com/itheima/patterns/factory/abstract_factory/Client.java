package com.itheima.patterns.factory.abstract_factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/4/20:14
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
//        ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory = new AmericanDessertFactory();
        
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();

    }
}
