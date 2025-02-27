/**
 * 代理模式（Proxy Pattern）包
 *
 * 代理模式是一种结构型设计模式，它为其他对象提供一种代理以控制对这个对象的访问。
 * 代理模式在访问对象时引入一定程度的间接性，可以用来实现权限控制、延迟加载、日志记录等功能。
 *
 * 主要组成部分：
 * 1. 抽象主题（Subject）：定义代理类和真实主题的共同接口，这样在任何使用真实主题的地方都可以使用代理
 * 2. 真实主题（Real Subject）：定义代理所代表的真实对象，是最终要引用的对象
 * 3. 代理（Proxy）：保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口
 *
 * 适用场景：
 * 1. 远程代理：为一个位于不同的地址空间的对象提供一个本地的代理对象
 * 2. 虚拟代理：根据需要创建开销很大的对象，通过它来存放实例化需要很长时间的真实对象
 * 3. 安全代理：用来控制真实对象访问时的权限
 * 4. 智能指引：调用真实的对象时，代理处理另外一些事情
 *
 * 优点：
 * 1. 职责清晰，真实主题就是实现实际的业务逻辑，不用关心其他非本职责的事务
 * 2. 高扩展性，代理类完全可以在不修改原有代码的情况下，增加新的功能
 * 3. 智能化，动态代理可以在运行时才确定代理的对象
 *
 * 注意事项：
 * 1. 代理模式会造成系统设计中类的数量增加
 * 2. 在客户端和目标对象之间增加代理对象，会造成请求处理速度变慢
 * 3. 增加了系统的复杂度，需要额外的代理类和接口
 *
 * 本包中的示例通过图片加载系统展示了代理模式的实现：
 * - Image：抽象主题，定义图片加载的接口
 * - RealImage：真实主题，实现实际的图片加载
 * - ProxyImage：代理类，控制对RealImage的访问
 */
package com.example.structural.proxy;