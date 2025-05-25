package day24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Day24Grimfan {
    public static void main(String[] args) {
        JFrame frame = new JFrame("그림판");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel drawPanel = new DrawPanel();
        frame.add(drawPanel);

        frame.setVisible(true);
    }
}