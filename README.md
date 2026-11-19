# 韶关学院Java实验课2

韶关学院《Java 语言程序设计》实验二：**面向对象程序设计**。

## 实验内容与源码

| 实验内容 | 源文件 | 说明 |
| --- | --- | --- |
| 一、创建 Applet 应用小程序 | `src/LX2_1.java` | 简单加法运算，包含类、接口、属性、方法、事件；页面文件 `html/LX2_1.html` |
| 二、创建对象并使用对象 | `src/LX2_2.java` | 自定义 `MyBox` 类，分别用无参/带参构造方法创建对象并绘制矩形 |
| 三、显示当前日期和时间 | `src/LX2_3.java` | 自定义 `Time` 类，通过 `Calendar` 获取日期时间；页面文件 `html/LX2_3.html` |
| 四、使用修饰符 | `src/LX2_4.java` | 静态变量/方法与实例变量/方法的区别 |
| 五、方法中参数传递 | `src/LX2_5.java`、`src/LX2_6.java` | 传值调用与调用对象方法的区别 |
| 六、类的继承性 | `src/LX2_7_P.java`、`src/LX2_8.java`、`src/LX2_9.java`、`src/LX2_10.java` | 继承、成员变量隐藏、方法覆盖、`this`/`super`/`super()` |
| 七、类的多态性 | `src/LX2_11.java`、`src/LX2_12.java` | 方法重载、构造方法重载；页面文件 `html/LX2_11.html` |
| 八、思考题 | `docs/思考题.md` | 四道思考题的解答 |

## 运行环境

- **JDK 17**（本项目的 IDEA Project SDK 已设置为 17）。
- `java.applet` 包在 JDK 27 中已被移除，因此 Applet 程序必须使用 JDK 17 编译运行，否则会提示“程序包 java.applet 不存在”。
- 三个 Applet 类（`LX2_1`、`LX2_2`、`LX2_3`、`LX2_11`）都额外提供了 `main()` 方法，用 `JFrame` 承载 Applet，可直接在 IDEA 中点击运行，无需 `appletviewer`。

## 运行方式

在 IDEA 中打开对应源文件，点击 `main()` 方法左侧的绿色运行按钮即可。

也可以在命令行中编译、运行（在项目根目录执行）：

```bash
JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
"$JAVA_HOME/bin/javac" -encoding UTF-8 -d out src/*.java
"$JAVA_HOME/bin/java" -cp out LX2_4
```

## 运行结果

```text
# LX2_4 使用修饰符
静态变量 x=0
静态变量 a.x=3
实例变量 a.y=2
静态变量 b.x=3
实例变量 b.y=4

# LX2_5 传值调用
passX=100, passY=100
x=10, y=10

# LX2_6 调用对象方法
初始时 x=10, y=10
方法调用中 x=100, y=100
方法调用后 x=100, y=100

# LX2_8 类的继承
帅零,12321
郭丽娜,12345
郭丽娜,经济管理学院,信息管理系

# LX2_9 方法覆盖
圆半径：10 圆面积：314.159

# LX2_10 this、super
直线端点：[50,50] [100,100] 直线长度：70.71067811865476

# LX2_12 构造方法的重载
全部为空!
用户名不能为空！ 口令无效！
用户名：张驰 口令：********
```

Applet 程序运行后：

- `LX2_1`：两个文本框分别输入 25、17，单击“相加”，结果框显示 42。
- `LX2_2`：绘制两个 60×60 的矩形，并显示两个矩形左上角的 X、Y 坐标。
- `LX2_3`：显示当前日期和当前时间。
- `LX2_11`：显示两个数、三个数和数组的排序结果。
