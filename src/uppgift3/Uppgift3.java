package uppgift3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Uppgift3 extends JFrame {

    //variables:
    //Nytt Spel knapp
    private JButton nyttSpelKnapp;
    private JLabel tomRad;
    private JPanel nyttSpelPanel = new JPanel();
    //pussel
    private JButton b1, b2, b3, b4, b5, b6, b7, b8;
    private JButton b9, b10, b11, b12, b13, b14, b15, tommaPlatsen;
    private String[] buttomText = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
    private ArrayList<JButton> buttonList = new ArrayList<JButton>();
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
        nyttSpelKnapp.setFocusPainted(false);
        nyttSpelKnapp.setBackground(Color.GRAY);
        nyttSpelKnapp.setPreferredSize(new Dimension(110, 30));
        nyttSpelKnapp.setForeground(Color.PINK);
        nyttSpelKnapp.setFont(new Font("Arial", Font.BOLD, 16));
        c1.fill = GridBagConstraints.HORIZONTAL;
        c1.gridx = 0;
        c1.gridy = 0;
        nyttSpelPanel.add(nyttSpelKnapp, c1);
        tomRad = new JLabel("  ");
        c1.fill = GridBagConstraints.HORIZONTAL;
        c1.gridx = 0;
        c1.gridy = 1;
        nyttSpelPanel.add(tomRad, c1);

        //layout for pusselPanel
        pusselPanel.setBackground(Color.WHITE);
        //create buttons
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        b10 = new JButton();
        b11 = new JButton();
        b12 = new JButton();
        b13 = new JButton();
        b14 = new JButton();
        b15 = new JButton();
        //add buttons to buttonList (ArrayList)
        buttonList.add(b1);
        buttonList.add(b2);
        buttonList.add(b3);
        buttonList.add(b4);
        buttonList.add(b5);
        buttonList.add(b6);
        buttonList.add(b7);
        buttonList.add(b8);
        buttonList.add(b9);
        buttonList.add(b10);
        buttonList.add(b11);
        buttonList.add(b12);
        buttonList.add(b13);
        buttonList.add(b14);
        buttonList.add(b15);
        pusselPanel.setLayout(new GridBagLayout());
        GridBagConstraints c2 = new GridBagConstraints();

        //styling buttons (b1-b15)
        KnapparStil bm = new KnapparStil();
        bm.knapparStilMetod(buttonList);

        //adding buttons
        for (int i = 0; i < buttonList.size(); i++) {
            c2.fill = GridBagConstraints.HORIZONTAL;
            if (i <= 3) {
                c2.gridx = i;
                c2.gridy = 0;
            } else if (i >= 4 && i <= 7) {
                c2.gridx = i - 4;
                c2.gridy = 1;
            } else if (i >= 8 && i <= 11) {
                c2.gridx = i - 8;
                c2.gridy = 2;
            } else if (i >= 12 && i <= 15) {
                c2.gridx = i - 12;
                c2.gridy = 3;
            }
            pusselPanel.add(buttonList.get(i), c2);
        }

        //shuffle buttons
        BlandaKnappar bk = new BlandaKnappar();
        bk.blandaKnapparMetod(buttomText, buttonList);

        //Tomma Platsen
        tommaPlatsen = new JButton("");
        tommaPlatsen.setPreferredSize(new Dimension(80, 80));
        //tommaPlatsen.setBorderPainted(false);
        tommaPlatsen.setForeground(Color.GRAY);
        tommaPlatsen.setFont(new Font("Arial", Font.PLAIN, 40));
        tommaPlatsen.setBackground(Color.WHITE);
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx = 3;
        c2.gridy = 3;
        pusselPanel.add(tommaPlatsen, c2);

        //layout for meddelandePanel
        meddelandePanel.setBackground(Color.WHITE);
        meddelandePanel.setOpaque(true);
        meddelandePanel.setLayout(new GridBagLayout());
        GridBagConstraints c3 = new GridBagConstraints();
        meddelandeLabel = new JLabel("");
        meddelandeLabel.setBackground(Color.WHITE);
        meddelandeLabel.setOpaque(true);
        meddelandeLabel.setForeground(Color.GRAY);
        meddelandeLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        c3.fill = GridBagConstraints.HORIZONTAL;
        c3.gridx = 0;
        c3.gridy = 0;
        meddelandePanel.add(meddelandeLabel, c3);

        EventNew eNew = new EventNew();
        nyttSpelKnapp.addActionListener(eNew);

        Event1 e1 = new Event1();
        b1.addActionListener(e1);

        Event2 e2 = new Event2();
        b2.addActionListener(e2);

        Event3 e3 = new Event3();
        b3.addActionListener(e3);

        Event4 e4 = new Event4();
        b4.addActionListener(e4);

        Event5 e5 = new Event5();
        b5.addActionListener(e5);

        Event6 e6 = new Event6();
        b6.addActionListener(e6);

        Event7 e7 = new Event7();
        b7.addActionListener(e7);

        Event8 e8 = new Event8();
        b8.addActionListener(e8);

        Event9 e9 = new Event9();
        b9.addActionListener(e9);

        Event10 e10 = new Event10();
        b10.addActionListener(e10);

        Event11 e11 = new Event11();
        b11.addActionListener(e11);

        Event12 e12 = new Event12();
        b12.addActionListener(e12);

        Event13 e13 = new Event13();
        b13.addActionListener(e13);

        Event14 e14 = new Event14();
        b14.addActionListener(e14);

        Event15 e15 = new Event15();
        b15.addActionListener(e15);

        Event16 e16 = new Event16();
        tommaPlatsen.addActionListener(e16);
    }

    public class EventNew implements ActionListener {

        public void actionPerformed(ActionEvent eNew) {
            //shuffle buttons
            BlandaKnappar bk = new BlandaKnappar();
            bk.blandaKnapparMetod(buttomText, buttonList);
        }
    }

    public class Event1 implements ActionListener {

        public void actionPerformed(ActionEvent e1) {
            if (b2.getText().equals("")) {
                b2.setText(b1.getText());
                b1.setText("");
                b2.setBackground(b1.getBackground());
                b1.setBackground(Color.WHITE);
            } else if (b5.getText().equals("")) {
                b5.setText(b1.getText());
                b1.setText("");
                b5.setBackground(b1.getBackground());
                b1.setBackground(Color.WHITE);
            }

            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event2 implements ActionListener {

        public void actionPerformed(ActionEvent e2) {
            if (b1.getText().equals("")) {
                b1.setText(b2.getText());
                b2.setText("");
                b1.setBackground(b2.getBackground());
                b2.setBackground(Color.WHITE);
            } else if (b3.getText().equals("")) {
                b3.setText(b2.getText());
                b2.setText("");
                b3.setBackground(b2.getBackground());
                b2.setBackground(Color.WHITE);
            } else if (b6.getText().equals("")) {
                b6.setText(b2.getText());
                b2.setText("");
                b6.setBackground(b2.getBackground());
                b2.setBackground(Color.WHITE);
            }

            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event3 implements ActionListener {

        public void actionPerformed(ActionEvent e3) {
            if (b2.getText().equals("")) {
                b2.setText(b3.getText());
                b3.setText("");
                b2.setBackground(b3.getBackground());
                b3.setBackground(Color.WHITE);
            } else if (b4.getText().equals("")) {
                b4.setText(b3.getText());
                b3.setText("");
                b4.setBackground(b3.getBackground());
                b3.setBackground(Color.WHITE);
            } else if (b7.getText().equals("")) {
                b7.setText(b3.getText());
                b3.setText("");
                b7.setBackground(b3.getBackground());
                b3.setBackground(Color.WHITE);
            }

            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event4 implements ActionListener {

        public void actionPerformed(ActionEvent e4) {
            if (b3.getText().equals("")) {
                b3.setText(b4.getText());
                b4.setText("");
                b3.setBackground(b4.getBackground());
                b4.setBackground(Color.WHITE);
            } else if (b8.getText().equals("")) {
                b8.setText(b4.getText());
                b4.setText("");
                b8.setBackground(b4.getBackground());
                b4.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event5 implements ActionListener {

        public void actionPerformed(ActionEvent e5) {
            if (b1.getText().equals("")) {
                b1.setText(b5.getText());
                b5.setText("");
                b1.setBackground(b5.getBackground());
                b5.setBackground(Color.WHITE);
            } else if (b6.getText().equals("")) {
                b6.setText(b5.getText());
                b5.setText("");
                b6.setBackground(b5.getBackground());
                b5.setBackground(Color.WHITE);
            } else if (b9.getText().equals("")) {
                b9.setText(b5.getText());
                b5.setText("");
                b9.setBackground(b5.getBackground());
                b5.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event6 implements ActionListener {

        public void actionPerformed(ActionEvent e6) {
            if (b2.getText().equals("")) {
                b2.setText(b6.getText());
                b6.setText("");
                b2.setBackground(b6.getBackground());
                b6.setBackground(Color.WHITE);
            } else if (b5.getText().equals("")) {
                b5.setText(b6.getText());
                b6.setText("");
                b5.setBackground(b6.getBackground());
                b6.setBackground(Color.WHITE);
            } else if (b7.getText().equals("")) {
                b7.setText(b6.getText());
                b6.setText("");
                b7.setBackground(b6.getBackground());
                b6.setBackground(Color.WHITE);
            } else if (b10.getText().equals("")) {
                b10.setText(b6.getText());
                b6.setText("");
                b10.setBackground(b6.getBackground());
                b6.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event7 implements ActionListener {

        public void actionPerformed(ActionEvent e7) {
            if (b3.getText().equals("")) {
                b3.setText(b7.getText());
                b7.setText("");
                b3.setBackground(b7.getBackground());
                b7.setBackground(Color.WHITE);
            } else if (b6.getText().equals("")) {
                b6.setText(b7.getText());
                b7.setText("");
                b6.setBackground(b7.getBackground());
                b7.setBackground(Color.WHITE);
            } else if (b8.getText().equals("")) {
                b8.setText(b7.getText());
                b7.setText("");
                b8.setBackground(b7.getBackground());
                b7.setBackground(Color.WHITE);
            } else if (b11.getText().equals("")) {
                b11.setText(b7.getText());
                b7.setText("");
                b11.setBackground(b7.getBackground());
                b7.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event8 implements ActionListener {

        public void actionPerformed(ActionEvent e8) {
            if (b4.getText().equals("")) {
                b4.setText(b8.getText());
                b8.setText("");
                b4.setBackground(b8.getBackground());
                b8.setBackground(Color.WHITE);
            } else if (b7.getText().equals("")) {
                b7.setText(b8.getText());
                b8.setText("");
                b7.setBackground(b8.getBackground());
                b8.setBackground(Color.WHITE);
            } else if (b12.getText().equals("")) {
                b12.setText(b8.getText());
                b8.setText("");
                b12.setBackground(b8.getBackground());
                b8.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event9 implements ActionListener {

        public void actionPerformed(ActionEvent e9) {
            if (b5.getText().equals("")) {
                b5.setText(b9.getText());
                b9.setText("");
                b5.setBackground(b9.getBackground());
                b9.setBackground(Color.WHITE);
            } else if (b10.getText().equals("")) {
                b10.setText(b9.getText());
                b9.setText("");
                b10.setBackground(b9.getBackground());
                b9.setBackground(Color.WHITE);
            } else if (b13.getText().equals("")) {
                b13.setText(b9.getText());
                b9.setText("");
                b13.setBackground(b9.getBackground());
                b9.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event10 implements ActionListener {

        public void actionPerformed(ActionEvent e10) {
            if (b6.getText().equals("")) {
                b6.setText(b10.getText());
                b10.setText("");
                b6.setBackground(b10.getBackground());
                b10.setBackground(Color.WHITE);
            } else if (b9.getText().equals("")) {
                b9.setText(b10.getText());
                b10.setText("");
                b9.setBackground(b10.getBackground());
                b10.setBackground(Color.WHITE);
            } else if (b11.getText().equals("")) {
                b11.setText(b10.getText());
                b10.setText("");
                b11.setBackground(b10.getBackground());
                b10.setBackground(Color.WHITE);
            } else if (b14.getText().equals("")) {
                b14.setText(b10.getText());
                b10.setText("");
                b14.setBackground(b10.getBackground());
                b10.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event11 implements ActionListener {

        public void actionPerformed(ActionEvent e11) {
            if (b7.getText().equals("")) {
                b7.setText(b11.getText());
                b11.setText("");
                b7.setBackground(b11.getBackground());
                b11.setBackground(Color.WHITE);
            } else if (b10.getText().equals("")) {
                b10.setText(b11.getText());
                b11.setText("");
                b10.setBackground(b11.getBackground());
                b11.setBackground(Color.WHITE);
            } else if (b12.getText().equals("")) {
                b12.setText(b11.getText());
                b11.setText("");
                b12.setBackground(b11.getBackground());
                b11.setBackground(Color.WHITE);
            } else if (b15.getText().equals("")) {
                b15.setText(b11.getText());
                b11.setText("");
                b15.setBackground(b11.getBackground());
                b11.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event12 implements ActionListener {

        public void actionPerformed(ActionEvent e12) {
            if (b8.getText().equals("")) {
                b8.setText(b12.getText());
                b12.setText("");
                b8.setBackground(b12.getBackground());
                b12.setBackground(Color.WHITE);
            } else if (b11.getText().equals("")) {
                b11.setText(b12.getText());
                b12.setText("");
                b11.setBackground(b12.getBackground());
                b12.setBackground(Color.WHITE);
            } else if (tommaPlatsen.getText().equals("")) {
                tommaPlatsen.setText(b12.getText());
                b12.setText("");
                tommaPlatsen.setBackground(b12.getBackground());
                b12.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event13 implements ActionListener {

        public void actionPerformed(ActionEvent e13) {
            if (b9.getText().equals("")) {
                b9.setText(b13.getText());
                b13.setText("");
                b9.setBackground(b13.getBackground());
                b13.setBackground(Color.WHITE);
            } else if (b14.getText().equals("")) {
                b14.setText(b13.getText());
                b13.setText("");
                b14.setBackground(b13.getBackground());
                b13.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event14 implements ActionListener {

        public void actionPerformed(ActionEvent e14) {
            if (b10.getText().equals("")) {
                b10.setText(b14.getText());
                b14.setText("");
                b10.setBackground(b14.getBackground());
                b14.setBackground(Color.WHITE);
            } else if (b13.getText().equals("")) {
                b13.setText(b14.getText());
                b14.setText("");
                b13.setBackground(b14.getBackground());
                b14.setBackground(Color.WHITE);
            } else if (b15.getText().equals("")) {
                b15.setText(b14.getText());
                b14.setText("");
                b15.setBackground(b14.getBackground());
                b14.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event15 implements ActionListener {

        public void actionPerformed(ActionEvent e15) {
            if (b11.getText().equals("")) {
                b11.setText(b15.getText());
                b15.setText("");
                b11.setBackground(b15.getBackground());
                b15.setBackground(Color.WHITE);
            } else if (b14.getText().equals("")) {
                b14.setText(b15.getText());
                b15.setText("");
                b14.setBackground(b15.getBackground());
                b15.setBackground(Color.WHITE);
            } else if (tommaPlatsen.getText().equals("")) {
                tommaPlatsen.setText(b15.getText());
                b15.setText("");
                tommaPlatsen.setBackground(b15.getBackground());
                b15.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
    }

    public class Event16 implements ActionListener {

        public void actionPerformed(ActionEvent e15) {
            if (b12.getText().equals("")) {
                b12.setText(tommaPlatsen.getText());
                tommaPlatsen.setText("");
                b12.setBackground(tommaPlatsen.getBackground());
                tommaPlatsen.setBackground(Color.WHITE);
            } else if (b15.getText().equals("")) {
                b15.setText(tommaPlatsen.getText());
                tommaPlatsen.setText("");
                b15.setBackground(tommaPlatsen.getBackground());
                tommaPlatsen.setBackground(Color.WHITE);
            }
            DuVann al = new DuVann();
            al.speletÄrLöst(buttonList, meddelandeLabel);
        }
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
