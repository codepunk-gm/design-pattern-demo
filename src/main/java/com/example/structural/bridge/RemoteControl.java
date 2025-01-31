package com.example.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 桥接模式 - 抽象类
 * 定义遥控器的基本操作，桥接设备接口
 */
@Slf4j
public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
        log.info("创建遥控器，连接设备: {}", device.getClass().getSimpleName());
    }

    // 开关操作
    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    // 音量控制
    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
        log.info("音量降低到: {}", device.getVolume());
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
        log.info("音量提高到: {}", device.getVolume());
    }

    // 频道控制
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
        log.info("切换到上一个频道: {}", device.getChannel());
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
        log.info("切换到下一个频道: {}", device.getChannel());
    }
}