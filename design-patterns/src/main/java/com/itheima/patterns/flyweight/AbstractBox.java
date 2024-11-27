package com.itheima.patterns.flyweight;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/15/14:08
 * @ClassName AbstractBox
 * @Description 抽象享元，内部对象为不同形状的方块对象，外部对象为方快的颜色
 */
public abstract class AbstractBox {
//    获取图形
    abstract String getShape();
//    显示图像
    public void display(String color){
        System.out.println(color + getShape());
    }
}
