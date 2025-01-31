package com.example.behavioral.command;

/**
 * 命令接口
 * 定义执行操作的统一接口
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();
    
    /**
     * 撤销命令
     */
    void undo();
}