package day22;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Day21KeyboardEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("키보드 이벤트 예제");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setText("키를 눌러보세요!");
        textArea.setEditable(false);

        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                textArea.setText("keyTyped: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                textArea.setText("keyPressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                textArea.setText("keyReleased: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        frame.add(textArea);
        frame.setVisible(true);
    }
}
