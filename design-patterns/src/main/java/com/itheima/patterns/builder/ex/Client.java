package com.itheima.patterns.builder.ex;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/7/18:45
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {

        Computer computer = new Computer.Builder()
                .cpu("inter")
                .mainBoard("华硕")
                .screen("三星")
                .memory("金士顿")
                .build();

        System.out.println(computer);
    }
}
