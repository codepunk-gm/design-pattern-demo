package com.example.structural.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * 组合模式 - 叶子节点
 * 实现文件系统中的文件类
 */
@Slf4j
public class File extends FileSystemComponent {
    private long size;

    public File(String name, String path, long size) {
        super(name, path);
        this.size = size;
        log.info("创建文件: {}, 大小: {} bytes", path, size);
    }

    @Override
    public void display() {
        log.info("文件: {}, 大小: {} bytes", path, size);
    }

    @Override
    public long getSize() {
        return size;
    }
}