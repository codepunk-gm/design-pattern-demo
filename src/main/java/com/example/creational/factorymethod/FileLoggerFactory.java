package com.example.creational.factorymethod;

/**
 * 具体工厂：文件日志记录器工厂
 * 实现了LoggerFactory接口，负责创建FileLogger实例
 */
public class FileLoggerFactory implements LoggerFactory {
    private String fileName;

    public FileLoggerFactory(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Logger createLogger() {
        return new FileLogger(fileName);
    }
}