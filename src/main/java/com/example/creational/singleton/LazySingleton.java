package com.example.creational.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 懒汉式单例模式（线程不安全）
 * 优点：
 * 1. 实现了懒加载，节约了内存资源
 * 2. 实现简单，容易理解
 * 
 * 缺点：
 * 1. 线程不安全，在多线程环境下可能会创建多个实例
 * 2. 不适用于生产环境
 */
@Slf4j
public class LazySingleton {
    // 私有构造方法
    private LazySingleton() {
        log.info("懒汉式单例模式 - 创建实例");
    }

    // 声明静态变量，但不初始化
    private static LazySingleton instance;

    // 提供一个公有的静态方法，在第一次调用时创建实例
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // 模拟数据库连接
    public void connect() {
        log.info("懒汉式单例模式 - 连接数据库");
    }

    // 模拟关闭连接
    public void disconnect() {
        log.info("懒汉式单例模式 - 断开数据库连接");
    }
}