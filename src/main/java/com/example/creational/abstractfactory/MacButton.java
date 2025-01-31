package com.example.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品：Mac风格按钮
 * 实现了Button接口，提供Mac风格的按钮实现
 */
@Slf4j
public class MacButton implements Button {
    private String text;

    @Override
    public void render() {
        log.info("渲染Mac风格按钮：{}", text);
    }

    @Override
    public void onClick() {
        log.info("Mac按钮被点击：{}", text);
    }

    @Override
    public void setText(String text) {
        this.text = text;
        log.info("设置Mac按钮文本：{}", text);
    }

    @Override
    public String getText() {
        return this.text;
    }
}