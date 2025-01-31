package com.example.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品：Windows风格文本框
 * 实现了TextField接口，提供Windows风格的文本框实现
 */
@Slf4j
public class WindowsTextField implements TextField {
    private String text;
    private String placeholder;

    @Override
    public void render() {
        log.info("渲染Windows风格文本框：{}", text);
    }

    @Override
    public void onFocus() {
        log.info("Windows文本框获得焦点");
    }

    @Override
    public void onBlur() {
        log.info("Windows文本框失去焦点");
    }

    @Override
    public void setText(String text) {
        this.text = text;
        log.info("设置Windows文本框内容：{}", text);
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        log.info("设置Windows文本框占位符：{}", placeholder);
    }
}