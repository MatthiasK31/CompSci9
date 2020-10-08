/*
Matthias Kim
Lab 9.1
5/7/20
 */

import java.awt.*;
import javax.swing.*;

class lab91 extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //set the background color
        setBackground(Color.black);
        /*
        //1a.
        // set fill and border color, then draw the rectangle
        g.setColor(Color.cyan);
        g.fillRect(40,30, 100, 300);
        g.setColor(Color.white);
        g.drawRect(40,30,100,300);

        //1b.
        //draw a red rect, border is black; subtracted the x coordinates and y coordinates
        //to determine how tall/wide it would be

        g.setColor(Color.red);
        g.fillRect(40,30, 110, 120);
        g.setColor(Color.yellow);
        g.drawRect(40, 30, 110, 120);


        //1c.
        //draw a circle with a radius of 25px
        g.setColor(Color.green);
        g.fillOval(100,100, 25,25);
        g.setColor(Color.cyan);
        g.drawOval(100,100,25,25);

        //1d.
        //set font, set color, print words
        Font timesBold15 = new Font("Times New Roman", Font.PLAIN , 15);
        g.setColor(Color.ORANGE);
        g.setFont(timesBold15);
        g.drawString("Graphics are easy in Java!", 200,200);



        ///////////////////

        setBackground(Color.BLUE);
        Color newOrange = new Color(255, 126, 0);
        g.setColor(newOrange);

        //draw circles going down
        g.fillOval(20, 20, 60, 60);
        g.fillOval(20, 90, 60, 60);
        g.fillOval(20, 160, 60, 60);
        g.fillOval(20, 230, 60, 60);

        //draw circles going across
        g.fillOval(90, 230, 60, 60);
        g.fillOval(160, 230, 60, 60);
        g.fillOval(230, 230, 60, 60);

        Font arialBold70 = new Font ("Arial", Font.BOLD, 65);
        g.setFont(arialBold70);
        g.drawString("Go", 145, 115);
        g.drawString("Team!", 97, 185);
        */

        //set background
        setBackground(Color.WHITE);

        //draw two rectangles
        g.setColor(Color.orange);
        //first rect, 100% scale
        g.fillRect(0,0, 140,200);
        g.setColor(Color.blue);
        //second rec,t 50% scale
        g.fillRect(0,0, 70, 100);

        //draw two squares
        g.setColor(Color.RED);
        //first square, 100% scale
        g.fillRect(236, 0, 264, 264);
        g.setColor(Color.GREEN);
        //second square, 37.5% scale
        g.fillRect(401,0, 99,99);

        //draw two circles
        g.setColor(Color.cyan);
        //first circle, 100% scale
        g.fillOval(25, 220, 220, 220);
        g.setColor(Color.black);
        //second circle, 50% scale
        g.fillOval(80, 275, 110,110);


    }
    public static void main(String [] args){
        lab91 d = new lab91();
        JFrame f = new JFrame("Display Graphic Drawings");
        f.add(d);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

}
