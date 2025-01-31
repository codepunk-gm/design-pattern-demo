package com.example.structural.flyweight;

/**
 * 享元模式 - 抽象享元
 * 定义字体渲染的接口
 */
public interface Font {
    void render(String text, int size);
}