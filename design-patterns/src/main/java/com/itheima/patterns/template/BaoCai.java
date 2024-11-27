package com.itheima.patterns.template;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/19/16:45
 * @ClassName BaoCai
 * @Description
 */
public class BaoCai extends cookTemplate{


    @Override
    public void addVegetable() {
        System.out.println("包菜下锅");
    }

    @Override
    public void addSauce() {
        System.out.println("添加辣椒");
    }
}
