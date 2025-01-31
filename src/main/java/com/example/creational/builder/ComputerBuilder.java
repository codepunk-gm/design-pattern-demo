package com.example.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * 建造者模式 - 抽象建造者类
 * 定义构建电脑各个部件的抽象方法
 */
@Slf4j
public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    public abstract void buildCPU(String cpu);
    public abstract void buildMotherboard(String motherboard);
    public abstract void buildMemory(String memory);
    public abstract void buildStorage(String storage);
    public abstract void buildGPU(String gpu);
    public abstract void buildPowerSupply(String powerSupply);
    public abstract void buildCase(String case_);

    public Computer getResult() {
        log.info("电脑组装完成: {}", computer);
        return computer;
    }
}