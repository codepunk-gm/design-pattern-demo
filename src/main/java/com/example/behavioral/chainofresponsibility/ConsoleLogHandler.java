package com.example.behavioral.chainofresponsibility;

/**
 * 控制台日志处理器
 * 责任链模式中的具体处理者，处理控制台日志
 */
public class ConsoleLogHandler extends LogHandler {
    public static final int INFO = 1;

    public ConsoleLogHandler() {
        this.level = INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("[控制台日志] INFO: " + message);
    }
}