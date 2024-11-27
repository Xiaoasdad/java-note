package com.itheima.patterns.state;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/16:16
 * @ClassName CloseState
 * @Description
 */
public class CloseState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.OPEN_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯关闭");
    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {

    }
}
