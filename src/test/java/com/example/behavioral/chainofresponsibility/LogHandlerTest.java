package com.example.behavioral.chainofresponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 责任链模式单元测试类
 * 测试日志处理链的功能和不同级别日志的处理逻辑
 */
public class LogHandlerTest {
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;
    private LogHandler consoleLogger;
    private LogHandler fileLogger;
    private LogHandler errorLogger;

    @BeforeEach
    void setUp() {
        // 保存原始的标准输出流并创建新的输出流用于测试
        originalOut = System.out;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // 创建责任链
        consoleLogger = new ConsoleLogHandler();
        fileLogger = new FileLogHandler();
        errorLogger = new ErrorLogHandler();

        // 设置责任链的顺序
        consoleLogger.setNext(fileLogger).setNext(errorLogger);
    }

    @Test
    void testConsoleLogHandler() {
        // 测试INFO级别的日志
        consoleLogger.handleLog(ConsoleLogHandler.INFO, "This is an info message");
        String output = outputStream.toString();
        assertTrue(output.contains("[控制台日志] INFO: This is an info message"));
        assertFalse(output.contains("[文件日志]"));
        assertFalse(output.contains("[错误日志]"));
    }

    @Test
    void testFileLogHandler() {
        // 测试DEBUG级别的日志
        consoleLogger.handleLog(FileLogHandler.DEBUG, "This is a debug message");
        String output = outputStream.toString();
        assertTrue(output.contains("[控制台日志] INFO: This is a debug message"));
        assertTrue(output.contains("[文件日志] DEBUG: This is a debug message"));
        assertFalse(output.contains("[错误日志]"));
    }

    @Test
    void testErrorLogHandler() {
        // 测试ERROR级别的日志
        consoleLogger.handleLog(ErrorLogHandler.ERROR, "This is an error message");
        String output = outputStream.toString();
        assertTrue(output.contains("[控制台日志] INFO: This is an error message"));
        assertTrue(output.contains("[文件日志] DEBUG: This is an error message"));
        assertTrue(output.contains("[错误日志] ERROR: This is an error message"));
    }

    @Test
    void testChainOrder() {
        // 测试责任链的顺序
        LogHandler customChain = new ErrorLogHandler();
        customChain.setNext(new ConsoleLogHandler()).setNext(new FileLogHandler());

        customChain.handleLog(FileLogHandler.DEBUG, "Test chain order");
        String output = outputStream.toString();
        
        // 验证日志按照链的顺序输出
        int errorIndex = output.indexOf("[错误日志]");
        int consoleIndex = output.indexOf("[控制台日志]");
        int fileIndex = output.indexOf("[文件日志]");
        
        assertTrue(errorIndex < consoleIndex);
        assertTrue(consoleIndex < fileIndex);
    }

    @Test
    void testNullNextHandler() {
        // 测试处理链末端的处理
        LogHandler singleHandler = new ConsoleLogHandler();
        singleHandler.handleLog(ConsoleLogHandler.INFO, "Single handler test");
        String output = outputStream.toString();
        
        assertTrue(output.contains("[控制台日志] INFO: Single handler test"));
        assertEquals(1, output.split("\n").length);
    }
}