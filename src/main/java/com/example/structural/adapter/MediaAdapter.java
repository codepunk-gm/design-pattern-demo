package com.example.structural.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配器模式 - 适配器类
 * 实现MediaPlayer接口，并使用AdvancedMediaPlayer对象来播放所需的格式
 */
@Slf4j
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        } else {
            log.warn("不支持的音频格式: {}", audioType);
        }
    }
}