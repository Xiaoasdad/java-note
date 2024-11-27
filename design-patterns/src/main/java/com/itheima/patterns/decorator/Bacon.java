package com.itheima.patterns.decorator;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/11/17:18
 * @ClassName Bacon
 * @Description
 */
public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

}
