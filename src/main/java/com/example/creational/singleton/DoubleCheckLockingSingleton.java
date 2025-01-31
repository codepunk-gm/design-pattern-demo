package com.example.creational.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 双重检查锁单例模式
 * 优点：
 * 1. 实现了懒加载
 * 2. 线程安全
 * 3. 同步锁只在第一次创建实例时使用，性能较好
 * 
 * 缺点：
 * 1. 实现较复杂
 * 2. 由于Java内存模型的原因，需要使用volatile关键字
 */
@Slf4j
public class DoubleCheckLockingSingleton {
    private DoubleCheckLockingSingleton() {
        log.info("双重检查锁单例模式 - 创建实例");
    }

    // 使用volatile关键字保证可见性和有序性
    private static volatile DoubleCheckLockingSingleton instance;

    public static DoubleCheckLockingSingleton getInstance() {
        // 第一次检查，避免不必要的同步
        if (instance == null) {
            // 同步锁
            synchronized (DoubleCheckLockingSingleton.class) {
                // 第二次检查，确保只创建一个实例
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }

    // 模拟数据库连接
    public void connect() {
        log.info("双重检查锁单例模式 - 连接数据库");
    }

    // 模拟关闭连接
    public void disconnect() {
        log.info("双重检查锁单例模式 - 断开数据库连接");
    }
}