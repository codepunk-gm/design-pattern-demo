package com.example.behavioral.command;

/**
 * 电灯类
 * 命令模式中的接收者（Receiver），知道如何执行具体的操作
 */
public class Light {
    private boolean isOn = false;
    private final String location;

    public Light(String location) {
        this.location = location;
    }

    /**
     * 开灯操作
     */
    public void turnOn() {
        isOn = true;
        System.out.println(location + " 的灯已打开");
    }

    /**
     * 关灯操作
     */
    public void turnOff() {
        isOn = false;
        System.out.println(location + " 的灯已关闭");
    }

    /**
     * 获取灯的状态
     */
    public boolean isOn() {
        return isOn;
    }
}