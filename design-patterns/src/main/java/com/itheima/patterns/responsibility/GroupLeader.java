package com.itheima.patterns.responsibility;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/11:24
 * @ClassName GroupLeader
 * @Description
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(Handler.THREE);
    }

    @Override
    protected void handleRequest(LeaveRequest request) {
        System.out.println("申请人：" + request.getName());
        System.out.println("请假天数：" + request.getDays());
        System.out.println("原因：" + request.getContent());
        System.out.println("小组长审批：同意");
    }
}
