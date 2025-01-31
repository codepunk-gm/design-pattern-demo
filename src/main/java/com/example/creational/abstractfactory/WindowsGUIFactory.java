package com.example.creational.abstractfactory;

/**
 * 具体工厂：Windows风格GUI工厂
 * 实现了GUIFactory接口，负责创建Windows风格的UI组件
 */
public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}