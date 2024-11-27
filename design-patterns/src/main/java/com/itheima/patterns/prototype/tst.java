package com.itheima.patterns.prototype;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/6/21:55
 * @ClassName tst
 * @Description
 */
public class tst {
    public static void main(String[] args) throws Exception{
        Citation citation = new Citation();
        Student stu = new Student();
        citation.setStu(stu);

        Citation citation1 = citation.clone();

        citation.getStu().setName("神里绫华");
        citation1.getStu().setName("芙宁娜");

        citation.show();
        citation1.show();
        // 对于成员类学生类，由于不是基本属性，在浅克隆时新对象中的学生成员会直接指向原型中的成员
        // 导致两次输出都是张无忌
        // 通过序列化完成深拷贝
    }
}
