package com.example.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * 享元模式演示
 * 展示如何使用享元模式复用字体对象
 */
@Slf4j
public class FlyweightDemo {
    public static void main(String[] args) {
        // 使用Arial字体渲染不同文本
        Font arialFont = FontFactory.getFont("Arial");
        arialFont.render("Hello", 12);
        arialFont.render("World", 16);

        // 复用Arial字体
        Font sameArialFont = FontFactory.getFont("Arial");
        sameArialFont.render("Reused Font", 14);

        // 使用Times New Roman字体
        Font timesFont = FontFactory.getFont("Times New Roman");
        timesFont.render("Different Font", 12);
    }
}