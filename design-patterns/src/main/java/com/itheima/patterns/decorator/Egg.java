package com.itheima.patterns.decorator;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/11/17:18
 * @ClassName Egg
 * @Description
 */
public class Egg extends Garnish{
    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }


}
