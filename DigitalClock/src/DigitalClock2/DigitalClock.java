package DigitalClock2;

import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame{
    JLabel jlabClock;
    ClockThread ct;
    public DigitalClock(){
        jlabClock=new JLabel();
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabClock.setOpaque(true);
        jlabClock.setBackground(Color.BLACK);
        jlabClock.setForeground(Color.WHITE);
        jlabClock.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        setSize(320, 70);
        setLocationRelativeTo(null);
        add(jlabClock);
        ct=new ClockThread(this);
        setVisible(true);
    }
    public static void main(String[] args) {
        new DigitalClock();
    }
}
