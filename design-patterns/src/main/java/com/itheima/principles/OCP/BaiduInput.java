package com.itheima.principles.OCP;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/17/19:13
 * @ClassName BaiduInput
 * @Description
 */
public class BaiduInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
