package uppgift3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JButton;

public class BlandaKnappar {

    public void blandaKnapparMetod(String[] bT, ArrayList<JButton> bL) {

        Collections.shuffle(Arrays.asList(bT));
        for (int i = 0; i < bT.length; i++) {
            for (int j = 0; j < bL.size(); j++) {
                bL.get(j).setText(bT[j]);
            }
        }
    }

}
