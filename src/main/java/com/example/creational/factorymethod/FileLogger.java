package com.example.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品：文件日志记录器
 * 实现了Logger接口,提供文件日志记录功能
 */
@Slf4j
public class FileLogger implements Logger {
    private String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
        log.info("创建文件日志记录器,文件名：{}",fileName);
    }

    @Override
    public void info(String message) {
        log.info("[文件日志] INFO: {} -> {}",fileName,message);
    }

    @Override
    public void warning(String message) {
        log.warn("[文件日志] WARN: {} -> {}",fileName,message);
    }

    @Override
    public void error(String message, Exception e) {
        log.error("[文件日志] ERROR: {} -> {}",fileName,message,e);
    }

    @Override
    public void close() {
        log.info("关闭文件日志记录器：{}",fileName);
    }
}