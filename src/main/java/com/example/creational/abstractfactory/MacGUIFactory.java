package com.example.creational.abstractfactory;

/**
 * 具体工厂：Mac风格GUI工厂
 * 实现了GUIFactory接口，负责创建Mac风格的UI组件
 */
public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextField createTextField() {
        return new MacTextField();
    }
}