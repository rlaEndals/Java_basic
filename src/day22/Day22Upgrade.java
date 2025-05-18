package day22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Day22Upgrade {
    public static void main(String[] args) {
        JFrame frame = new JFrame("계산기");
        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        JTextField display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 50));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);

        display.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isDigit(keyChar) || "+=*/.".indexOf(keyChar) != -1) {
                    display.setText(display.getText() + keyChar);
                } else if (keyChar == '\n') {
                    try {
                        String result= String.valueOf(eval(display.getText()));
                        display.setText(result);
                    } catch (Exception ex) {
                        display.setText("오류");
                    }
                } else if (keyChar == '\b') {
                    String currentText = display.getText();
                    if (!currentText.isEmpty()) {
                        display.setText(currentText.substring(0, currentText.length() -1));
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            buttonPanel.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();

                    if (command.equals("C")) {
                        display.setText("");
                    } else if (command.equals("=")) {
                        try {
                            String result = String.valueOf(eval(display.getText()));
                            display.setText(result);
                        } catch (Exception ex) {
                            display.setText("오류");
                        }
                    } else {
                        display.setText(display.getText() + command);
                    }
                }
            });
        }
        frame.add(display, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
    // 수식 계산 메서드
    private static double eval(String expression) {
        char[] tokens = expression.toCharArray();
        double result = 0;
        double currentNumber = 0;
        char lastOperator = '+';

        for (int i = 0; i < tokens.length; i++) {
            char token = tokens[i];

            if (Character.isDigit(token)) {
                currentNumber = currentNumber * 10 + (token - '0');
            }

            if (!Character.isDigit(token) && token != ' ' || i == tokens.length - 1) {
                switch (lastOperator) {
                    case '+':
                        result += currentNumber;
                        break;
                    case '-':
                        result -= currentNumber;
                        break;
                    case '*':
                        result *= currentNumber;
                        break;
                    case '/':
                        result /= currentNumber;
                        break;
                }

                lastOperator = token;
                currentNumber = 0;
            }
        }

        return (double) Math.round(result * 1000000) / 1000000;
    }
}
