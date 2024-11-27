package com.itheima.patterns.responsibility;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/21/10:54
 * @ClassName LeaveRequest
 * @Description 请假条，请求对象
 */
public class LeaveRequest {
    /**
     * 请假人姓名
     * 请假日期
     * 原因
     */
    private String name;
    private int days;
    private String content;

    public LeaveRequest(String name, int days, String content) {
        this.name = name;
        this.days = days;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
