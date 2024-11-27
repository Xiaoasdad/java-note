package com.itheima.patterns.state;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/16:07
 * @ClassName OpenState
 * @Description
 */
public class OpenState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯打开");
    }

    @Override
    public void close() {
//        更改上下文中的状态
        super.context.setLiftState(Context.CLOSE_STATE);
//        调用上下文中状态的close方法
        super.context.getLiftState().close();

    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {

    }
}
