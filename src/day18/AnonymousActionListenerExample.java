package day18;

import javax.swing.*;
import java.awt.event.*;

public class AnonymousActionListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("익명 ActionListener 사용");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("클릭하세요!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("익명 클래스에서 버튼 클릭 이벤트 처리!");
            }
        });

         panel.add(button);
         frame.add(panel);
         frame.setVisible(true);
    }
}
