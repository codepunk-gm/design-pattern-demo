package com.example.structural.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配器模式 - 具体的MP4播放器类
 * 实现高级媒体播放器接口
 */
@Slf4j
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // 什么也不做，MP4播放器不支持播放VLC格式
    }

    @Override
    public void playMp4(String fileName) {
        log.info("播放MP4文件: {}", fileName);
    }
}