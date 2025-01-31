package com.example.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 装饰器模式 - 具体组件
 * 实现具体的浓缩咖啡类
 */
@Slf4j
public class Espresso extends Beverage {
    public Espresso() {
        description = "浓缩咖啡";
        log.info("制作浓缩咖啡");
    }

    @Override
    public double cost() {
        log.info("浓缩咖啡价格: ￥20.0");
        return 20.0;
    }
}