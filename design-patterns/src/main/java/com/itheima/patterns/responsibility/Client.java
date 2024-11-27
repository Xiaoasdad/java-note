package com.itheima.patterns.responsibility;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/11:33
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
//        创建处理者对象
        GroupLeader handler1 = new GroupLeader();
        Manager handler2 = new Manager();
        GeneralManager handler3 = new GeneralManager();
//        创建责任链
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        LeaveRequest request = new LeaveRequest("张三", 9, "身体不适");
        handler1.submit(request);

    }
}
