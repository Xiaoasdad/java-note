package com.itheima.patterns.decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/11/17:24
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        FastFood food = new FiredRice();
        Garnish egg = new Egg(food);
        System.out.println(egg.cost());
        System.out.println(egg.getDesc());

        Garnish bacon = new Bacon(egg);
        System.out.println(bacon.cost());
        System.out.println(bacon.getDesc());

    }
}
