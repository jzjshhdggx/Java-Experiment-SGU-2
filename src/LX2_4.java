/**
 * 实验二 四、使用修饰符：静态成员与实例成员的区别。
 */
public class LX2_4 {
    public static void main(String[] args) {
        System.out.println("静态变量 x=" + StaticDemo.getX());
        // System.out.println("实例变量 y=" + StaticDemo.getY()); // 非法：静态上下文不能引用非静态方法，编译时将出错
        StaticDemo a = new StaticDemo();
        StaticDemo b = new StaticDemo();
        a.setX(1);
        a.setY(2);
        b.setX(3);
        b.setY(4);
        System.out.println("静态变量 a.x=" + a.getX());
        System.out.println("实例变量 a.y=" + a.getY());
        System.out.println("静态变量 b.x=" + b.getX());
        System.out.println("实例变量 b.y=" + b.getY());
    }
}

class StaticDemo {
    static int x;
    int y;

    public static int getX() {
        return x;
    }

    public static void setX(int newX) {
        x = newX;
    }

    public int getY() {
        return y;
    }

    public void setY(int newY) {
        y = newY;
    }
}
