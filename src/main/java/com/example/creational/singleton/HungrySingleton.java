package com.example.creational.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 饿汉式单例模式
 * 优点：
 * 1. 实现简单，在类装载时就完成实例化，避免了线程同步问题
 * 2. 没有加锁，执行效率高
 * 
 * 缺点：
 * 1. 类装载时就完成实例化，没有达到懒加载的效果
 * 2. 如果从始至终未使用过这个实例，则会造成内存浪费
 */
@Slf4j
public class HungrySingleton {
    // 私有的构造方法，防止外部直接创建实例
    private HungrySingleton() {
        log.info("饿汉式单例模式 - 创建实例");
    }

    // 在类装载时就完成实例化
    private static final HungrySingleton instance = new HungrySingleton();

    // 提供一个公有的静态方法，返回实例对象
    public static HungrySingleton getInstance() {
        return instance;
    }

    // 模拟数据库连接
    public void connect() {
        log.info("饿汉式单例模式 - 连接数据库");
    }

    // 模拟关闭连接
    public void disconnect() {
        log.info("饿汉式单例模式 - 断开数据库连接");
    }
}