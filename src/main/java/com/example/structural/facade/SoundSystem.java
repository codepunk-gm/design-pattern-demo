package com.example.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * 外观模式 - 子系统类
 * 音响系统类，负责处理音频相关的操作
 */
@Slf4j
public class SoundSystem {
    public void on() {
        log.info("打开音响系统");
    }

    public void off() {
        log.info("关闭音响系统");
    }

    public void setVolume(int level) {
        log.info("设置音量级别: {}", level);
    }

    public void setSurroundSound() {
        log.info("设置环绕声模式");
    }
}