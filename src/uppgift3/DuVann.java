package uppgift3;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

public class DuVann {
    
    public void speletÄrLöst(ArrayList<JButton> buttonList, JLabel meddelandeLabel) {

        if (buttonList.get(0).getText().equals("1") && buttonList.get(1).getText().equals("2")
               && buttonList.get(2).getText().equals("3") && buttonList.get(3).getText().equals("4")
                && buttonList.get(4).getText().equals("5") && buttonList.get(5).getText().equals("6")
                && buttonList.get(6).getText().equals("7") && buttonList.get(7).getText().equals("8")
                && buttonList.get(8).getText().equals("9") && buttonList.get(9).getText().equals("10")
                && buttonList.get(10).getText().equals("11") && buttonList.get(11).getText().equals("12")
                && buttonList.get(12).getText().equals("13") && buttonList.get(13).getText().equals("14")
                && buttonList.get(14).getText().equals("15") && buttonList.get(15).getText().equals("")
                ) {
            meddelandeLabel.setText("Grattis, du vann!");
            //System.out.println("Grattis, du vann!");
        }
    }
    
}
