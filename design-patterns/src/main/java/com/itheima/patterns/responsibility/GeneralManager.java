package com.itheima.patterns.responsibility;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/11:32
 * @ClassName GeneralManager
 * @Description
 */
public class GeneralManager extends Handler{
    public GeneralManager() {
        super(Handler.INF);
    }

    @Override
    protected void handleRequest(LeaveRequest request) {
        System.out.println("总经理审批：同意");
    }
}
