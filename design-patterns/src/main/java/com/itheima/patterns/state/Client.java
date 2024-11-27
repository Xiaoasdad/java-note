package com.itheima.patterns.state;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/18:23
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
//        创建上下文对象
        Context context = new Context();
//        创建状态对象并设置为环境初始状态
        LiftState state = new CloseState();
        context.setLiftState(state);

//        当前状态获取上下文
        state.setContext(context);
        state.open();
        state.close();
    }
}
