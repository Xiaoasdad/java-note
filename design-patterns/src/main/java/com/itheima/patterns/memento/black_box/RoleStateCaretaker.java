package com.itheima.patterns.memento.black_box;

import java.util.Stack;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/23/18:59
 * @ClassName RoleStateCaretaker
 * @Description 备忘录负责人角色
 */
public class RoleStateCaretaker {

    private Stack<Memento> mementoStack = new Stack<>();

    public void addMemento(Memento memento) {
        mementoStack.add(memento);
    }

    public Memento getMemento() {
        return mementoStack.pop();
    }

}
