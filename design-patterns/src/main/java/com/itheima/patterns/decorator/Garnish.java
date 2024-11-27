package com.itheima.patterns.decorator;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/11/16:32
 * @ClassName Garnish
 * @Description 抽象装饰者类
 */
public abstract class Garnish extends FastFood{

//    声明快餐类变量
    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc) {
        // 设置配菜的价格和描述
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public float cost() {
        return getPrice() + fastFood.cost();
    }

    /*
     * 此处重写 FastFood 类中的描述方法，是考虑到添加多个装饰时的递归调用
     * 使用 super.getDesc() 防止循环调用本类中的 getDesc() 方法
     * 或者将 desc 变量设置为 protected
     */
    @Override
    public String getDesc(){
        return desc + fastFood.getDesc();
    }

}
