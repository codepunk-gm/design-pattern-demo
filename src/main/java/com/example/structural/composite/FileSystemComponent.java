package com.example.structural.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * 组合模式 - 抽象组件
 * 定义文件系统中的抽象组件，可以是文件或目录
 */
@Slf4j
public abstract class FileSystemComponent {
    protected String name;
    protected String path;

    public FileSystemComponent(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public abstract void display();
    public abstract long getSize();
}