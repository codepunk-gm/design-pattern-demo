package com.example.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式 - 享元工厂
 * 管理字体对象的创建和复用
 */
@Slf4j
public class FontFactory {
    private static final Map<String, Font> fonts = new HashMap<>();

    public static Font getFont(String fontName) {
        Font font = fonts.get(fontName);
        if (font == null) {
            font = new ConcreteFont(fontName);
            fonts.put(fontName, font);
            log.info("创建并缓存新字体: {}", fontName);
        } else {
            log.info("复用已有字体: {}", fontName);
        }
        return font;
    }
}