package com.itheima.patterns.visitor;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/22:30
 * @ClassName Person
 * @Description 抽象访问者
 */
public interface Person {

    void feed(Dog dog);

    void feed(Cat cat);

}
