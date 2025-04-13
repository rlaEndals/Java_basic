package day19;
import javax.swing.*;
import java.awt.*;

public class Day19BorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        frame.add(new JButton("북"), BorderLayout.NORTH);
        frame.add(new JButton("남"), BorderLayout.SOUTH);
        frame.add(new JButton("동"), BorderLayout.EAST);
        frame.add(new JButton("서"), BorderLayout.WEST);
        frame.add(new JButton("중앙"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
