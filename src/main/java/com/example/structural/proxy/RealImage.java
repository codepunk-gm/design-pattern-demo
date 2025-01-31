package com.example.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 代理模式 - 真实主题
 * 实现真实的图片加载和显示功能
 */
@Slf4j
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        log.info("从磁盘加载图片: {}...", fileName);
    }

    @Override
    public void display() {
        log.info("显示图片: {}", fileName);
    }
}