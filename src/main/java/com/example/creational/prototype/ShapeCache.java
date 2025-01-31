package com.example.creational.prototype;

import lombok.extern.slf4j.Slf4j;

import java.util.Hashtable;

/**
 * 原型模式 - 形状缓存类
 * 用于存储和管理形状对象的克隆
 */
@Slf4j
public class ShapeCache {
    // 使用Hashtable存储形状对象
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    // 根据ID获取形状对象的克隆
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        log.info("获取形状ID: {}, 类型: {}", shapeId, cachedShape.getType());
        return (Shape) cachedShape.clone();
    }

    // 加载形状对象到缓存
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        log.info("形状对象已加载到缓存");
    }
}