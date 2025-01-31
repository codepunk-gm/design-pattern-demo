package com.example.creational.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * 原型模式 - 矩形类
 * 继承自Shape抽象类，实现具体的绘制方法
 */
@Slf4j
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        log.info("绘制矩形");
    }
}