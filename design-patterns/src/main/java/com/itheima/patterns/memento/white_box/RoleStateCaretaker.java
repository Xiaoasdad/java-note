package com.itheima.patterns.memento.white_box;

import java.util.Stack;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/23/18:59
 * @ClassName RoleStateCaretaker
 * @Description 备忘录负责人角色
 */
public class RoleStateCaretaker {

    private Stack<RoleStateMemento> mementoStack = new Stack<>();

    public void addMemento(RoleStateMemento memento) {
        mementoStack.add(memento);
    }

    public RoleStateMemento getMemento() {
        return mementoStack.pop();
    }

}
