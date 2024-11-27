package com.itheima.patterns.responsibility;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/11:02
 * @ClassName Handler
 * @Description 抽象处理者类
 */
public abstract class Handler {

    protected final static int INF = 0x3F3F3F3F;
    protected final static int THREE = 3;
    protected final static int SEVEN = 7;

//    能够批准的请假天数
    private int dayEnd;

//    下一处理人
    private Handler nextHandler;

    public Handler(int dayEnd) {
        this.dayEnd = dayEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void handleRequest(LeaveRequest request);

    public void submit(LeaveRequest request) {
//        当前处理人执行当前处理
        this.handleRequest(request);
//        若存在后续处理人，则向后传递
        if (nextHandler != null && request.getDays() > dayEnd){
            this.nextHandler.submit(request);
        } else {
            System.out.println("请求处理完毕");
        }

    }
}
