package com.example.structural.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式 - 组合节点
 * 实现文件系统中的目录类
 */
@Slf4j
public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> children;

    public Directory(String name, String path) {
        super(name, path);
        this.children = new ArrayList<>();
        log.info("创建目录: {}", path);
    }

    public void add(FileSystemComponent component) {
        children.add(component);
        log.info("向目录 {} 添加组件: {}", path, component.path);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
        log.info("从目录 {} 移除组件: {}", path, component.path);
    }

    @Override
    public void display() {
        log.info("目录: {}", path);
        for (FileSystemComponent component : children) {
            component.display();
        }
    }

    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileSystemComponent component : children) {
            totalSize += component.getSize();
        }
        log.info("目录 {} 的总大小: {} bytes", path, totalSize);
        return totalSize;
    }
}