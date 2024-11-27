package com.itheima.patterns.flyweight;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/15/14:27
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();
        AbstractBox box1 = factory.getShape("L");
        box1.display("蓝色");

        AbstractBox box2 = factory.getShape("I");
        box2.display("白色");

        AbstractBox box3 = factory.getShape("O");
        box3.display("红色");

        AbstractBox box4 = factory.getShape("O");
        box4.display("绿色");

        System.out.println(box3 == box4);
    }
}
