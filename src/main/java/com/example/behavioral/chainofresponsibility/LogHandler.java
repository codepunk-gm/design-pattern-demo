package com.example.behavioral.chainofresponsibility;

/**
 * 日志处理器接口
 * 责任链模式中的处理者（Handler）
 */
public abstract class LogHandler {
    protected LogHandler nextHandler;
    protected int level;

    /**
     * 设置下一个处理者
     * @param nextHandler 下一个处理者
     * @return 返回下一个处理者，便于链式调用
     */
    public LogHandler setNext(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    /**
     * 处理日志请求
     * @param level 日志级别
     * @param message 日志消息
     */
    public void handleLog(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextHandler != null) {
            nextHandler.handleLog(level, message);
        }
    }

    /**
     * 实际的日志写入操作
     * @param message 日志消息
     */
    protected abstract void write(String message);
}