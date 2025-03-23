package day17;

import java.awt.*;
import javax.swing.*;

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
        JList<String> list = new JList<>(fruits);

        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(500, 400));

        frame.add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
