package uppgift3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Uppgift3 extends JFrame {

    //variables:
    //Nytt Spel knapp
    private JButton nyttSpelKnapp;
    private JPanel nyttSpelPanel = new JPanel();
    //pussel
    private JButton b1, b2, b3, b4, b5, b6, b7, b8;
    private JButton b9, b10, b11, b12, b13, b14, b15, tommaPlatsen;
    private JPanel pusselPanel = new JPanel();
    //meddelande
    private JLabel meddelandeLabel;
    private JPanel meddelandePanel = new JPanel();

    //constructor
    public Uppgift3() {
        //main Layout for all panels
        setLayout(new GridBagLayout());
        GridBagConstraints mainLayout = new GridBagConstraints();
        mainLayout.fill = GridBagConstraints.HORIZONTAL;
        mainLayout.gridx = 0;
        mainLayout.gridy = 0;
        add(nyttSpelPanel, mainLayout);
        mainLayout.fill = GridBagConstraints.HORIZONTAL;
        mainLayout.gridx = 0;
        mainLayout.gridy = 1;
        add(pusselPanel, mainLayout);
        mainLayout.fill = GridBagConstraints.HORIZONTAL;
        mainLayout.gridx = 0;
        mainLayout.gridy = 2;
        add(meddelandePanel, mainLayout);
        getContentPane().setBackground(Color.WHITE);

        //layout for nyttSpelPanel
        nyttSpelPanel.setLayout(new GridBagLayout());
        GridBagConstraints c1 = new GridBagConstraints();
        nyttSpelPanel.setBackground(Color.WHITE);
        //nyttSpelKnapp
        nyttSpelKnapp = new JButton("Nytt Spel");
        c1.fill = GridBagConstraints.HORIZONTAL;
        c1.gridx = 0;
        c1.gridy = 0;
        nyttSpelPanel.add(nyttSpelKnapp, c1);

        //layout for pusselPanel
        pusselPanel.setLayout(new GridBagLayout());
        GridBagConstraints c2 = new GridBagConstraints();
        pusselPanel.setBackground(Color.WHITE);
        //Button1
        b1 = new JButton("1");
        b1.setBackground(Color.PINK);
        b1.setPreferredSize(new Dimension(80, 80));
        b1.setForeground(Color.GRAY);
        b1.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 0;
        c2.gridy = 0;
        pusselPanel.add(b1, c2);
        //Button2
        b2 = new JButton("2");
        b2.setBackground(Color.PINK);
        b2.setPreferredSize(new Dimension(80, 80));
        b2.setForeground(Color.GRAY);
        b2.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 1;
        c2.gridy = 0;
        pusselPanel.add(b2, c2);
        //Button3
        b3 = new JButton("3");
        b3.setBackground(Color.PINK);
        b3.setPreferredSize(new Dimension(80, 80));
        b3.setForeground(Color.GRAY);
        b3.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 2;
        c2.gridy = 0;
        pusselPanel.add(b3, c2);
        //Button4
        b4 = new JButton("4");
        b4.setBackground(Color.PINK);
        b4.setPreferredSize(new Dimension(80, 80));
        b4.setForeground(Color.GRAY);
        b4.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 3;
        c2.gridy = 0;
        pusselPanel.add(b4, c2);
        //Button5
        b5 = new JButton("5");
        b5.setBackground(Color.PINK);
        b5.setPreferredSize(new Dimension(80, 80));
        b5.setForeground(Color.GRAY);
        b5.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 0;
        c2.gridy = 1;
        pusselPanel.add(b5, c2);
        //Button6
        b6 = new JButton("6");
        b6.setBackground(Color.PINK);
        b6.setPreferredSize(new Dimension(80, 80));
        b6.setForeground(Color.GRAY);
        b6.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 1;
        c2.gridy = 1;
        pusselPanel.add(b6, c2);
        //Button7
        b7 = new JButton("7");
        b7.setBackground(Color.PINK);
        b7.setPreferredSize(new Dimension(80, 80));
        b7.setForeground(Color.GRAY);
        b7.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 2;
        c2.gridy = 1;
        pusselPanel.add(b7, c2);
        //Button8
        b8 = new JButton("8");
        b8.setBackground(Color.PINK);
        b8.setPreferredSize(new Dimension(80, 80));
        b8.setForeground(Color.GRAY);
        b8.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 3;
        c2.gridy = 1;
        pusselPanel.add(b8, c2);
        //Button9
        b9 = new JButton("9");
        b9.setBackground(Color.PINK);
        b9.setPreferredSize(new Dimension(80, 80));
        b9.setForeground(Color.GRAY);
        b9.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 0;
        c2.gridy = 2;
        pusselPanel.add(b9, c2);
        //Button10
        b10 = new JButton("10");
        b10.setBackground(Color.PINK);
        b10.setPreferredSize(new Dimension(80, 80));
        b10.setForeground(Color.GRAY);
        b10.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 1;
        c2.gridy = 2;
        pusselPanel.add(b10, c2);
        //Button11
        b11 = new JButton("11");
        b11.setBackground(Color.PINK);
        b11.setPreferredSize(new Dimension(80, 80));
        b11.setForeground(Color.GRAY);
        b11.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 2;
        c2.gridy = 2;
        pusselPanel.add(b11, c2);
        //Button12
        b12 = new JButton("12");
        b12.setBackground(Color.PINK);
        b12.setPreferredSize(new Dimension(80, 80));
        b12.setForeground(Color.GRAY);
        b12.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 3;
        c2.gridy = 2;
        pusselPanel.add(b12, c2);
        //Button13
        b13 = new JButton("13");
        b13.setBackground(Color.PINK);
        b13.setPreferredSize(new Dimension(80, 80));
        b13.setForeground(Color.GRAY);
        b13.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 0;
        c2.gridy = 3;
        pusselPanel.add(b13, c2);
        //Button14
        b14 = new JButton("14");
        b14.setBackground(Color.PINK);
        b14.setPreferredSize(new Dimension(80, 80));
        b14.setForeground(Color.GRAY);
        b14.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 1;
        c2.gridy = 3;
        pusselPanel.add(b14, c2);
        //Button15
        b15 = new JButton("15");
        b15.setBackground(Color.PINK);
        b15.setPreferredSize(new Dimension(80, 80));
        b15.setForeground(Color.GRAY);
        b15.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 2;
        c2.gridy = 3;
        pusselPanel.add(b15, c2);
        //tommaPlatsen
        tommaPlatsen = new JButton("");
        tommaPlatsen.setBackground(Color.WHITE);
        tommaPlatsen.setPreferredSize(new Dimension(80, 80));
        tommaPlatsen.setForeground(Color.GRAY);
        tommaPlatsen.setFont(new Font("Arial", Font.PLAIN, 40));
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 3;
        c2.gridy = 3;
        pusselPanel.add(tommaPlatsen, c2);

        //layout for meddelandePanel
        meddelandePanel.setBackground(Color.WHITE);
        //meddelandePanel.setOpaque(true);
        meddelandePanel.setLayout(new GridBagLayout());
        GridBagConstraints c3 = new GridBagConstraints();
        meddelandeLabel = new JLabel("Grattis, du vann!");
        meddelandeLabel.setBackground(Color.WHITE);
        meddelandeLabel.setOpaque(true);
        meddelandeLabel.setForeground(Color.GRAY);
        meddelandeLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        c3.fill = GridBagConstraints.HORIZONTAL;
        c3.gridx = 0;
        c3.gridy = 0;
        meddelandePanel.add(meddelandeLabel, c3);

    }

    public static void main(String[] args) {
        Uppgift3 gui = new Uppgift3();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        //gui.pack();
        gui.setSize(500, 500);
        gui.setTitle("Femton Pusselspel");
    }

}
