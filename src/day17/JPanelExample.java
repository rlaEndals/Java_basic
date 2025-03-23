package day17;


import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label =  new JLabel("안녕하세요!");
        JButton button = new JButton("클릭해주세요!");

        panel.add(label);
        panel.add(button);

        frame.add(panel);

        frame.setVisible(true);
    }
}
