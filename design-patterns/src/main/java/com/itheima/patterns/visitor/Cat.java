package com.itheima.patterns.visitor;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/22:31
 * @ClassName Cat
 * @Description
 */
public class Cat implements Pet{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("喵~");
    }
}
