package com.itheima.patterns.visitor;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/22:40
 * @ClassName Someone
 * @Description
 */
public class Someone implements Person{
    @Override
    public void feed(Dog dog) {
        System.out.println("访客摸了摸狗");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("访客摸了摸猫");
    }
}
