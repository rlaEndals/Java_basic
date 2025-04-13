package day19;

import javax.swing.*;
import java.awt.*;

public class Day19BoxLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JButton("버튼 1"));
        panel.add(new JButton("버튼 2"));
        panel.add(new JButton("버튼 3"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
