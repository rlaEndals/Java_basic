package day17;

import javax.swing.*;
import java.awt.*;

public class JTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        JButton button = new JButton("확인");

        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);
    }
}
