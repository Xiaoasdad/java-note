package com.itheima.patterns.combination;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/19/15:27
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        MenuComponent menu = new Menu("系统管理",1);

        MenuComponent menu1 = new Menu("菜单管理",2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("删除菜单", 3));

        MenuComponent menu2 = new Menu("权限管理",2);
        menu2.add(new MenuItem("页面访问", 3));
        menu2.add(new MenuItem("提交保存", 3));

        menu.add(menu1);
        menu.add(menu2);

        menu.print();


    }
}
