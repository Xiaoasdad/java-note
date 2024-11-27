package com.itheima.principles.OCP;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/17/19:15
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        // 创建输入法对象
        BaiduInput input = new BaiduInput();
        // 创建默认皮肤对象
        DefaultSkin defaultSkin = new DefaultSkin();
        HeimaSkin heimaSkin = new HeimaSkin();

        input.setSkin(heimaSkin);
        input.display();
    }

}
