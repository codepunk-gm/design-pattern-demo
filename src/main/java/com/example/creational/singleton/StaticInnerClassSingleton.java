package com.example.creational.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 静态内部类单例模式
 * 优点：
 * 1. 实现了延迟加载
 * 2. 利用JVM类加载机制保证线程安全
 * 3. 实现简单，性能好
 * 
 * 缺点：
 * 1. 可能会被反射破坏单例性
 */
@Slf4j
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        log.info("静态内部类单例模式 - 创建实例");
    }

    // 静态内部类，用于持有单例实例
    private static class SingletonHolder {
        // 在内部类加载时才创建实例
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    // 提供一个公有的静态方法，返回实例对象
    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    // 模拟数据库连接
    public void connect() {
        log.info("静态内部类单例模式 - 连接数据库");
    }

    // 模拟关闭连接
    public void disconnect() {
        log.info("静态内部类单例模式 - 断开数据库连接");
    }
}