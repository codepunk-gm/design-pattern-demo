package com.example.creational.factorymethod;

/**
 * 具体工厂：控制台日志记录器工厂
 * 实现了LoggerFactory接口，负责创建ConsoleLogger实例
 */
public class ConsoleLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}