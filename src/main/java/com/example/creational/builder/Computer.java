package com.example.creational.builder;

import lombok.Data;
import lombok.ToString;

/**
 * 建造者模式 - 产品类
 * 电脑由多个部件组成，是一个复杂的产品
 */
@Data
@ToString
public class Computer {
    private String cpu;        // CPU
    private String motherboard; // 主板
    private String memory;     // 内存
    private String storage;    // 存储
    private String gpu;        // 显卡
    private String powerSupply;// 电源
    private String case_;      // 机箱
}