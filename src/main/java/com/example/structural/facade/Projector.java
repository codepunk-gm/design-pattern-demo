package com.example.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * 外观模式 - 子系统类
 * 投影仪类，负责处理投影相关的操作
 */
@Slf4j
public class Projector {
    public void on() {
        log.info("打开投影仪");
    }

    public void off() {
        log.info("关闭投影仪");
    }

    public void setInput(String input) {
        log.info("设置投影仪输入源: {}", input);
    }

    public void setWideScreenMode() {
        log.info("设置投影仪宽屏模式");
    }
}