package com.example.structural.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配器模式 - 具体的VLC播放器类
 * 实现高级媒体播放器接口
 */
@Slf4j
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        log.info("播放VLC文件: {}", fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 什么也不做，VLC播放器不支持播放MP4格式
    }
}