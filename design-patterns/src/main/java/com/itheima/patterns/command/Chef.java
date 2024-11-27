package com.itheima.patterns.command;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/20/18:43
 * @ClassName Chef
 * @Description 接收者对象
 */
public class Chef {

    public void makeFood(String name, int num) {
        System.out.println(num + "份" + name);
    }
}
