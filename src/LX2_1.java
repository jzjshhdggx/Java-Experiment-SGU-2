import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.JFrame;

/**
 * 实验二 一、创建 Applet 应用小程序：简单的加法运算。
 * 说明：java.applet 在 JDK 27 中已被移除，本项目按实验要求使用 Applet API，
 * 需使用 JDK 17（项目 SDK）编译；main() 用 JFrame 承载 Applet，便于在 IDEA 中直接运行。
 */
@SuppressWarnings("removal")
public class LX2_1 extends Applet implements ActionListener {
    Label label1 = new Label("+");
    Label label2 = new Label("=");
    TextField field1 = new TextField(6);
    TextField field2 = new TextField(6);
    TextField field3 = new TextField(6);
    Button button1 = new Button("相加");

    public void init() { // 初始化
        add(field1);
        add(label1);
        add(field2);
        add(label2);
        add(field3);
        add(button1);
        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) { // 处理按钮事件
        int x = Integer.parseInt(field1.getText())
                + Integer.parseInt(field2.getText());
        field3.setText(Integer.toString(x)); // 数值转换为字符串
    }

    public static void main(String[] args) {
        LX2_1 applet = new LX2_1();
        applet.init();
        JFrame frame = new JFrame("LX2_1 加法 Applet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(applet);
        frame.setSize(420, 120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
