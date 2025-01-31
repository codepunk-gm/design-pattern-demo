package com.example.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * 建造者模式 - 具体建造者类
 * 实现构建游戏电脑的具体方法
 */
@Slf4j
public class GamingComputerBuilder extends ComputerBuilder {
    @Override
    public void buildCPU(String cpu) {
        computer.setCpu(cpu);
        log.info("安装CPU: {}", cpu);
    }

    @Override
    public void buildMotherboard(String motherboard) {
        computer.setMotherboard(motherboard);
        log.info("安装主板: {}", motherboard);
    }

    @Override
    public void buildMemory(String memory) {
        computer.setMemory(memory);
        log.info("安装内存: {}", memory);
    }

    @Override
    public void buildStorage(String storage) {
        computer.setStorage(storage);
        log.info("安装存储: {}", storage);
    }

    @Override
    public void buildGPU(String gpu) {
        computer.setGpu(gpu);
        log.info("安装显卡: {}", gpu);
    }

    @Override
    public void buildPowerSupply(String powerSupply) {
        computer.setPowerSupply(powerSupply);
        log.info("安装电源: {}", powerSupply);
    }

    @Override
    public void buildCase(String case_) {
        computer.setCase_(case_);
        log.info("安装机箱: {}", case_);
    }
}