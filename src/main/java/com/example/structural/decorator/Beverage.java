package com.example.structural.decorator;

/**
 * 装饰器模式 - 抽象组件
 * 定义饮料的基本属性和方法
 */
public abstract class Beverage {
    protected String description = "未知饮料";

    public String getDescription() {
        return description;
    }

    // 计算饮料的价格
    public abstract double cost();
}