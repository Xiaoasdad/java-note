package com.itheima.patterns.state;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/15:58
 * @ClassName Context
 * @Description 上下文类
 */
public class Context {
    public final static OpenState OPEN_STATE = new OpenState();
    public final static CloseState CLOSE_STATE = new CloseState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
//        与 State 互相聚合，同时互相关联
        this.liftState.setContext(this);
    }
}
