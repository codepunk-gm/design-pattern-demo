package com.example.creational.abstractfactory;

/**
 * 抽象工厂：GUI工厂
 * 定义创建一系列相关UI组件的接口
 */
public interface GUIFactory {
    /**
     * 创建按钮
     * @return 按钮实例
     */
    Button createButton();

    /**
     * 创建文本框
     * @return 文本框实例
     */
    TextField createTextField();
}