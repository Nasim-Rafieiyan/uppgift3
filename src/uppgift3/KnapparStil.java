package uppgift3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;

//to syle our buttons (b1-b15)
public class KnapparStil {

    public void knapparStilMetod(ArrayList<JButton> buttonList) {

        for (int i = 0; i < buttonList.size(); i++) {

            buttonList.get(i).setFocusPainted(false);
            buttonList.get(i).setBackground(Color.PINK);
            buttonList.get(i).setPreferredSize(new Dimension(80, 80));
            buttonList.get(i).setForeground(Color.GRAY);
            buttonList.get(i).setFont(new Font("Arial", Font.PLAIN, 40));

        }
    }

}
