package com.itheima.patterns.template;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/19/16:35
 * @ClassName cookTemplate
 * @Description
 */
public abstract class cookTemplate {

//    模板方法定义
    public final void cook(){
        pourOil();
        addVegetable();
        addSauce();
        fry();
    }

    protected void pourOil(){
        System.out.println("倒油");
    }

    public abstract void addVegetable();

    public abstract void addSauce();

    protected void fry(){
        System.out.println("翻炒");
    }
}
