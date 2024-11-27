package com.itheima.patterns.visitor;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/22:31
 * @ClassName Pet
 * @Description 抽象元素角色类
 */
public interface Pet {

    void accept(Person person);
}
