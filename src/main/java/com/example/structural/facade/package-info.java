/**
 * 外观模式（Facade Pattern）包
 *
 * 外观模式是一种结构型设计模式，它提供了一个统一的接口，用来访问子系统中的一组接口。
 * 外观模式定义了一个高层接口，这个接口使得子系统更容易使用，它为复杂的子系统提供了一个简单的接口。
 *
 * 主要组成部分：
 * 1. 外观（Facade）：知道哪些子系统类负责处理请求，将客户的请求代理给适当的子系统对象
 * 2. 子系统类（Subsystem Classes）：实现子系统的功能，处理由外观对象指派的任务
 * 3. 客户端（Client）：通过外观接口访问子系统
 *
 * 适用场景：
 * 1. 需要为复杂的子系统提供一个简单的接口时
 * 2. 客户程序与抽象类的实现部分之间存在很大的依赖性时
 * 3. 需要构建一个层次结构的子系统时
 * 4. 想要将子系统组织成层次结构，使用外观模式定义子系统中每层的入口点
 *
 * 优点：
 * 1. 减少系统的相互依赖，提高了安全性
 * 2. 提高了子系统的独立性和可移植性
 * 3. 简化了客户端调用，使得子系统更容易使用
 * 4. 更好地划分访问层次，提供了一个简单的调用接口
 *
 * 注意事项：
 * 1. 外观模式可能会违背开闭原则，增加新的子系统可能需要修改外观类
 * 2. 不能过度使用外观模式，否则会产生一个过度肥大的外观类
 * 3. 外观模式最大的缺点是不能很好地限制客户端直接使用子系统类
 *
 * 本包中的示例通过家庭影院系统展示了外观模式的实现：
 * - HomeTheaterFacade：外观类，提供一键操作家庭影院的简单接口
 * - Projector：子系统类，负责投影仪控制
 * - SoundSystem：子系统类，负责音响系统控制
 * - Screen：子系统类，负责屏幕控制
 */
package com.example.structural.facade;