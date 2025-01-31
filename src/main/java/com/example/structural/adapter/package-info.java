/**
 * 适配器模式（Adapter Pattern）包
 *
 * 适配器模式是一种结构型设计模式，它允许将一个类的接口转换成客户端所期望的另一个接口。
 * 适配器让原本由于接口不兼容而不能一起工作的类可以一起工作。
 *
 * 主要组成部分：
 * 1. 目标接口（Target）：客户端所期望的接口
 * 2. 适配器（Adapter）：将源接口转换成目标接口的类
 * 3. 源类（Adaptee）：需要被适配的类，包含了客户端希望使用的功能，但其接口与客户端期望的不一致
 *
 * 适用场景：
 * 1. 想使用一个已经存在的类，但其接口与你的需求不匹配
 * 2. 需要创建一个可以复用的类，该类可以与其他不相关或不可预见的类协同工作
 * 3. 需要使用一些已经存在的子类，但不可能对每一个子类都进行接口适配
 *
 * 优点：
 * 1. 可以让任何两个没有关联的类一起运行
 * 2. 提高了类的复用性
 * 3. 增加了类的透明度
 * 4. 灵活性好
 *
 * 注意事项：
 * 1. 过多使用适配器会让系统非常混乱
 * 2. 由于JAVA至多继承一个类，所以至多只能适配一个适配者类
 * 3. 适配器模式的设计思想是亡羊补牢，不是优秀的设计方案
 *
 * 本包中的示例通过媒体播放器展示了适配器模式的实现：
 * - MediaPlayer：目标接口，定义客户端使用的播放方法
 * - AdvancedMediaPlayer：源接口，定义高级播放器的功能
 * - MediaAdapter：适配器，将高级播放器接口转换为标准播放器接口
 * - VlcPlayer/Mp4Player：具体的高级播放器实现
 */
package com.example.structural.adapter;