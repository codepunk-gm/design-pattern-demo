package com.example.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式 - 主题类
 * 实现天气数据的管理和观察者的通知功能
 */
@Slf4j
public class WeatherData {
    private List<WeatherObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
        log.info("创建天气数据主题");
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
        log.info("注册天气观察者");
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
        log.info("移除天气观察者");
    }

    public void notifyObservers() {
        log.info("通知所有观察者天气数据更新");
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        log.info("设置新的天气数据 - 温度: {}°C, 湿度: {}%, 气压: {}hPa", temperature, humidity, pressure);
        notifyObservers();
    }
}