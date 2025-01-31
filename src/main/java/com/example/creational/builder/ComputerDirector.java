package com.example.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * 建造者模式 - 指挥者类
 * 负责控制建造过程，确保按照正确的顺序构建电脑
 */
@Slf4j
public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
        log.info("创建电脑指挥者，使用建造者: {}", builder.getClass().getSimpleName());
    }

    // 构建游戏电脑
    public Computer constructGamingComputer() {
        log.info("开始构建游戏电脑");
        builder.buildCPU("Intel Core i9-12900K");
        builder.buildMotherboard("ROG MAXIMUS Z690 HERO");
        builder.buildMemory("G.SKILL Trident Z5 RGB 32GB");
        builder.buildStorage("Samsung 980 PRO 2TB");
        builder.buildGPU("NVIDIA GeForce RTX 4090");
        builder.buildPowerSupply("Corsair AX1600i");
        builder.buildCase("Lian Li PC-O11 Dynamic");
        return builder.getResult();
    }

    // 构建办公电脑
    public Computer constructOfficeComputer() {
        log.info("开始构建办公电脑");
        builder.buildCPU("Intel Core i5-12400");
        builder.buildMotherboard("ASUS PRIME B660M-A");
        builder.buildMemory("Crucial 16GB DDR4");
        builder.buildStorage("Samsung 870 EVO 500GB");
        builder.buildGPU("Intel UHD Graphics 730");
        builder.buildPowerSupply("Corsair CV550");
        builder.buildCase("Fractal Design Define Mini C");
        return builder.getResult();
    }
}