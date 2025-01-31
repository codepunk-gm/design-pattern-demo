package com.example.behavioral.observer;

/**
 * 新闻订阅者类 - 观察者
 * 负责接收和处理新闻更新
 */
public class NewsSubscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    /**
     * 接收新闻更新并处理
     * @param news 更新的新闻内容
     */
    public void update(String news) {
        System.out.println(name + " 收到新闻: " + news);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        NewsSubscriber that = (NewsSubscriber) obj;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}