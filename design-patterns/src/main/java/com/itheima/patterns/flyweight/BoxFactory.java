package com.itheima.patterns.flyweight;

import java.util.HashMap;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/15/14:12
 * @ClassName BoxFactory
 * @Description 享元工厂 + 饿汉式单例
 */
public class BoxFactory {
    private HashMap<String, AbstractBox> map;
    private static BoxFactory instance = new BoxFactory();

//  `在构造方法中构造缓存池
    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    public AbstractBox getShape(String name) {
        return map.get(name);
    }

    public static BoxFactory getInstance() {
        return instance;
    }
}
