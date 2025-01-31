package com.example.structural.bridge;

/**
 * 桥接模式 - 实现接口
 * 定义设备的基本功能
 */
public interface Device {
    // 开关状态
    boolean isEnabled();
    void enable();
    void disable();

    // 音量控制
    int getVolume();
    void setVolume(int volume);

    // 频道控制
    int getChannel();
    void setChannel(int channel);

    // 获取状态信息
    String getStatus();
}