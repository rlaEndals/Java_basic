package day19;

import javax.swing.*;
import java.awt.*;

public class Day19FlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));

        frame.add(new JButton("버튼 1"));
        frame.add(new JButton("버튼 2"));
        frame.add(new JButton("버튼 3"));

        frame.setVisible(true);
    }
}
