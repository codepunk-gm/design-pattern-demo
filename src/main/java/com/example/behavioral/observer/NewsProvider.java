package com.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 新闻提供者类 - 被观察者
 * 负责管理订阅者列表并在新闻更新时通知所有订阅者
 */
public class NewsProvider {
    private List<NewsSubscriber> subscribers;

    public NewsProvider() {
        this.subscribers = new ArrayList<>();
    }

    /**
     * 添加订阅者
     * @param subscriber 要添加的订阅者
     */
    public void attach(NewsSubscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    /**
     * 移除订阅者
     * @param subscriber 要移除的订阅者
     */
    public void detach(NewsSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    /**
     * 通知所有订阅者新闻更新
     * @param news 更新的新闻内容
     */
    public void notifyUpdate(String news) {
        for (NewsSubscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}