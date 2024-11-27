package com.itheima.patterns.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/20/18:34
 * @ClassName Order
 * @Description 订单
 */
public class Order {
//    餐桌号码
    private int orderNum;

//    点餐餐品与份数
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
