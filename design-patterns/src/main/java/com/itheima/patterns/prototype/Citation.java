package com.itheima.patterns.prototype;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/6/21:50
 * @ClassName Citation
 * @Description 原型，奖状类
 */
public class Citation implements Cloneable {

    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student student) {
        this.stu = student;
    }

    public void show(){
        System.out.println(stu.getName() + "同学，荣获三好学生");
    }

    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
