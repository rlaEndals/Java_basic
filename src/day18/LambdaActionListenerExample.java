package day18;

import javax.swing.*;

public class LambdaActionListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("람다 표현식 사용");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("클릭하세요!");

        button.addActionListener(e -> System.out.println("람다 표현식으로 버튼 클릭 이벤트 처리!"));


        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
