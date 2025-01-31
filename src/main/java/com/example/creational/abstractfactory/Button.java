package com.example.creational.abstractfactory;

/**
 * 抽象产品：按钮
 * 定义所有具体按钮都必须实现的方法
 */
public interface Button {
    /**
     * 渲染按钮
     */
    void render();

    /**
     * 点击事件
     */
    void onClick();

    /**
     * 设置按钮文本
     * @param text 按钮文本
     */
    void setText(String text);

    /**
     * 获取按钮文本
     * @return 按钮文本
     */
    String getText();
}