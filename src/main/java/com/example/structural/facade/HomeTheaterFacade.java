package com.example.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * 外观模式 - 外观类
 * 家庭影院外观类，为客户提供一个简单的接口来控制复杂的子系统
 */
@Slf4j
public class HomeTheaterFacade {
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade() {
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
        log.info("初始化家庭影院系统");
    }

    public void watchMovie() {
        log.info("准备观看电影...");
        projector.on();
        projector.setInput("HDMI");
        projector.setWideScreenMode();
        soundSystem.on();
        soundSystem.setSurroundSound();
        soundSystem.setVolume(8);
        log.info("开始观看电影");
    }

    public void endMovie() {
        log.info("结束观看电影...");
        soundSystem.off();
        projector.off();
        log.info("家庭影院系统已关闭");
    }
}