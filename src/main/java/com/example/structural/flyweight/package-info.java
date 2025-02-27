/**
 * 享元模式（Flyweight Pattern）包
 *
 * 享元模式是一种结构型设计模式，它通过共享来有效地支持大量细粒度对象的复用。
 * 当系统中存在大量相似对象时，享元模式通过共享相同的内部状态来减少内存使用。
 *
 * 主要组成部分：
 * 1. 享元接口（Flyweight）：定义共享接口，包含内部状态和外部状态的处理方法
 * 2. 具体享元（Concrete Flyweight）：实现享元接口，存储内部状态
 * 3. 享元工厂（Flyweight Factory）：创建和管理享元对象，确保享元对象被共享
 * 4. 客户端（Client）：维护对享元的引用，计算或存储享元的外部状态
 *
 * 适用场景：
 * 1. 一个系统有大量相似的对象，造成很大的内存开销
 * 2. 对象的大多数状态都可以变为外部状态
 * 3. 如果删除对象的外部状态，那么可以用相对较少的共享对象取代很多组对象
 * 4. 应用程序不依赖于对象标识，即具有相同数据的对象可以被视为可互换的
 *
 * 优点：
 * 1. 大大减少系统中对象的数量，节省内存空间
 * 2. 外部状态相对独立，容易随环境改变
 * 3. 共享对象可以独立于不共享对象
 *
 * 注意事项：
 * 1. 需要分离内部状态和外部状态，并且外部状态的存储和传递可能会增加系统的复杂度
 * 2. 享元模式使得系统更加复杂，需要维护享元池
 * 3. 线程安全问题需要特别注意，因为享元对象被多个客户端共享
 *
 * 本包中的示例通过字体渲染系统展示了享元模式的实现：
 * - Font：享元接口，定义字体渲染方法
 * - ConcreteFont：具体享元类，实现字体渲染
 * - FontFactory：享元工厂，管理字体对象的创建和共享
 * - FlyweightDemo：客户端，演示字体对象的共享复用
 */
package com.example.structural.flyweight;