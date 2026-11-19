import java.awt.Graphics;
import java.applet.Applet;
import java.util.Calendar;
import javax.swing.JFrame;

/**
 * 实验二 三、编写显示当前日期和时间的程序。
 */
@SuppressWarnings("removal")
public class LX2_3 extends Applet {
    Time t = new Time();

    public void paint(Graphics g) {
        g.drawString("当前日期：" + t.getDate(), 50, 40);
        g.drawString("当前时间：" + t.getTime(), 50, 80);
    }

    public static void main(String[] args) {
        LX2_3 applet = new LX2_3();
        applet.init();
        JFrame frame = new JFrame("LX2_3 当前日期和时间");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(applet);
        frame.setSize(320, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class Time {
    private Calendar t;
    private int y, m, d, hh, mm, ss;

    Time() {
        t = Calendar.getInstance();
        y = t.get(Calendar.YEAR);
        m = t.get(Calendar.MONTH) + 1;
        d = t.get(Calendar.DATE);
        hh = t.get(Calendar.HOUR_OF_DAY);
        mm = t.get(Calendar.MINUTE);
        ss = t.get(Calendar.SECOND);
    }

    public String getDate() {
        return y + "年" + m + "月" + d + "日";
    }

    public String getTime() {
        String s = hh + "时" + mm + "分" + ss + "秒";
        return s;
    }
}
