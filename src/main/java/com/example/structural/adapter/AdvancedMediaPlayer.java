package com.example.structural.adapter;

/**
 * 适配器模式 - 被适配的接口
 * 定义高级媒体播放器的功能
 */
public interface AdvancedMediaPlayer {
    // 播放VLC格式文件
    void playVlc(String fileName);
    
    // 播放MP4格式文件
    void playMp4(String fileName);
}