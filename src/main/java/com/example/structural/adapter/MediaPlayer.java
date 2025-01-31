package com.example.structural.adapter;

/**
 * 适配器模式 - 目标接口
 * 定义客户端使用的接口
 */
public interface MediaPlayer {
    // 播放音频文件
    void play(String audioType, String fileName);
}