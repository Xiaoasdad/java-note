package com.itheima.patterns.memento.black_box;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/23/19:08
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        RoleStateCaretaker caretaker = new RoleStateCaretaker();

        GameRole role = new GameRole();
        role.init();
        role.stateDisplay();
        // 备份当前状态
        caretaker.addMemento(role.saveState());

        System.out.println("大战后");
        role.fight();
        role.stateDisplay();

        // 恢复大战前状态
        System.out.println("读取状态");
        role.loadState(caretaker.getMemento());
        role.stateDisplay();

    }
}
