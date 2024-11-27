package com.itheima.patterns.memento.white_box;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/23/18:42
 * @ClassName RoleStateMemento
 * @Description 备忘录角色
 */
public class RoleStateMemento {

    private int vit; // 生命
    private int atk; // 攻击力
    private int def; // 防御力

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
