package com.example.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 代理模式 - 代理主题
 * 实现图片的代理类，提供延迟加载功能
 */
@Slf4j
public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        log.info("创建图片代理: {}", fileName);
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}