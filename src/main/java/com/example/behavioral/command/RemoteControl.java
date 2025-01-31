package com.example.behavioral.command;

import java.util.Stack;

/**
 * 遥控器类
 * 命令模式中的调用者（Invoker），用于存储和执行命令
 */
public class RemoteControl {
    private Command command;
    private final Stack<Command> commandHistory = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 按下按钮执行命令
     */
    public void pressButton() {
        if (command != null) {
            command.execute();
            commandHistory.push(command);
        }
    }

    /**
     * 撤销上一次的命令
     */
    public void pressUndo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}