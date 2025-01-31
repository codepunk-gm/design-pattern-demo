package com.example.behavioral.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 命令模式单元测试类
 * 测试遥控器系统中的命令执行、撤销和重做功能
 */
public class RemoteControlTest {
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;
    private RemoteControl remoteControl;
    private Light light;

    @BeforeEach
    void setUp() {
        // 保存原始的标准输出流并创建新的输出流用于测试
        originalOut = System.out;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // 初始化遥控器和电灯
        remoteControl = new RemoteControl();
        light = new Light("客厅"); // 创建Light实例时需要指定位置名称
    }

    @Test
    void testLightOnCommand() {
        // 测试开灯命令
        Command lightOn = new LightOnCommand(light);
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        String output = outputStream.toString();
        assertTrue(output.contains("灯已打开"));
    }

    @Test
    void testLightOffCommand() {
        // 测试关灯命令
        Command lightOff = new LightOffCommand(light);
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();

        String output = outputStream.toString();
        assertTrue(output.contains("灯已关闭"));
    }

    @Test
    void testCommandSequence() {
        // 测试命令序列执行
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();

        String output = outputStream.toString();
        assertTrue(output.contains("灯已打开"));
        assertTrue(output.contains("灯已关闭"));
        
        // 验证命令执行顺序
        int onIndex = output.indexOf("灯已打开");
        int offIndex = output.indexOf("灯已关闭");
        assertTrue(onIndex < offIndex);
    }

    @Test
    void testUndoCommand() {
        // 测试命令撤销功能
        Command lightOn = new LightOnCommand(light);
        remoteControl.setCommand(lightOn);
        
        remoteControl.pressButton(); // 执行开灯
        remoteControl.pressUndo(); // 撤销开灯

        String output = outputStream.toString();
        assertTrue(output.contains("灯已打开"));
        assertTrue(output.contains("灯已关闭")); // 撤销开灯会执行关灯
    }

    @Test
    void testNullCommand() {
        // 测试空命令处理
        remoteControl.pressButton(); // 未设置命令时按下按钮
        String output = outputStream.toString();
        assertTrue(output.isEmpty()); // 应该没有输出
    }
}