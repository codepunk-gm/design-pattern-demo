package com.example.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * 享元模式 - 具体享元
 * 实现字体渲染的具体逻辑
 */
@Slf4j
public class ConcreteFont implements Font {
    private String fontName;

    public ConcreteFont(String fontName) {
        this.fontName = fontName;
        log.info("创建字体: {}", fontName);
    }

    @Override
    public void render(String text, int size) {
        log.info("使用字体 {} 渲染文本: {}, 大小: {}", fontName, text, size);
    }
}