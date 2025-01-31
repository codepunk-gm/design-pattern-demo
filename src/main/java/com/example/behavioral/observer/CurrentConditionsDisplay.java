package com.example.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 观察者模式 - 具体观察者
 * 实现当前天气状况的显示功能
 */
@Slf4j
public class CurrentConditionsDisplay implements WeatherObserver {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        log.info("当前天气状况：");
        log.info("温度: {}°C", temperature);
        log.info("湿度: {}%", humidity);
        log.info("气压: {}hPa", pressure);
    }
}