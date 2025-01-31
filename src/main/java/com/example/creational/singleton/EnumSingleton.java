package com.example.creational.singleton;


/**
 * 枚举单例模式
 * 优点：
 * 1. 实现最简单
 * 2. 枚举类型是线程安全的
 * 3. 自动支持序列化机制
 * 4. 防止反射攻击
 * 
 * 缺点：
 * 1. 不能实现懒加载
 * 2. 可能会增加类的初始化时间
 */
public enum EnumSingleton {
    // 定义一个枚举的元素，它就是单例类的一个实例
    INSTANCE;

    // 在枚举类型实例化时会调用构造方法
    EnumSingleton() {
        System.out.println("枚举单例模式 - 创建实例");
    }

    // 模拟数据库连接
    public void connect() {
        System.out.println("枚举单例模式 - 连接数据库");
    }

    // 模拟关闭连接
    public void disconnect() {
        System.out.println("枚举单例模式 - 断开数据库连接");
    }
}