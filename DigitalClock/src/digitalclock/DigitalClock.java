package digitalclock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame {

    JLabel jlabClock;
    ClockThread ct;

    public DigitalClock() {
        jlabClock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabClock.setFont(new Font("Arial", Font.CENTER_BASELINE, 18));
        jlabClock.setOpaque(true);
        jlabClock.setBackground(Color.BLACK);
        jlabClock.setForeground(Color.WHITE);
        add(jlabClock);
        setSize(290, 70);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        DigitalClock digitalClock = new DigitalClock();
    }

}
