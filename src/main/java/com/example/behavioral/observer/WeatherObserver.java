package com.example.behavioral.observer;

/**
 * 观察者模式 - 观察者接口
 * 定义天气观察者的更新方法
 */
public interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
}