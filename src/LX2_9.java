/**
 * 实验二 六、类的继承性练习：方法覆盖（覆盖 Object 类的 toString 方法）。
 */
class Circle {
    private int radius;

    Circle(int r) {
        setRadius(r);
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double area() {
        return 3.14159 * radius * radius;
    }

    public String toString() {
        return "圆半径：" + getRadius() + " 圆面积：" + area();
    }
}

public class LX2_9 {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("\n" + c.toString());
    }
}
