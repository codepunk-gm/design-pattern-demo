package com.example.behavioral.chainofresponsibility;

/**
 * 文件日志处理器
 * 责任链模式中的具体处理者，处理文件日志
 */
public class FileLogHandler extends LogHandler {
    public static final int DEBUG = 2;

    public FileLogHandler() {
        this.level = DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("[文件日志] DEBUG: " + message);
    }
}