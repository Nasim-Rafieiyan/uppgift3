package uppgift3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Uppgift3 extends JFrame {

    //variables
    private JButton b1, b2, b3, b4, b5, b6, b7, b8;
    private JButton b9, b10, b11, b12, b13, b14, b15, bEmpty;

    //constructor
    public Uppgift3() {
        //To set GridBagLayout as our layout
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        //Button1
        b1 = new JButton("1");
        b1.setBackground(Color.PINK);
        b1.setPreferredSize(new Dimension(80, 80));
        b1.setForeground(Color.GRAY);
        b1.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        add(b1, c);
        //Button2
        b2 = new JButton("2");
        b2.setBackground(Color.PINK);
        b2.setPreferredSize(new Dimension(80, 80));
        b2.setForeground(Color.GRAY);
        b2.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        add(b2, c);
        //Button3
        b3 = new JButton("3");
        b3.setBackground(Color.PINK);
        b3.setPreferredSize(new Dimension(80, 80));
        b3.setForeground(Color.GRAY);
        b3.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        add(b3, c);
        //Button4
        b4 = new JButton("4");
        b4.setBackground(Color.PINK);
        b4.setPreferredSize(new Dimension(80, 80));
        b4.setForeground(Color.GRAY);
        b4.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 0;
        add(b4, c);
        //Button5
        b5 = new JButton("5");
        b5.setBackground(Color.PINK);
        b5.setPreferredSize(new Dimension(80, 80));
        b5.setForeground(Color.GRAY);
        b5.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        add(b5, c);
        //Button6
        b6 = new JButton("6");
        b6.setBackground(Color.PINK);
        b6.setPreferredSize(new Dimension(80, 80));
        b6.setForeground(Color.GRAY);
        b6.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        add(b6, c);
        //Button7
        b7 = new JButton("7");
        b7.setBackground(Color.PINK);
        b7.setPreferredSize(new Dimension(80, 80));
        b7.setForeground(Color.GRAY);
        b7.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 1;
        add(b7, c);
        //Button8
        b8 = new JButton("8");
        b8.setBackground(Color.PINK);
        b8.setPreferredSize(new Dimension(80, 80));
        b8.setForeground(Color.GRAY);
        b8.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 1;
        add(b8, c);
        //Button5
        b9 = new JButton("9");
        b9.setBackground(Color.PINK);
        b9.setPreferredSize(new Dimension(80, 80));
        b9.setForeground(Color.GRAY);
        b9.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        add(b9, c);
        //Button10
        b10 = new JButton("10");
        b10.setBackground(Color.PINK);
        b10.setPreferredSize(new Dimension(80, 80));
        b10.setForeground(Color.GRAY);
        b10.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        add(b10, c);
        //Button11
        b11 = new JButton("11");
        b11.setBackground(Color.PINK);
        b11.setPreferredSize(new Dimension(80, 80));
        b11.setForeground(Color.GRAY);
        b11.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 2;
        add(b11, c);
        //Button11
        b12 = new JButton("12");
        b12.setBackground(Color.PINK);
        b12.setPreferredSize(new Dimension(80, 80));
        b12.setForeground(Color.GRAY);
        b12.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 2;
        add(b12, c);
        //Button13
        b13 = new JButton("13");
        b13.setBackground(Color.PINK);
        b13.setPreferredSize(new Dimension(80, 80));
        b13.setForeground(Color.GRAY);
        b13.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        add(b13, c);
        //Button14
        b14 = new JButton("14");
        b14.setBackground(Color.PINK);
        b14.setPreferredSize(new Dimension(80, 80));
        b14.setForeground(Color.GRAY);
        b14.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        add(b14, c);
        //Button15
        b15 = new JButton("15");
        b15.setBackground(Color.PINK);
        b15.setPreferredSize(new Dimension(80, 80));
        b15.setForeground(Color.GRAY);
        b15.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 3;
        add(b15, c);
        //Button Empty
        bEmpty = new JButton("");
        bEmpty.setBackground(Color.PINK);
        bEmpty.setPreferredSize(new Dimension(80, 80));
        bEmpty.setForeground(Color.GRAY);
        bEmpty.setFont(new Font("Arial", Font.PLAIN, 40));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 3;
        add(bEmpty, c);

    }

    public static void main(String[] args) {
        Uppgift3 gui = new Uppgift3();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(500, 600);
        gui.setTitle("Femton Pusselspel");

    }

}
