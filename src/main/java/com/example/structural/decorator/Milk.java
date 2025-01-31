package com.example.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 装饰器模式 - 具体装饰器
 * 实现为饮料添加牛奶的装饰器
 */
@Slf4j
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
        log.info("添加牛奶");
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 牛奶";
    }

    @Override
    public double cost() {
        log.info("牛奶价格: ￥2.0");
        return beverage.cost() + 2.0;
    }
}