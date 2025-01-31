# Java设计模式示例项目

本项目包含23种设计模式的Java实现，每个模式都包含详细的说明文档和示例代码。

## 环境要求

- JDK 8 或更高版本
- Maven 3.6.0 或更高版本

## 快速开始

1. 克隆项目
```bash
git clone https://github.com/sgm/design-pattern-demo.git
```

2. 进入项目目录
```bash
cd design-pattern-demo
```

3. 编译项目
```bash
mvn clean install
```

## 项目结构

设计模式分为三大类：

### 1. 创建型模式（Creational Patterns）
- 单例模式（Singleton Pattern）
- 工厂方法模式（Factory Method Pattern）
- 抽象工厂模式（Abstract Factory Pattern）
- 建造者模式（Builder Pattern）
- 原型模式（Prototype Pattern）

### 2. 结构型模式（Structural Patterns）
- 适配器模式（Adapter Pattern）
- 桥接模式（Bridge Pattern）
- 组合模式（Composite Pattern）
- 装饰器模式（Decorator Pattern）
- 外观模式（Facade Pattern）
- 享元模式（Flyweight Pattern）
- 代理模式（Proxy Pattern）

### 3. 行为型模式（Behavioral Patterns）
- 责任链模式（Chain of Responsibility Pattern）
- 命令模式（Command Pattern）
- 解释器模式（Interpreter Pattern）
- 迭代器模式（Iterator Pattern）
- 中介者模式（Mediator Pattern）
- 备忘录模式（Memento Pattern）
- 观察者模式（Observer Pattern）
- 状态模式（State Pattern）
- 策略模式（Strategy Pattern）
- 模板方法模式（Template Method Pattern）
- 访问者模式（Visitor Pattern）

## 项目说明

每个设计模式的包中都包含：
1. 设计模式的原理说明（package-info.java）
2. 适用场景分析
3. 通俗易懂的示例代码
4. 详细的代码注释
5. 完整的单元测试

## 如何使用

每个模式都是独立的包，您可以直接查看对应包下的示例代码和说明文档。代码中包含完整的注释，帮助您理解设计模式的实现原理和使用方法。

### 运行示例

每个设计模式包中都包含一个Demo类，您可以直接运行这个类来查看示例的运行效果。例如：

```bash
mvn exec:java -Dexec.mainClass="com.example.creational.singleton.SingletonDemo"
```

## 如何贡献

1. Fork 本仓库
2. 创建您的特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交您的改动 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 打开一个 Pull Request

## 代码规范

- 遵循阿里巴巴Java开发手册规范
- 所有代码都必须包含适当的注释
- 确保提交前代码已经通过单元测试

## 许可证

本项目采用 MIT 许可证，详情请参见 [LICENSE](LICENSE) 文件。

## 联系方式

如果您有任何问题或建议，欢迎提出 Issue 或直接联系作者。

## 致谢

感谢所有为这个项目做出贡献的开发者！