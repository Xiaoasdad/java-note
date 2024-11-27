package com.itheima.patterns.responsibility;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/11:29
 * @ClassName Manager
 * @Description
 */
public class Manager extends Handler{
    public Manager() {
        super(Handler.SEVEN);
    }

    @Override
    protected void handleRequest(LeaveRequest request) {
        System.out.println("部门经理审批：同意");
    }
}
