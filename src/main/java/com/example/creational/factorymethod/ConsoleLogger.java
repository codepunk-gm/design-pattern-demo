package com.example.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品：控制台日志记录器
 * 实现了Logger接口，提供控制台日志记录功能
 */
@Slf4j
public class ConsoleLogger implements Logger {
    public ConsoleLogger() {
        log.info("创建控制台日志记录器");
    }

    @Override
    public void info(String message) {
        log.info("[控制台日志] INFO: {}", message);
    }

    @Override
    public void warning(String message) {
        log.warn("[控制台日志] WARN: {}", message);
    }

    @Override
    public void error(String message, Exception e) {
        log.error("[控制台日志] ERROR: {}", message, e);
    }

    @Override
    public void close() {
        log.info("关闭控制台日志记录器");
    }
}