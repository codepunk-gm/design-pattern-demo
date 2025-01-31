package com.example.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 策略模式 - 具体策略
 * 实现信用卡支付策略
 */
@Slf4j
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        log.info("初始化信用卡支付，卡号: {}，有效期: {}", cardNumber, expiryDate);
    }

    @Override
    public void pay(double amount) {
        log.info("使用信用卡支付: ￥{}", amount);
        log.info("信用卡支付完成");
    }
}