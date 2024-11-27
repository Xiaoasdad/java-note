package com.itheima.patterns.visitor;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/22:35
 * @ClassName Owner
 * @Description
 */
public class Owner implements Person{
    @Override
    public void feed(Dog dog) {
        System.out.println("主人的召唤：狗");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("主人的召唤：猫");
    }
}
