package com.itheima.patterns.visitor;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/22:39
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Cat());
        home.add(new Dog());

        home.interact(new Owner());
        home.interact(new Someone());
    }
}
/**
 * pet
 * pet
 * pet
 */