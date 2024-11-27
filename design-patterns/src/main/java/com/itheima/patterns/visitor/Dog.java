package com.itheima.patterns.visitor;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/22:31
 * @ClassName Dog
 * @Description
 */
public class Dog implements Pet{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("汪！");
    }
}
