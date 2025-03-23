package day17;

import javax.swing.*;

public class JButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel 예제");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("안녕하세요!");
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }
}
