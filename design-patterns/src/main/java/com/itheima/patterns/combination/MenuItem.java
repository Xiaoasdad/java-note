package com.itheima.patterns.combination;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/19/15:26
 * @ClassName MenuItem
 * @Description 叶子节点
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    void print() {
        for(int i = 1; i < level; ++i) {
            System.out.print("- ");
        }
        System.out.println(name);
    }
}
