package com.example.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 桥接模式 - 具体实现类
 * 实现电视设备的具体功能
 */
@Slf4j
public class TV implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        log.info("电视已开启");
    }

    @Override
    public void disable() {
        on = false;
        log.info("电视已关闭");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
        log.info("电视音量设置为: {}", this.volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        log.info("电视频道切换到: {}", this.channel);
    }

    @Override
    public String getStatus() {
        return String.format("电视状态 - 电源: %s, 音量: %d, 频道: %d",
                on ? "开启" : "关闭", volume, channel);
    }
}