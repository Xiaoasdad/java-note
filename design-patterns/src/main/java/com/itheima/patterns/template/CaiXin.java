package com.itheima.patterns.template;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/19/16:47
 * @ClassName CaiXin
 * @Description
 */
public class CaiXin extends cookTemplate{
    @Override
    public void addVegetable() {
        System.out.println("菜心下锅");
    }

    @Override
    public void addSauce() {
        System.out.println("添加蒜蓉");
    }
}
