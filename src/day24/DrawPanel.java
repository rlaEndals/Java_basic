package day24;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class DrawPanel extends JPanel implements MouseListener, MouseMotionListener {
    private ArrayList<ArrayList<Point>> lines = new ArrayList<>();
    private ArrayList<Point> currentLine;

    public DrawPanel() {
        this.setBackground(Color.WHITE);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        for (ArrayList<Point> line : lines) {
            for (int i = 1; i < line.size(); i++) {
                Point p1 = line.get(i - 1);
                Point p2 = line.get(i);
                g.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
        }
    }

    public void mousePressed(MouseEvent e) {
        currentLine = new ArrayList<>();
        currentLine.add(e.getPoint());
        lines.add(currentLine);
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        currentLine.add(e.getPoint());
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        currentLine.add(e.getPoint());
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}
}