package com.example.structural.decorator;

/**
 * 装饰器模式 - 抽象装饰器
 * 所有调味品装饰器的基类
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    // 重写获取描述方法，需要包含所装饰的饮料的描述
    @Override
    public abstract String getDescription();
}