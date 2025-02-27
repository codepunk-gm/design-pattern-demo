/**
 * 抽象工厂模式（Abstract Factory Pattern）包
 *
 * 抽象工厂模式是一种创建型设计模式，它提供了一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 抽象工厂模式通过将产品的创建过程封装在工厂接口中，使得客户端与具体产品的创建过程解耦。
 *
 * 主要组成部分：
 * 1. 抽象工厂（Abstract Factory）：声明一组用于创建产品对象的方法
 * 2. 具体工厂（Concrete Factory）：实现抽象工厂的方法来创建具体产品
 * 3. 抽象产品（Abstract Product）：为一类产品声明接口
 * 4. 具体产品（Concrete Product）：实现抽象产品接口的具体产品
 *
 * 适用场景：
 * 1. 一个系统要独立于它的产品的创建、组合和表示时
 * 2. 一个系统需要配置多个产品系列中的一个时
 * 3. 强调一系列相关的产品对象的设计以便进行联合使用时
 * 4. 提供一个产品类库，只想显示它们的接口而不是实现时
 *
 * 优点：
 * 1. 分离了具体的类，使得替换产品系列变得容易
 * 2. 有利于产品的一致性
 * 3. 隔离了具体类的生成，使得客户端不需要知道什么被创建
 *
 * 注意事项：
 * 1. 增加新的产品等级结构很复杂
 * 2. 产品族扩展困难
 * 3. 抽象工厂模式的引入会增加系统的抽象性和理解难度
 *
 * 本包中的示例通过GUI组件展示了抽象工厂模式的实现：
 * - GUIFactory：抽象工厂接口，定义创建按钮和文本框的方法
 * - MacGUIFactory/WindowsGUIFactory：具体工厂，创建特定平台的GUI组件
 * - Button/TextField：抽象产品接口
 * - MacButton/WindowsButton：具体的按钮产品
 * - MacTextField/WindowsTextField：具体的文本框产品
 */
package com.example.creational.abstractfactory;