package com.itheima.patterns.state;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/15:59
 * @ClassName LiftState
 * @Description 抽象状态类
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void stop();
    public abstract void run();

}
