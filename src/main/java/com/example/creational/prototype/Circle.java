package com.example.creational.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * 原型模式 - 圆形类
 * 继承自Shape抽象类，实现具体的绘制方法
 */
@Slf4j
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        log.info("绘制圆形");
    }
}