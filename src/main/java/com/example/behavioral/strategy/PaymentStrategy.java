package com.example.behavioral.strategy;

/**
 * 策略模式 - 策略接口
 * 定义支付策略的接口
 */
public interface PaymentStrategy {
    void pay(double amount);
}