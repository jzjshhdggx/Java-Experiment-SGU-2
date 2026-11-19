/**
 * 实验二 六、类的继承性练习：子类 LX2_8 继承父类 LX2_7_P。
 */
class LX2_8 extends LX2_7_P {
    protected String xy; // 学院
    protected String xi; // 系

    public static void main(String[] args) {
        LX2_7_P p1 = new LX2_7_P();
        p1.setdata("帅零", 12321);
        p1.print();

        LX2_8 s1 = new LX2_8();
        s1.setdata("郭丽娜", 12345); // 调用父类的成员方法
        s1.xy = "经济管理学院";      // 访问本类的成员变量
        s1.xi = "信息管理系";        // 访问本类的成员变量
        s1.print();
        System.out.print(s1.xm + "," + s1.xy + "," + s1.xi);
    }
}
