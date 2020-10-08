/*
Matthias Kim
Lab 9.4
5/29/20
Extra: drew another cylinder upside down for each
 */

import javax.swing.*;
import java.awt.*;

public class lab94 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        //part 1, draw a pink box with blue outlines
        //set color
        g.setColor(Color.pink);
        //draw pink parallelograms/trapezoids
        int [] x = {0, 35, 155, 120};
        int [] y = {45, 10, 10, 45};
        g.fillPolygon(x, y, 4);

        int [] a = {35, 0, 0, 35};
        int [] b = {45, 45, 125, 90};
        g.fillPolygon(a, b, 4);

        int [] c = {0, 35, 120, 120};
        int [] d = {125, 90, 90, 125};
        g.fillPolygon(c, d, 4);

        int [] e = {120, 155, 155, 120};
        int [] f = {45, 5, 90, 125};
        g.fillPolygon(e, f, 4);


        //use lines to make the edges of the shape
        g.setColor(Color.blue);
        g2.setStroke(new BasicStroke(5));
        //box 1
        g.drawLine(0, 45, 35, 10);
        g.drawLine(35,10, 155, 10);
        g.drawLine(155,10, 120, 45);
        g.drawLine(120, 45, 0, 45);
        //box 2
        g.drawLine(0, 45, 0, 125);
        g.drawLine(0, 125, 35, 90);
        g.drawLine(35, 90, 35, 45);
        g.drawLine(35, 45, 0, 45);
        //box 3
        g.drawLine(0, 125, 35, 90);
        g.drawLine(35, 90, 120, 90);
        g.drawLine(120, 90, 120, 125);
        g.drawLine(120, 125, 0, 125);
        //box 4
        g.drawLine(120, 45, 155, 10);
        g.drawLine(155, 10, 155, 90);
        g.drawLine(155, 90, 120, 125);
        g.drawLine(120, 125, 120, 45);


        //part 2, green box with circles

        g.setColor(Color.green);
        g.drawRect(0, 140, 175, 150);
        g.fillRect(0, 140, 175, 150);

        g.setColor(Color.black);
        g2.setStroke(new BasicStroke(3));
        g.drawLine(0, 140, 175, 290);

        int coordinateX = 45, coordinateY = 175, width = 35;

        for (int i = 0; i < 2; i++){
            if (i == 1){
                coordinateX = 110; coordinateY = 230;
            }
            g.setColor(Color.black);
            drawCenteredCircle(g, coordinateX, coordinateY, width);
            coordinateX += 10; coordinateY += 10;
            g.setColor(Color.blue);
            drawCenteredCircle(g, coordinateX, coordinateY, width);
        }

        //part 3, draw cylinders
        g.setColor(Color.blue);
        g2.setStroke(new BasicStroke(5));
        g.drawOval(200, 10, 105, 35);
        g.drawLine(200, 23, 200, 125);
        g.drawLine(305, 23, 305, 125);
        g.drawOval(200, 115, 105, 35);
        //extra
        g.drawLine(200, 125, 200, 215);
        g.drawLine(305, 125, 305, 215);
        g.drawOval(200, 205, 105, 35);

        g.drawOval(315, 10, 105, 35);
        g.drawLine(315, 23, 336, 130);
        g.drawLine(420, 23, 399, 130);
        g.drawOval(336, 124, 63, 25);
        //extra
        g.drawLine(336, 130, 315, 237);
        g.drawLine(399, 130, 420, 237);
        g.drawOval(315, 228, 105, 35);


    }

    public void drawCenteredCircle(Graphics g, int x, int y, int r) {
        x = x-(r/2);
        y = y-(r/2);
        g.drawOval(x, y, r,r);
        g.fillOval(x,y,r,r);
    }

    public static void main(String [] args){
        lab94 d = new lab94();
        JFrame c = new JFrame("Display Graphic Drawings");
        c.add(d);
        c.setSize(500,500);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }
}
