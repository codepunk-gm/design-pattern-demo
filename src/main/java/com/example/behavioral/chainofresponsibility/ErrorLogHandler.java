package com.example.behavioral.chainofresponsibility;

/**
 * 错误日志处理器
 * 责任链模式中的具体处理者，处理错误日志
 */
public class ErrorLogHandler extends LogHandler {
    public static final int ERROR = 3;

    public ErrorLogHandler() {
        this.level = ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("[错误日志] ERROR: " + message);
    }
}