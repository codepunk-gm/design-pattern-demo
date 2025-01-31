package com.example.creational.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 懒汉式单例模式（线程安全，同步方法）
 * 优点：
 * 1. 实现了懒加载
 * 2. 线程安全，通过synchronized关键字实现同步
 * 
 * 缺点：
 * 1. 同步方法效率低，每次获取实例都要进行同步
 * 2. 实际开发中不推荐使用
 */
@Slf4j
public class SynchronizedLazySingleton {
    // 私有构造方法
    private SynchronizedLazySingleton() {
        log.info("同步方法懒汉式单例模式 - 创建实例");
    }

    // 声明静态变量，但不初始化
    private static SynchronizedLazySingleton instance;

    // 提供一个同步的公有静态方法，在第一次调用时创建实例
    public static synchronized SynchronizedLazySingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazySingleton();
        }
        return instance;
    }

    // 模拟数据库连接
    public void connect() {
        log.info("同步方法懒汉式单例模式 - 连接数据库");
    }

    // 模拟关闭连接
    public void disconnect() {
        log.info("同步方法懒汉式单例模式 - 断开数据库连接");
    }
}