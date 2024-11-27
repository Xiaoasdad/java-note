package com.itheima.patterns.combination;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/14/23:19
 * @ClassName MenuComponent
 * @Description 抽象根结点
 */
public abstract class MenuComponent {
//    菜单组件的名称
    protected String name;
//    菜单组件的层级
    protected Integer level;

    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

//    打印菜单名称（包含子菜单和子菜单项）
    abstract void print();

}
