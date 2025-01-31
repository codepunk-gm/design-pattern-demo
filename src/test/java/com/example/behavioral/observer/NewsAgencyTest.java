package com.example.behavioral.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 观察者模式单元测试类
 * 测试新闻订阅系统中的订阅、取消订阅和通知功能
 */
public class NewsAgencyTest {
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;
    private NewsProvider newsProvider;
    private NewsSubscriber subscriber1;
    private NewsSubscriber subscriber2;

    @BeforeEach
    void setUp() {
        // 保存原始的标准输出流并创建新的输出流用于测试
        originalOut = System.out;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // 初始化新闻提供者和订阅者
        newsProvider = new NewsProvider();
        subscriber1 = new NewsSubscriber("订阅者1");
        subscriber2 = new NewsSubscriber("订阅者2");
    }

    @AfterEach
    void tearDown() {
        // 恢复原始的标准输出流
        System.setOut(originalOut);        // 关闭输出流
        try {
            outputStream.close();
        } catch (Exception e) {
            // 忽略关闭异常
        }
    }

    @Test
    void testSubscribe() {
        // 测试订阅功能
        System.err.println("\n执行订阅测试...");
        newsProvider.attach(subscriber1);
        newsProvider.notifyUpdate("测试新闻1");

        String output = outputStream.toString();
        System.err.println("测试输出: " + output);
        assertTrue(output.contains("订阅者1 收到新闻: 测试新闻1"));
        System.err.println("订阅测试完成")
    }

    @Test
    void testUnsubscribe() {
        // 测试取消订阅功能
        System.err.println("\n执行取消订阅测试...");
        newsProvider.attach(subscriber1);
        newsProvider.detach(subscriber1);
        newsProvider.notifyUpdate("测试新闻2");

        String output = outputStream.toString();
        System.err.println("测试输出: " + output);
        assertFalse(output.contains("订阅者1 收到新闻: 测试新闻2"));
        System.err.println("取消订阅测试完成")
    }

    @Test
    void testMultipleSubscribers() {
        // 测试多个订阅者
        System.err.println("\n执行多订阅者测试...");
        newsProvider.attach(subscriber1);
        newsProvider.attach(subscriber2);
        newsProvider.notifyUpdate("测试新闻3");

        String output = outputStream.toString();
        System.err.println("测试输出: " + output);
        assertTrue(output.contains("订阅者1 收到新闻: 测试新闻3"));
        assertTrue(output.contains("订阅者2 收到新闻: 测试新闻3"));
        System.err.println("多订阅者测试完成")
    }

    @Test
    void testNoSubscribers() {
        // 测试没有订阅者的情况
        System.err.println("\n执行无订阅者测试...");
        newsProvider.notifyUpdate("测试新闻4");
        String output = outputStream.toString();
        System.err.println("测试输出: " + output);
        assertTrue(output.isEmpty());
        System.err.println("无订阅者测试完成")
    }

    @Test
    void testResubscribe() {
        // 测试重新订阅功能
        System.err.println("\n执行重新订阅测试...");
        newsProvider.attach(subscriber1);
        newsProvider.detach(subscriber1);
        newsProvider.attach(subscriber1);
        newsProvider.notifyUpdate("测试新闻5");

        String output = outputStream.toString();
        System.err.println("测试输出: " + output);
        assertTrue(output.contains("订阅者1 收到新闻: 测试新闻5"));
        System.err.println("重新订阅测试完成")
    }
}