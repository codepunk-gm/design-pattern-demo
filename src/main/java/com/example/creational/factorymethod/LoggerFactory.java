package com.example.creational.factorymethod;

/**
 * 抽象工厂：日志记录器工厂
 * 定义创建日志记录器的接口
 */
public interface LoggerFactory {
    /**
     * 创建日志记录器
     * @return 日志记录器实例
     */
    Logger createLogger();
}