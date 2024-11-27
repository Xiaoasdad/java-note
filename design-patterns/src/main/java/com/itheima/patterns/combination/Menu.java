package com.itheima.patterns.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/19/14:05
 * @ClassName Menu
 * @Description 树枝节点
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();

    public Menu(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponentList.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponentList.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    void print() {
        for(int i = 1; i < level; ++i) {
            System.out.print("- ");
        }
        System.out.println(name);
//        迭代遍历子菜单
        for (MenuComponent component : menuComponentList) {
            component.print();
        }
    }
}
