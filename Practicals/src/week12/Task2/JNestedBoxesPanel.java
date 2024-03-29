package week12.Task2;

import javax.swing.*;
import java.awt.*;

public class JNestedBoxesPanel extends JPanel {
    int sideLength = 4;
    int sizeIncrement = 14;
    int numSquares = 20;

    public JNestedBoxesPanel() {
        repaint();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (int i=0; i <= numSquares; i++){
            g.setColor(Color.BLUE);
            g.drawRect((getWidth() - sideLength)/2, (getHeight() - sideLength)/2, sideLength, sideLength);
            sideLength += sizeIncrement;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new JNestedBoxesPanel());
        frame.setPreferredSize(new Dimension(500,500));
        frame.pack();
    }
}
