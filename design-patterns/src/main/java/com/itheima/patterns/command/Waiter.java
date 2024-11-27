package com.itheima.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/20/19:23
 * @ClassName Waiter
 * @Description
 */
public class Waiter {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command cmd) {
        commandList.add(cmd);
    }

    public void orderUp() {
        if(!commandList.isEmpty()) {
            for (Command command : commandList) {
                command.execute();
            }
        }
    }
}
