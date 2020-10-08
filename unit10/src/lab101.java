/*
Matthias Kim
Lab 9.4
5/29/20
Extra: put an image in when the random numbers were the same (in #4)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class lab101 implements ActionListener{
    JFrame frm = new JFrame("Lab 10.1");
    JPanel content = new JPanel();

    JLabel notMagic;

    static JButton english;
    static JButton spanish;
    static JLabel dog;
    static JLabel perro;

    static JButton JB1,JB2,JB3,JB4;
    static int rg,rg2;
    static JLabel ran,ran2,T2,T1,T3, Z;
    static JButton A; //varriables
    static JLabel T;
    static JLabel C;
    static ImageIcon streamer = new ImageIcon("C:\\ImageFolder\\popper.png");
    
    public void guiLab(){
        frm.add(content);
        content.setLayout(null);

        //PART 1
        JLabel movieTitle = new JLabel("Star Wars: Episode V");
        content.add(movieTitle);
        movieTitle.setHorizontalAlignment(JLabel.CENTER);
        movieTitle.setFont(new Font ("Courier New", Font.PLAIN, 20));

        //PART 2
        //make new buttons and label
        JB1 = new JButton("Now You See It!");
        JB1.setHorizontalAlignment(JButton.CENTER);
        JB2 = new JButton("Now You Don't!");
        notMagic = new JLabel("<html>MAGIC!<br></html>");
        notMagic.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        notMagic.setVisible(false);

        //attach actions to these buttons
        JB1.addActionListener(this);
        JB2.addActionListener(this);

        //add the label and buttons to the content
        content.add(notMagic);
        content.add(JB1);
        content.add(JB2);

        //PART 3
        //add buttons and labels
        english = new JButton("  English  ");
        english.setForeground(Color.blue);
        english.setBounds(225, 100, 150, 30);

        dog = new JLabel("Dog");


        spanish = new JButton(" Spanish ");
        spanish.setForeground(Color.red);
        spanish.setBounds(225, 160, 50, 30);

        perro = new JLabel("Perro");

        content.add(dog);
        content.add(english);
        content.add(perro);
        content.add(spanish);

        //part 4
        //Creating new random numbers that will check if one number is the same as the other
        T3 = new JLabel("You Win the Big Prize!");
        T3.setLocation(10,60);
        T3.setSize(285, 50);
        T3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        T3.setVisible(false);

        ran = new JLabel("Random number 1:");
        ran.setLocation(10, 10);
        ran.setSize(130, 15);
        JB3 = new JButton("Click me!");
        JB3.setLocation(10, 35);
        JB3.setSize(90, 30);


        //set locations of the items
        ran2 = new JLabel("Random number 2:");
        ran2.setLocation(145, 10);
        ran2.setSize(130, 15);
        JB4 = new JButton("Click me!");
        JB4.setLocation(145, 35);
        JB4.setSize(90, 30);

        //extra is here
        Z = new JLabel("hallo");
        Z.setLocation(35,95);
        Z.setSize(200, 200);

        JB3.addActionListener(this);
        JB4.addActionListener(this);
        content.add(ran);
        content.add(JB3);
        content.add(ran2);
        content.add(JB4);
        content.add(T3);
        content.add(Z);



        A = new JButton("Roll");
        C = new JLabel("bonjour");

        A.addActionListener(this::actionPerformed);

        A.setLocation(10,50);
        A.setSize(100, 30);
        C.setLocation(150,20);
        C.setSize(100, 100);

        //add these to the jpanel
        content.add(A);
        content.add(C);

        T = new JLabel("Roll the dice!"); //magic label
        T.setLocation(10,10);
        T.setSize(300,30);
        content.add(T);

        //make window properties
        frm.setSize(500,500);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        Random rand = new Random();
        //for part 2
        if (e.getSource() == JB1) {
            notMagic.setVisible(true);
        }
        else if (e.getSource() == JB2) {
            System.exit(0);
        }
       if(e.getSource()==JB1) {
           T1.setVisible(true);
       } else if(e.getSource()==JB2) {
           T1.setVisible(false);
       }
       if(e.getSource()==JB1) {
           T1.setVisible(false);
           T2.setVisible(true);
       }
       else if(e.getSource()==JB2){
           T1.setVisible(true);
           T2.setVisible(false);
       }

       //buttons for part 4
       if(e.getSource()==JB3) {
           rg = (rand.nextInt(10) + 1);
           JB3.setText(Integer.toString(rg));
       }
       else if(e.getSource()==JB4) {
           rg2 = (rand.nextInt(10) + 1);
           JB4.setText(Integer.toString(rg2));
       }
       //draw a popper if the numbers are the same
       if(rg == rg2){
           //extra
           T3.setVisible(true);
           Z.setIcon(streamer);
           Z.setVisible(true);
       }


       //part 5
        ImageIcon die1 = new ImageIcon("C:\\DiceFolder\\die1.jpg");
        ImageIcon die2 = new ImageIcon("C:\\DiceFolder\\die2.jpg");
        ImageIcon die3 = new ImageIcon("C:\\DiceFolder\\die3.jpg");
        ImageIcon die4 = new ImageIcon("C:\\DiceFolder\\die4.jpg");
        ImageIcon die5 = new ImageIcon("C:\\DiceFolder\\die5.jpg");
        ImageIcon die6 = new ImageIcon("C:\\DiceFolder\\die6.jpg");

        //choose a different image depending on what number is generated
        if (e.getSource() == A) {
            int rndNum = rand.nextInt(6) + 1;
            if (rndNum == 1) {
                C.setIcon(die1);
            }else if (rndNum == 2) {
                C.setIcon(die2);
            }else if (rndNum == 3) {
                C.setIcon(die3);
            }else if (rndNum == 4) {
                C.setIcon(die4);
            }else if (rndNum == 5) {
                C.setIcon(die5);
            }else {
                C.setIcon(die6);
            }
        }else {
            System.out.println("That was unexpected!");
        }
    }

    public static void main(String [] args){
        //run the method that holds all the code
        lab101 template = new lab101();
        template.guiLab();

    }
}
