package com.example.creational.abstractfactory;

/**
 * 抽象产品：文本框
 * 定义所有具体文本框都必须实现的方法
 */
public interface TextField {
    /**
     * 渲染文本框
     */
    void render();

    /**
     * 获取焦点事件
     */
    void onFocus();

    /**
     * 失去焦点事件
     */
    void onBlur();

    /**
     * 设置文本内容
     * @param text 文本内容
     */
    void setText(String text);

    /**
     * 获取文本内容
     * @return 文本内容
     */
    String getText();

    /**
     * 设置占位符文本
     * @param placeholder 占位符文本
     */
    void setPlaceholder(String placeholder);
}