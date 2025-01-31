package com.example.creational.factorymethod;

/**
 * 抽象产品：日志记录器
 * 定义所有具体日志记录器都必须实现的方法
 */
public interface Logger {
    /**
     * 记录信息日志
     * @param message 日志信息
     */
    void info(String message);
    
    /**
     * 记录警告日志
     * @param message 日志信息
     */
    void warning(String message);
    
    /**
     * 记录错误日志
     * @param message 日志信息
     * @param e 异常信息
     */
    void error(String message, Exception e);
    
    /**
     * 关闭日志记录器
     */
    void close();
}