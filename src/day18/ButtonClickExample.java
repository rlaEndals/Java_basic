package day18;

import javax.swing.*;
import java.awt.event.*;

public class ButtonClickExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("버튼 클릭 이벤트");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("버튼을 눌러보세요!");
        JButton button = new JButton("클릭하세요!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("버튼이 클릭되었습니다");
            }
        });

        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
        // df
    }
}
