/**
 * 策略模式（Strategy Pattern）包
 *
 * 策略模式是一种行为型设计模式，它定义了一系列算法，并将每个算法封装起来，使它们可以相互替换。
 * 策略模式让算法可以独立于使用它的客户端而变化。
 *
 * 主要组成部分：
 * 1. 策略接口（Strategy）：定义所有支持的算法的公共接口
 * 2. 具体策略（Concrete Strategy）：实现了策略接口的具体算法
 * 3. 上下文（Context）：维护一个对策略对象的引用，负责将客户端请求委派给具体的策略对象
 *
 * 适用场景：
 * 1. 当一个类定义了多种行为，并且这些行为在这个类的操作中以多个条件语句的形式出现时
 * 2. 当需要使用一个算法的不同变体时
 * 3. 当算法涉及到与算法相关的复杂数据结构，希望将其隐藏起来时
 * 4. 当类的行为在运行时需要动态改变时
 *
 * 优点：
 * 1. 算法可以自由切换
 * 2. 避免使用多重条件判断
 * 3. 扩展性良好，增加新的策略很方便
 *
 * 注意事项：
 * 1. 策略类的数目会增多，可以使用享元模式来优化
 * 2. 所有策略类都需要对外暴露
 * 3. Context和Strategy之间的通信开销
 *
 * 本包中的示例通过支付场景展示了策略模式的实现：
 * - PaymentStrategy：定义支付策略接口
 * - CreditCardPayment：实现信用卡支付策略
 * - 其他具体支付策略类
 */
package com.example.behavioral.strategy;