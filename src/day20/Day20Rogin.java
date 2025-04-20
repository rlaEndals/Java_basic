package day20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Day20Rogin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("로그인 폼");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 10, 10));
        frame.setLocationRelativeTo(null);

        JLabel userLabel = new JLabel("사용자 이름:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("비밀번호:");
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("로그인");
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    messageLabel.setText("로그인 성공!");
                } else {
                    messageLabel.setText("로그인 실패.다시 시도하세요.");
                }
            }
        });
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(messageLabel);

        frame.setVisible(true);
    }
}
