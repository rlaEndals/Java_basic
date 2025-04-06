package day18;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

class MyAction implements ActionListener {

    int count = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("count: " + ++count);
    }
}
public class Day18ActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("직접 ActionListener 구현");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JButton button = new JButton("클릭하세요!");

        MyAction myAction = new MyAction();

        button.addActionListener(myAction);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
