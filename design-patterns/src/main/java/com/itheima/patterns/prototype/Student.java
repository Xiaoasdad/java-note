package com.itheima.patterns.prototype;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/6/21:58
 * @ClassName Student
 * @Description
 */
public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
