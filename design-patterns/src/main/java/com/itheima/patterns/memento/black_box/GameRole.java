package com.itheima.patterns.memento.black_box;

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
    public Memento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    // 恢复状态
    public void loadState(Memento memento) {
        // 由于静态分派，传入的 memento 并不知道是哪个子类，在此类型强制转换
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
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

    private class RoleStateMemento implements Memento {
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

        public int getAtk() {
            return atk;
        }

        public int getDef() {
            return def;
        }

    }
}
