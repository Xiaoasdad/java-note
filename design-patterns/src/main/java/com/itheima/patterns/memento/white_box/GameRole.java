package com.itheima.patterns.memento.white_box;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/23/18:38
 * @ClassName GameRole
 * @Description 发起人角色
 */
public class GameRole {

    private int vit; // 生命
    private int atk; // 攻击力
    private int def; // 防御力

    // 初始化角色信息
    public void init() {
        this.vit = 100;
        this.atk = 12;
        this.def = 5;
    }

    public void fight() {
        this.vit = 0;
    }

    // 保存状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    // 恢复状态
    public void loadState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void stateDisplay() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", def=" + def +
                '}';
    }
}
