package com.itheima.patterns.builder.bike;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/7/16:45
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {

        MobileBuilder builder = new MobileBuilder();

        // 创建指挥者对象，并指挥组装
        Director director = new Director(builder);
        Bike bike = director.construct();

        System.out.println(bike.getFrame());

    }
}
