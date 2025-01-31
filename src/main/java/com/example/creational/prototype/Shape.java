package com.example.creational.prototype;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 原型模式 - 形状抽象类
 * 实现了Cloneable接口，允许对象克隆
 */
@Data
@Slf4j
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    // 抽象方法：绘制形状
    abstract void draw();

    // 重写clone方法，实现对象克隆
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
            log.info("克隆 {} 形状对象", this.type);
        } catch (CloneNotSupportedException e) {
            log.error("克隆对象失败: {}", e.getMessage());
        }
        return clone;
    }
}