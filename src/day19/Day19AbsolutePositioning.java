package day19;

import javax.swing.*;
import java.awt.*;

public class Day19AbsolutePositioning {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Absolute Positioning Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button1 = new JButton("버튼 1");
        button1.setBounds(50, 30, 100, 30);
        frame.add(button1);

        JButton button2 = new JButton("버튼 2");
        button2.setBounds(150, 70, 100, 30);
        frame.add(button2);

        frame.setVisible(true);
        // lk
    }
}
