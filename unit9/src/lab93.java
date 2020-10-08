/*
Matthias Kim
Lab 9.3
5/19/20
Extra: used a for loop to draw all the circles instead of individually drawing them
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab93 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //#1
        //set the background color
        Color white = new Color(255, 255, 255);
        setBackground(Color.black);

        //draw the house (rectangle and windows)
        g.setColor(Color.red);
        g.fillRect(0, 70, 165, 75);

        //draw the roof with black lines
        g.setColor(Color.white);
        g.drawLine(0, 70, 80, 0);
        g.drawLine(80, 0, 165, 70);

        //draw the yellow windows and door
        g.setColor(Color.YELLOW);
        g.fillRect(27, 90, 25, 25);
        g.fillRect(70, 105, 35, 40);
        g.fillRect(115, 90, 25, 25);

        /////////////////////////////
        //#2

        g.setColor(Color.white);
        g.fillRect(0, 155, 230, 125);

        //create new colors, for loop to draw 3 circles
        Color lightBlue = new Color(0, 144, 255);
        Color gold = new Color(255, 210, 64);
        Color jadeGreen = new Color(53, 191, 46);

        //create new increasing x and y value
        int changeX = 10;
        int changeY = 165;

        //extra
        //for loop to draw 3 circles but change color every time
        for (int i = 0; i < 5; i++) {
            //draw the first 3 circles by increasing x value and changing color at i placement
            //draw last two circles by changing y value and x value and incrementing x after that
            if (i == 0) {
                g.setColor(lightBlue);
            } else if (i == 1) {
                g.setColor(Color.black);
            } else if (i == 2) {
                g.setColor(Color.red);
            } else if (i == 3) {
                g.setColor(gold);
                changeX = 40;
                changeY = 195;
            } else if (i == 4) {
                g.setColor(jadeGreen);
            }
            g.drawOval(changeX, changeY, 60, 60);

            changeX += 70;
        }

        ////////////////////////////////
        //#3

        g.setColor(Color.yellow);
        g.fillOval(0, 290, 150, 150);

        g.setColor(Color.blue);
        g.fillOval(30, 330, 35, 35);
        g.fillOval(95, 330, 35, 35);

        //nose
        g.setColor(Color.black);
        g.fillOval(75, 350,10, 35);

        //mouth color
        g.setColor(Color.pink);
        g.fillArc(50, 375, 55, 45,0, -180);

    }


    public static void main(String [] args){
        lab93 d = new lab93();
        JFrame c = new JFrame("Display Graphic Drawings");
        c.add(d);
        c.setSize(500,500);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }
}
